/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Fosun Software Systems Co., Ltd.
 * @author      Wubin
 * @version     1.0
 * Create at:   2016/4/21
 */
(function(){
    //跳转的路由配置
    var routeArry=[
		{
            'state':'mchntManage',
            'url':'/mchntManage',
            'default':'true',
            'templateUrl':'mchntMng/mchntMng.html',
            'controller':'mchntMngController'
        },
        {
            'state':'mchntDetail',
            'url':'/mchntDetail',
            'templateUrl':'mchntMng/mchntDetail.html',
            'controller':'mchntDetailController'
        },
        {
            'state':'mchntDetail.baseInfo',
            'url':'/ccc',
            'templateUrl':'mchntMng/mchntBaseInfo.html',
            'controller':'mchntBaseInfoController'
        }
    ]
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('pay-mchntInfoMng',dependency,routeArry);
}());
