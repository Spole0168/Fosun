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
	</br>注册中心版本：2.2.0
	</br>注册地址：${registerAddress}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;路由地址：${routerAddress}
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>应用节点列表
	</br> --------------------------------------------------------------------
	<c:forEach items="${serviceAddress2ServiceChannelMap}" var="appChannel">
		</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${appChannel.key} -> ${appChannel.value}
	</c:forEach>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>应用服务列表
	</br> --------------------------------------------------------------------
	</br>
	<c:forEach items="${serviceAddress2serviceListMap}" var="appServiceList">
		</br> --------------------------------------------------------------------
		</br>${appServiceList.key} -> 【${fn:length(appServiceList.value)}个服务】
		<c:forEach items="${appServiceList.value}" var="service">
			</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${service}
		</c:forEach>
	</c:forEach>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>
	</br>服务地址列表
	</br> --------------------------------------------------------------------
	<c:forEach items="${serviceName2serviceAddressMap}" var="serviceAddress">
		</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${serviceAddress.key} -> ${serviceAddress.value.serviceAddressList}
	</c:forEach>
	</br>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------
	</br>
	</br>
	</br>转发中未完成请求列表
	</br> --------------------------------------------------------------------
	<c:forEach items="${request2ClientChannelMap}" var="requestChannel">
		</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${requestChannel.key} -> ${requestChannel.value.startTime}:${requestChannel.value.channel}
	</c:forEach>
	</br>
	</br> --------------------------------------------------------------------
	</br> --------------------------------------------------------------------

</body>
</html>