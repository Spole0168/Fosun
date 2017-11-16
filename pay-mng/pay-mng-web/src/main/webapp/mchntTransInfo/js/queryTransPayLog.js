/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Fosun Software Systems Co., Ltd.
 * @version     1.0
 */
(function(){
    //跳转的路由配置
    var routeArry=[
		{
            'state':'transLogList',
            'url':'/transLogList',
            'default':'true',
            'templateUrl':'mchntInfo/transLogList.html',
            'controller':'transLogListController'
        },
        {
            'state':'transLogDetail',
            'url':'/transLogDetail',
            'templateUrl':'mchntInfo/transLogDetail.html',
            'controller':'transLogDetailController'
        },
        {
            'state':'transLogDetail.transLogInfo',
            'url':'/ccc',
            'templateUrl':'mchntInfo/transLogInfo.html',
            'controller':'transLogInfoController'
        },
        {
        	'state':'transLogDetail.payLogsInfo',
        	'url':'/bbbb',
        	'templateUrl':'mchntInfo/payLogsInfo.html',
        	'controller':'payLogsInfoController'
        }
    ]
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('pay-mchntTransInfo',dependency,routeArry);
}());
