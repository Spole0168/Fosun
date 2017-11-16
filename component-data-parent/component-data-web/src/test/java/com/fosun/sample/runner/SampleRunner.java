package com.fosun.sample.runner;

import java.io.File;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.plus.webapp.EnvConfiguration;
import org.mortbay.jetty.webapp.Configuration;
import org.mortbay.jetty.webapp.WebAppContext;
import org.mortbay.thread.QueuedThreadPool;

/**
 * 
 * 无端调用方式，启动发布服务接口的类
 *
 * @author 	shuaixianxian
 * @date 	2016年9月23日
 * @Copyright Shanghai Huateng Software Systems Co., Ltd.
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date			Content
 * shuaixianxian			2016年9月23日			新增
 *
 * </pre>
 */
public class SampleRunner {

	private static Server server = new Server();
	
	/**
	 * 
	 * 主函数，执行此方法发布服务
	 *
	 * @author 	htrad0027
	 * @date 	2016年9月23日 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		QueuedThreadPool boundedThreadPool = new QueuedThreadPool();
		boundedThreadPool.setMaxThreads(5);
		server.setThreadPool(boundedThreadPool);

		Connector connector = new SelectChannelConnector();
		connector.setPort(18080);
		server.addConnector(connector);

		WebAppContext context = new WebAppContext("src/main/webapp", "/component-data");
		context.setDefaultsDescriptor("src/test/resources/webdefault.xml");
		
		EnvConfiguration envConfiguration = new EnvConfiguration();
        envConfiguration.setJettyEnvXml(new File("src/test/resources/jetty/jetty-env.xml").toURI().toURL());
		Configuration[] configurations = new Configuration[]{
		        new org.mortbay.jetty.webapp.WebInfConfiguration(),
		        envConfiguration,
		        new org.mortbay.jetty.plus.webapp.Configuration(),
		        new org.mortbay.jetty.webapp.JettyWebXmlConfiguration(),
		        new org.mortbay.jetty.webapp.TagLibConfiguration()
		};
		context.setConfigurations(configurations);
		
		server.setHandler(context);

		server.setStopAtShutdown(true);
		server.setSendServerVersion(true);

		server.start();
		System.out.println("============================the server is started===========================");
		server.join();
	}
}