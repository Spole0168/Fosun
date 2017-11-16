/**
 * 
 */
package com.test.util;

/**
 * 
 *
 * @author 	yunbo.wei
 * @date 	2017年2月28日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年2月28日			新增
 *
 * </pre>
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.util.Assert;

import com.fosun.channel.mq.model.MethodParamModel;
 
/**
 * 反射的Utils函数集合. 提供访问私有变量,获取泛型类型Class,提取集合中元素的属性等Utils函数.
 * 目前主要供给MQ渠道处理使用
 *
 * @author 	yunbo.wei
 * @date 	2017年2月28日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年2月28日			新增
 *
 * </pre>
 */
public class ReflectionUtils {
 
    private static Logger logger = LoggerFactory.getLogger(ReflectionUtils.class);
 
    private ReflectionUtils() {
    }
 
    /**
     * 直接读取对象属性值,无视private/protected修饰符,不经过getter函数.
     */
    public static Object getFieldValue(final Object object, final String fieldName) {
        Field field = getDeclaredField(object, fieldName);
 
        if (field == null)
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
 
        makeAccessible(field);
 
        Object result = null;
        try {
            result = field.get(object);
        } catch (IllegalAccessException e) {
            logger.error("不可能抛出的异常{}", e.getMessage());
        }
        return result;
    }
 
    /**
     * 直接设置对象属性值,无视private/protected修饰符,不经过setter函数.
     */
    public static void setFieldValue(final Object object, final String fieldName, final Object value) {
        Field field = getDeclaredField(object, fieldName);
 
        if (field == null)
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
 
        makeAccessible(field);
 
        try {
            field.set(object, value);
        } catch (IllegalAccessException e) {
            logger.error("不可能抛出的异常:{}", e.getMessage());
        }
    }
 
    /**
     * 循环向上转型,获取对象的DeclaredField.
     */
    protected static Field getDeclaredField(final Object object, final String fieldName) {
        Assert.notNull(object, "object不能为空");
        return getDeclaredField(object.getClass(), fieldName);
    }
 
    /**
     * 循环向上转型,获取类的DeclaredField.
     */
    @SuppressWarnings("unchecked")
    protected static Field getDeclaredField(final Class clazz, final String fieldName) {
        Assert.notNull(clazz, "clazz不能为空");
        Assert.hasText(fieldName, "fieldName");
        for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
            try {
                return superClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                // Field不在当前类定义,继续向上转型
            }
        }
        return null;
    }
 
    /**
     * 强制转换fileld可访问.
     */
    protected static void makeAccessible(final Field field) {
        if (!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
            field.setAccessible(true);
        }
    }
 
    /**
     * 通过反射,获得定义Class时声明的父类的泛型参数的类型. 如public UserDao extends HibernateDao<User>
     * 
     * @param clazz
     *            The class to introspect
     * @return the first generic declaration, or Object.class if cannot be
     *         determined
     */
    @SuppressWarnings("unchecked")
    public static Class getSuperClassGenricType(final Class clazz) {
        return getSuperClassGenricType(clazz, 0);
    }
 
    /**
     * 通过反射,获得定义Class时声明的父类的泛型参数的类型. 如public UserDao extends
     * HibernateDao<User,Long>
     * 
     * @param clazz
     *            clazz The class to introspect
     * @param index
     *            the Index of the generic ddeclaration,start from 0.
     * @return the index generic declaration, or Object.class if cannot be
     *         determined
     */
 
    @SuppressWarnings("unchecked")
    public static Class getSuperClassGenricType(final Class clazz, final int index) {
 
        Type genType = clazz.getGenericSuperclass();
 
        if (!(genType instanceof ParameterizedType)) {
            logger.warn(clazz.getSimpleName() + "'s superclass not ParameterizedType");
            return Object.class;
        }
 
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
 
        if (index >= params.length || index < 0) {
            logger.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: " + params.length);
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            logger.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
            return Object.class;
        }
        return (Class) params[index];
    }
 
    /**
     * 提取集合中的对象的属性,组合成List.
     * 
     * @param collection
     *            来源集合.
     * @param propertityName
     *            要提取的属性名.
     */
    @SuppressWarnings("unchecked")
    public static List fetchElementPropertyToList(final Collection collection, final String propertyName) throws Exception {
 
        List list = new ArrayList();
 
        for (Object obj : collection) {
            list.add(PropertyUtils.getProperty(obj, propertyName));
        }
 
        return list;
    }
 
    /**
     * 根据对象，返回一个class对象，用于获取方法
     */
    public static Class<?> getClass(Object obj) {
        try {
        	String clzName = obj.getClass().getName();
        	if(clzName.contains("$")){
        		//如果对象是spring注入的bean，那么classname是不同的，所以要在此还原到原始的bean
        		clzName = clzName.substring(0,clzName.indexOf("$"));
        	}
            return Class.forName(clzName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    /**
     * 根据对象，获取某个方法
     * 
     * @param obj
     *            对象
     * @param methodName
     *            方法名
     * @param parameterTypes
     *            该方法需传的参数类型，如果不需传参，则不传
     */
    public static Method getMethod(Object obj, String methodName,
            Class<?>... parameterTypes) {
        try {
            Method method = getClass(obj).getDeclaredMethod(methodName,
                    parameterTypes);
            method.setAccessible(true);
            return method;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    /**
     * 根据对象，获取某个方法
     * 
     * @param cls
     *            类型
     * @param methodName
     *            方法名
     * @param parameterTypes
     *            该方法需传的参数类型，如果不需传参，则不传
     */
    public static Method getMethod(Class<?> cls, String methodName,
            Class<?>... parameterTypes) {
        try {
            Method method = cls.getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);
            return method;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    /**
     * 直接传入对象、方法名、参数，即可使用该对象的隐藏方法
     * 
     * @param obj
     * @param methodName
     * @param parameter
     */
    public static Object invoke(Object obj, String methodName,Object[] parameter) {
        Class<?>[] parameterTypes = new Class<?>[parameter.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            parameterTypes[i] = parameter[i].getClass();
        }
        try {
            return getMethod(obj, methodName, parameterTypes).invoke(obj,
                    parameter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    /**
     * 直接传入类名、方法名、参数，即可使用该对象的隐藏静态方法
     * 
     * @param cls
     * @param methodName
     * @param parameter
     */
    public static Object invoke(Class<?> cls, String methodName,Object[] parameter) {
        Class<?>[] parameterTypes = new Class<?>[parameter.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            parameterTypes[i] = parameter[i].getClass();
        }
        try {
            return getMethod(cls, methodName, parameterTypes).invoke(null,
                    parameter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    /**
     * 传入全类名获得对应类中方法的参数名
     * 注意：只能获取公开public方法
     * @throws ClassNotFoundException 
     * @throws SecurityException 
     */
    @SuppressWarnings("rawtypes")
    public static List<MethodParamModel> getMethodParamInfo(Object cls,String targetMethodName) throws SecurityException, ClassNotFoundException {
    	List<MethodParamModel> list = new ArrayList<MethodParamModel>();
    	LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer(); 
    	String clzName = cls.getClass().getName();
    	if(clzName.contains("$")){
    		//如果对象是spring注入的bean，那么classname是不同的，所以要在此还原到原始的bean
    		clzName = clzName.substring(0,clzName.indexOf("$"));
    	}
        Method[] methods = Class.forName(clzName).getDeclaredMethods();
        if(methods != null && methods.length >0){
        	for(Method method : methods){
        		if(method.getName().equals(targetMethodName)){
        			String[] params = u.getParameterNames(method);
        			Type[] types = method.getGenericParameterTypes();
        			logger.info("method=="+method);
        			if(params != null){
        				//有参数
        				Class[] carray = method.getParameterTypes();
        				for (int i = 0; i < params.length; i++) {
        					logger.info("param=="+params[i]);
        					MethodParamModel methodModel = new MethodParamModel();
            	            methodModel.setParamName(params[i]);	//设置方法名
            	            methodModel.setParamClz(carray[i]); //设置方法类型
            	            if(types != null){
            	            	if(types[i] instanceof ParameterizedType){ // 【3】如果是泛型参数的类型   
            	            		ParameterizedType pt = (ParameterizedType) types[i];
                	            	methodModel.setPt(pt); //泛型的实际类型
            	            	}
            	            }
            	            list.add(methodModel);
            	        }
        			}
        	        break;
        		}
        	}
        }
        return list;
    }
    
    
    
    /**
     * 传入全类名获得对应类中方法的参数名
     * 注意：只能获取公开public方法
     * @throws NotFoundException 
     * @throws ClassNotFoundException 
     * @throws SecurityException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
//    @SuppressWarnings("rawtypes")
//    public static List<MethodParamModel> getMethodParamInfo(Object cls,String targetMethodName) throws NotFoundException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//    	List<MethodParamModel> list = new ArrayList<MethodParamModel>();
//    	ClassPool pool = ClassPool.getDefault();
//    	
//    	String clzName = cls.getClass().getName();
//    	logger.info("class name 类名==" + clzName);
//    	logger.info("method name 方法名==" + targetMethodName);
//    	if(clzName.contains("$")){
//    		//如果对象是spring注入的bean，那么classname是不同的，所以要在此还原到原始的bean
//    		clzName = clzName.substring(0,clzName.indexOf("$"));
//    	}
//    	logger.info("class name 类名==" + clzName);
//    	pool.insertClassPath(new ClassClassPath(cls.getClass())); //初始化路径
//    	CtClass cc = pool.get(clzName);
//    	Method[] methods = Class.forName(clzName).newInstance().getClass().getDeclaredMethods();
//    	if(methods != null && methods.length >0){
//    		for(Method method : methods){
//    			logger.info("====methodName====="+method.getName());
//    			if(method.getName().equals(targetMethodName)){
//    				//确认目标方法
//    				Type[] types = method.getGenericParameterTypes();
//    				CtMethod ctm = cc.getDeclaredMethod(targetMethodName);  
//    	             MethodInfo methodInfo = ctm.getMethodInfo();  
//    	             CodeAttribute codeAttribute = methodInfo.getCodeAttribute();  
//    	             LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);  
//    	             if (attr != null) {  
//	    	              int pos = Modifier.isStatic(ctm.getModifiers()) ? 0 : 1;  
//	    	              //有参数
//	    	              Class[] carray = method.getParameterTypes();
//	    	              for (int i = 0; i < ctm.getParameterTypes().length; i++) {
//	    	            	  String paramName = attr.variableName(i + pos);
//	    	            	  logger.info("====paramName====="+paramName);
//	    	            	  MethodParamModel methodModel = new MethodParamModel();
//	    	            	  methodModel.setParamName(paramName);	//设置方法名
//	    	            	  methodModel.setParamClz(carray[i]); //设置方法类型
//	    	            	  if(types != null){
//	    	            		  if(types[i] instanceof ParameterizedType){ // 【3】如果是泛型参数的类型   
//	    	            			  ParameterizedType pt = (ParameterizedType) types[i];
//	    	            			  methodModel.setPt(pt); //泛型的实际类型
//	    	            		  }
//	    	            	  }
//	    	            	  list.add(methodModel);
//	    	              }
//    	              }
//    	             break;
//    			}
//    		}
//    	}
//        return list;
//    }
    
}