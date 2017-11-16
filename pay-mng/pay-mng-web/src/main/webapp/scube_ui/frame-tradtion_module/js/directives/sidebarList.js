/**
 * Created by wubin on 2016/4/26.
 */
(function () {
    window.frameModule.
    filter('menu_level',function(){
        return function (input,menuLevel,menuItem){
            var arr =[],
                input=input?input:[];
            if(!menuItem){
                if(window._sidebarTopitem_){
                    menuItem = window._sidebarTopitem_
                }else {
                    menuItem={menuCode:0};
                }
            }
            arr = input.filter(function (element,index,_input) {
                return (element.menuLevel == menuLevel&&element.menuParentId ==menuItem.menuCode)
            })
            arr = arr.map(function (elem) {
                var existChild = false;
                elem.existChildren = false;
                for (var i = 0;i<input.length;i++){
                    if(input[i].menuParentId == elem.menuCode){
                        existChild = true;
                        break;
                    }
                }
                if(existChild) {
                    elem.existChildren = true
                }
                return elem;
            })
            return arr;
        }
    }).
    directive('sidebarUl',function ($interval,$window,$common) {
        return {
            restrict :'E',
            template :
            '<li ng-repeat="item1 in sidebarList|menu_level:1 |orderBy:\'showSeq\'">' +
            ' <a href="#" ng-class="{\'dropdown-toggle\':item1.existChildren}" ng-click="clickToPage(item1)">' +
            ' <i ng-class="item1.iconName"></i>' +
            //'<span style="width: 30px;height: 50px;">' +
            //'<img src="../../images/yeoman.png"/></span>'+
            '<span class="menu-text">{{item1.menuName}}</span>' +
            '<b ng-show="item1.existChildren" class="arrow icon-angle-down"></b> </a>' +

            '<ul class="submenu">'+
            '<li ng-repeat="item2 in sidebarList|menu_level:2:item1 |orderBy:\'showSeq\'">' +
            '<a href="#" ng-class={"dropdown-toggle":item2.existChildren} ng-click="clickToPage(item2)">' +
            '<i ng-class="item2.iconName"></i>{{item2.menuName}}' +
            '<b ng-show="item2.existChildren" class="arrow icon-angle-down"></b></a>' +

            '<ul class="submenu">'+
            '<li ng-repeat="item3 in sidebarList|menu_level:3:item2 |orderBy:\'showSeq\'">' +
            '<a href="#" ng-class={"dropdown-toggle":item3.existChildren} ng-click="clickToPage(item3)">' +
            '<i ng-class="item3.iconName"></i>{{item3.menuName}}' +
            '<b ng-show="item3.existChildren" class="arrow icon-angle-down"></b></a>' +

            '<ul class="submenu">'+
            '<li ng-repeat="item4 in sidebarList|menu_level:4:item3 |orderBy:\'showSeq\'">' +
            '<a href="#" ng-class={"dropdown-toggle":item4.existChildren} ng-click="clickToPage(item4)">' +
            '<i ng-class="item4.iconName"></i>{{item4.menuName}}' +
            '<b ng-show="item4.existChildren" class="arrow icon-angle-down"></b></a>' +
            '</li></ul>'+//四级菜单
            '</li></ul>'+//三级菜单
            '</li></ul>'+//二级菜单
            ' </li> ' ,//一级菜单
            link : function (scope,elem,attrs) {
                try {
                    var winName = JSON.parse(window.name);
                    winName._SELF = true;
                    window.name= JSON.stringify(winName);
                }catch (e){
                    window.name= JSON.stringify({"_SELF":true});
                }

                var height=($(window).height()-$("#navbar").height()-86);
                var doIframe ={
                    createIframe:function (menuCode){
                        var iframe = '<iframe id="'+menuCode+'" width="100%" frameborder="0" scrolling="yes"></iframe>';
                        $('#iframes').append(iframe);
                        $('#'+menuCode).css('height',height);
                    },
                    checkIframe:function(menuCode){
                        if($('#'+menuCode).length){
                            $('#'+menuCode).remove();
                        }
                    }
                }
                var originData = {
                    authorization:sessionStorage.getItem("authorization"),
                    _HTTP_IP_PORT:_HTTP_IP_PORT,
                    userInfo:scope.userInfo
                };
                var toSysPage = function(item){
                    originData.appBusUrl = item.appBusUrl;//业务系统ajax请求时的url
                    var menuId =item.menuCode;
                    //var menuPath =item.menuPath;
                    //var menuUrl =item.menuUrl;
                    var menuName =item.menuName;
                    var url = item.appUiUrl+item.pagepath;//scube_ui菜单跳转时的url
                    if(item.pagepath){
                        //获取默认数据字典item.appCode
                        $common.get_asyncData('bdDataDictService/getDataBySysCode',{sysCode:item.appCode})
                            .then(function (res) {
                                if(res.errorCode=='SUC'){
                                    originData.dictionary = res.contextData;//业务系统的数据字典
                                    //var s = $('#sidebar').height();
                                    //var w = $(window).height();
                                    //if(s>w){
                                    //    height=s-86;
                                    //}else {
                                    //    height=w-$("#navbar").height()-86;
                                    //}
                                    doIframe.checkIframe(menuId);
                                    doIframe.createIframe(menuId);
                                    var showNum = scope.cTabpanelFrame.addLiFun({title : menuName , content : $("#"+menuId) , url : url , closeable : true ,item:item });
                                    //判断子页面加载完之后，再使用postMesssage
                                    var frame = document.getElementById(menuId);
                                    if (frame.attachEvent){
                                        frame.attachEvent("onload", function(){
                                            var _originData = JSON.stringify(originData);
                                            if ((typeof _REQUEST_DSSIGN !=='undefined')&& _REQUEST_DSSIGN == "common") {
                                                frame.contentWindow.postMessage(_originData,item.appUiUrl);
                                            } else if (typeof _REQUEST_DSSIGN !=='undefined'&& _REQUEST_DSSIGN == "mock") {
                                                frame.contentWindow.postMessage(_originData,'*');
                                            } else {
                                                frame.contentWindow.postMessage(_originData,item.appUiUrl);
                                            }
                                        });
                                    }
                                    else {
                                        frame.onload = function(){
                                            if ((typeof _REQUEST_DSSIGN !=='undefined')&& _REQUEST_DSSIGN == "common") {
                                                frame.contentWindow.postMessage(originData,item.appUiUrl);
                                            } else if (typeof _REQUEST_DSSIGN !=='undefined'&& _REQUEST_DSSIGN == "mock") {
                                                frame.contentWindow.postMessage(originData,'*');
                                            } else {
                                                frame.contentWindow.postMessage(originData,item.appUiUrl);
                                            }
                                        };
                                    }
                                    scope.cTabpanelFrame.showLiFun(showNum);

                                    scope.breadcrumb=[];
                                    scope.bread(item);
                                    scope.breadcrumb.reverse();
                                }else {
                                    $common.get_tipDialog(res.errorMsg,'showError')
                                }
                            });

                    };

                }
                //过滤面包屑
                scope.bread =function(breadmenu){
                    if(breadmenu.menuLevel!=1){
                        for(var i= 0;i<scope.sidebarList.length;i++){
                            if(scope.sidebarList[i].menuCode==breadmenu.menuParentId){
                                scope.breadcrumb.push(breadmenu);
                                scope.bread(scope.sidebarList[i]);
                                break;
                            }
                        }
                    }else{
                        scope.breadcrumb.push(breadmenu);
                    }
                };
                scope.clickToPage =function (item) {
                    toSysPage(item);
                    //setTimeout(function(){
                    //    if($('iframe').length>0){
                    //        var s = $('#sidebar').height();
                    //        var w = $(window).height();
                    //        if(s>w){
                    //            $('iframe').height(s-86);
                    //        }else {
                    //            $('iframe').height(w-$("#navbar").height()-86);
                    //        }
                    //    }
                    //},1000);
                };
                function mainIsMenu(mainUrl){
                    var flag=false;
                    var item ='';
                    var menuUrl ='';
                    try {
                        for(var i=0;i<scope.sidebarList.length;i++){
                            item = scope.sidebarList[i];
                            menuUrl = item.appUiUrl+item.pagepath;
                            if(mainUrl == menuUrl){
                                flag=true;
                                break;
                            }
                        }
                        if(flag){
                            return item;
                        }else {
                            return '';
                        }
                    }catch(e){
                        return '';
                    }

                }
                //获取默认数据字典
                $common.get_asyncData('bdDataDictService/getAllDefaultJsonData')
                    .then(function (res) {
                        if(res.errorCode=='SUC'){
                            var default_dictionary = res.contextData;
                            try {
                                //判断是否显示导航栏一级菜单
                                if(default_dictionary.navMenu){
                                    var navbar = default_dictionary.navMenu.dataItems[0].dataVal;
                                }
                                document.title = default_dictionary.sysName.dataItems[0].dataTrsVal||"华腾软件系统";
                                //scope.sysName = default_dictionary.sysName.dataItems[0].dataVal||"华腾软件系统";
                                var mainObj ={};
                                var menuName = default_dictionary.main_menuName.dataItems[0].dataVal;
                                mainObj ={
                                    menuCode:'default_main',
                                    menuName:menuName||'我的主页',
                                    appCode:default_dictionary.main_appCode.dataItems[0].dataVal,
                                    appBusUrl:default_dictionary.main_appBusUrl.dataItems[0].dataVal,
                                    appUiUrl:default_dictionary.main_appUiUrl.dataItems[0].dataVal,
                                    pagepath:default_dictionary.main_pagePath.dataItems[0].dataVal
                                }
                                scope.nav_menu_bars = [];
                                if(navbar=='2'){
                                    $common.get_asyncData('funcService/getTopFunc').then(function (res) {
                                        if(res.errorCode=='SUC'){
                                            scope.nav_menu_bars = res.contextData;
                                            if(!scope.nav_menu_bars || scope.nav_menu_bars.length==0){
                                                $common.get_tipDialog("没获取到菜单数据！","showInform");
                                            }else {
                                                scope.toSideBar(scope.nav_menu_bars[0],0);
                                            }
                                        }else {
                                            $common.get_tipDialog(res.errorMsg,'showError')
                                        }
                                    });
                                    toSysPage(mainObj);
                                }else {
                                    //获取菜单
                                    var promise = $common.get_asyncData('funcService/selectAppByTlrList',{funcInfoVO:{}});
                                    promise.then(function (res) {
                                        if(res.errorCode=='SUC'){
                                            scope.sidebarList =res.contextData;
                                            if(!scope.sidebarList || scope.sidebarList.length==0){
                                                $common.get_tipDialog("没获取到菜单数据！","showInform");
                                            }
                                            /*判断主页url是否等于某个菜单--begin*/
                                            var mainUrl= default_dictionary.main_appUiUrl.dataItems[0].dataVal+ default_dictionary.main_pagePath.dataItems[0].dataVal;
                                            var item = mainIsMenu(mainUrl);
                                            if(item!=''){
                                                toSysPage(item);
                                                return;
                                            }
                                            toSysPage(mainObj);
                                            /*判断主页url是否等于某个菜单--end*/
                                        }else {
                                            $common.get_tipDialog(res.errorMsg,'showError')
                                        }
                                    });
                                }
                            }catch (e){
                                if(navbar=='2'){
                                    $common.get_asyncData('funcService/getTopFunc').then(function (res) {
                                        if(res.errorCode=='SUC'){
                                            scope.nav_menu_bars = res.contextData;
                                            if(!scope.nav_menu_bars || scope.nav_menu_bars.length==0){
                                                $common.get_tipDialog("没获取到菜单数据！","showInform");
                                            }else {
                                                scope.toSideBar(scope.nav_menu_bars[0],0);
                                            }
                                        }else {
                                            $common.get_tipDialog(res.errorMsg,'showError')
                                        }
                                    });
                                }else {
                                    //获取菜单
                                    $common.get_asyncData('funcService/selectAppByTlrList', {funcInfoVO: {}}).then(function (res) {
                                        if (res.errorCode == 'SUC') {
                                            scope.sidebarList = res.contextData;
                                            if(!scope.sidebarList || scope.sidebarList.length==0){
                                                $common.get_tipDialog("没获取到菜单数据！","showInform");
                                            }
                                        } else {
                                            $common.get_tipDialog(res.errorMsg, 'showError')
                                        }
                                    });
                                }
                                mainObj ={
                                    appCode:'default',menuCode:'default_main',menuName:'我的主页',
                                    appUiUrl:'',appBusUrl:'', pagepath:''
                                }
                                toSysPage(mainObj);
                            }
                        }else {
                            $common.get_tipDialog(res.errorMsg,'showError')
                        }
                    });
            },
            replace :true
        }
    }).
    directive('iframes',function () {
        return {
            restrict :'E',
            template :'<iframe ng-repeat="item in sidebarList" ng-if="item.pagepath"' +
            ' id="{{item.menuCode}}" width="100%" frameborder="0" scrolling="yes" ng-style="theight"></iframe>',
            link: function (scope,elem,attrs) {
                //$("#mybreadcrumb").height()+$("#iframeHeadDiv").height()=40+24+10+10
                scope.theight={
                    height: ($(window).height()-$("#navbar").height()-86)+"px",
                    display: "none"
                };
            },
            replace :true
        }
    }).
    directive('breadCrumb',function () {
        return {
            restrict :'E',
            template :'<div id="mybreadcrumb" class="mybreadcrumb">' +
            '<section ng-repeat="crumb in breadcrumb" ng-click="selectBread(crumb)">' +
            '<img ng-if="!$first" src="../../images/breadcrumb1.png">' +
            '<span ng-class="{\'hover\':$last}" ng-bind="crumb.menuName"></span>' +
            '<img src="../../images/breadcrumb2.png"></section>' +
            '</div>',
            link: function (scope,elem,attrs) {
                scope.selectBread = function(crumb){

                    var url = crumb.appUiUrl+crumb.pagepath;//scube_ui菜单跳转时的url
                    if(crumb.pagepath){
                        scope.breadcrumb=[];
                        scope.bread(crumb);
                        scope.breadcrumb.reverse();
                        scope.cTabpanelFrame.showLiFunByUrl(url);
                    }
                };
            },
            replace :true
        }
    }).
    directive('mainIframe',function () {
        return {
            restrict :'E',
            templateUrl :'home2.html',
            controller: function ($scope,$common) {
                $scope.conf= {
                    pageNo: 1,
                    pageSize:10
                }
                $scope.selected={
                    select :[]
                };
                $scope.mainTableLeft ={}
                $scope.conf2= {
                    pageNo: 1,
                    pageSize:10
                }
                $scope.selected2={
                    select :[]
                };
                $scope.mainTableRight ={}
                var reduceHeight=$(window).height()-110;
                $('.mainIframe-left').height(reduceHeight);
                //var promise = $common.get_asyncData("/mainTableLeft");
                //promise.then(function(res){
                //    var data;
                //    if (res.errorCode =="SUC"){
                //        data = res.contextData;
                //        $scope.mainTableLeft.ds = data.records;
                //        $scope.conf.totalRecord = data.totalRecord;
                //    }else{
                //        $common.get_tipDialog(res.errorMsg,'showError');
                //    }
                //});

                //var promise2 = $common.get_asyncData("/mainTableRight");
                //promise2.then(function(res){
                //    var data;
                //    if (res.errorCode =="SUC"){
                //        data = res.contextData;
                //        $scope.mainTableRight.ds = data.records;
                //        $scope.conf2.totalRecord = data.totalRecord;
                //    }else{
                //        $common.get_tipDialog(res.errorMsg,'showError');
                //    }
                //});
                //var promise3 = $common.get_asyncData("/getEcharts");
                //promise3.then(function(res){
                //    if (res.errorCode =="SUC"){
                //        $scope.chartData = res.contextData;
                //    }else{
                //        $common.get_tipDialog(res.errorMsg,'showError');
                //    }
                //});
            },
            /*
             controller:function ($scope,$common) {
             $scope.top = [];
             $scope.bottom = [];
             $common.get_asyncData('/top').then(function (res) {
             $scope.top = res.contextData;
             });
             $common.get_asyncData('/bottom').then(function (res) {
             $scope.bottom = res.contextData;
             });
             $scope.cart = [];
             //登陆
             if(!sessionStorage.getItem('sessionToken')){
             $scope.myLogin = function () {
             $common.get_ngDialog('login-box.html', $scope,420);
             };
             }else {
             $('.mymain-login').fadeIn();
             }
             //登出
             $scope.loginOut= function () {
             $('.mymain-login').toggle();
             };
             var ss = [];
             $scope.cart = $scope.cart.concat(ss);
             //删除
             $scope.removeTop = function (item) {
             for (var i = 0; i < $scope.top.length; i++) {
             if ($scope.top[i].className == item.className) {
             $scope.top.splice(i, 1);
             break;
             }
             }
             };
             $scope.removeBottom = function (item) {
             for (var i = 0; i < $scope.cart.length; i++) {
             if ($scope.cart[i].className == item.className) {
             $scope.cart.splice(i, 1);
             break;
             }
             }
             };
             //功能弹窗
             $scope.ngDialogOpen = function () {
             $common.get_ngDialog('ngDialog.html', $scope, 1000);
             };
             //添加
             $scope.addMark = function (item) {
             var flag = false;
             for (var index = 0; index < $scope.cart.length; index++) {
             if ($scope.cart[index].text == item.text) {
             flag = true;
             }
             }
             //如果没有，该item添加到数组中
             if (!flag) {
             item.mark = 1;
             $scope.cart.push(item);
             }
             console.log($scope.cart);
             };
             //跳转组件页面
             $scope.gotoComponent = function () {
             location.href = '../../component_module/html/component.html';
             };
             },
             */
            replace :true
        }
    })
}());