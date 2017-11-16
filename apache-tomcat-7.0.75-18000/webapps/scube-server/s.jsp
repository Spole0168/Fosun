<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>SCUBE 服务列表</title>
</head>
<body>
	</br>注册中心版本：V 2.1.1
	</br>注册地址：${registerAddress}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;路由地址：${routerAddress}
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>应用服务列表
	</br> --------------------------------------------------------------------
	</br>
	<c:forEach items="${serviceAddress2serviceListMap}" var="v">
		</br> --------------------------------------------------------------------
		</br>${v.key} -> 【${fn:length(v.value)}个服务】
		<c:forEach items="${v.value}" var="item">
			</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${item}
		</c:forEach>
	</c:forEach>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>已注册应用
	</br> --------------------------------------------------------------------
	<c:forEach items="${serviceAddress2ServiceChannelMap}" var="v">
		</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${v.key} -> ${v.value}
	</c:forEach>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>
	</br>服务地址列表
	</br> --------------------------------------------------------------------
	<c:forEach items="${serviceName2serviceAddressMap}" var="v">
		</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${v.key} -> ${v.value.serviceAddressList}
	</c:forEach>
	</br>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>转发中未完成请求列表
	</br> --------------------------------------------------------------------
	<c:forEach items="${request2ClientChannelMap}" var="v">
		</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${v.key} -> ${v.value.startTime}:${v.value.channel}
	</c:forEach>
	</br>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------

</body>
</html>