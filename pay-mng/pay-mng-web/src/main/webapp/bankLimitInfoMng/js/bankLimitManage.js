/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Fosun Software Systems Co., Ltd.
 * @author      Wualong
 * @version     1.0
 * Create at:   2017/9/11
 */
(function(){
    //跳转的配置
    var routeArry=[
		{
            'state':'bankLimitManage',
            'url':'/bankLimitManage',
            'default':'true',
            'templateUrl':'bankLimitMng/bankLimitMng.html',
            'controller':'bankLimitMngController'
        },
        {
            'state':'bankLimitDetail',
            'url':'/bankLimitDetail',
            'templateUrl':'bankLimitMng/bankLimitDetail.html',
            'controller':'bankLimitDetailController'
        },
        {
            'state':'bankLimitDetail.baseInfo',
            'url':'/ccc',
            'templateUrl':'bankLimitMng/bankLimitBaseInfo.html',
            'controller':'bankLimitBaseInfoController'
        }
    ]
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('pay-bankLimitMng',dependency,routeArry);
}());
