/**
 * Created by wualong on 2017/9/12.
 */
var bankLimitMngController = function ($scope, $common, dataDeliver, $state) {
	//初始化变量
    $scope.custMode = {payType: "",bankType:""};
    $scope.condition = {};
    $scope.custData = {};
    $scope.selected = {select: []}
    $scope.conf = {
        pageNo: 1,
        pageSize: 10
    }
    $scope.$watch("conf.pageNo+conf.pageSize", queryBankLimit);
    //查询方法
    function queryBankLimit() {
        $scope.custMode = {payType: "",bankType:""};
        var data = {
            pageNo: $scope.conf.pageNo,
            pageSize: $scope.conf.pageSize,
            payBankLimit: $scope.condition
        }
        //这两行代码解决: 传对象参数为空的问题;
        var dataString = JSON.stringify(data);
        data = JSON.parse(dataString);
        var promise = $common.get_asyncData("bankLimitMngService/findBankLimitByPage", data);
        promise.then(function (res) {
            var data;
            if (res.errorCode == "SUC") {
                data = res.contextData;
                var rc = data.records;
                for(var i =0;i<rc.length;i++){
                  var obj = rc[i];
                  var singleLmt = obj.singleLmt + '';
                  if(singleLmt.indexOf('.') == -1){
                	  obj.singleLmt = obj.singleLmt.toFixed(2);
                  }
                  var dayLmt = obj.dayLmt + '';
                  if(dayLmt.indexOf('.') == -1){
                	  obj.dayLmt = obj.dayLmt.toFixed(2);
                  }
                }
                $scope.bankLimitData.ds = rc;
                $scope.conf.totalRecord = data.totalRecord;
            } else {
                $common.get_tipDialog(res.errorMsg, 'showInform');
            }
        })
        
    }
    //查询按钮事件
    $scope.submit_onClick = function () {
    	queryBankLimit();
    }
    //重置按钮事件
    $scope.reset_onClick = function () {
        $scope.$apply(function () {
            $scope.condition = {};
        })
    }
    //新增按钮事件
    $scope.add_onClick = function () {
        $common.get_ngDialog('bankLimitMng/Add/bankLimitAdd.html', $scope, ["$scope", function (dialogScope) {
        	//打开层的字段初始化值
            dialogScope.bankLimitAdd = {
            	payType: "",
            	bankType:""
            };
            //提交的数据
            var data = {
            	payBankLimit: dialogScope.bankLimitAdd
            }
            dialogScope.confirm_onClick = function () {
                if ($.doValidate("bankLimitAddForm")) {
                	var promise = $common.get_asyncData("bankLimitMngService/addBankLimit", data);
                    promise.then(function (res) {
                        if (res.errorCode == "SUC") {
                            $common.get_tipDialog('新增成功！', 'showSuccess');
                            dialogScope.closeThisDialog();
                            $scope.selected.select = [];
                            queryBankLimit();
                        } else {
                            $common.get_tipDialog(res.errorMsg, 'showInform');
                            queryBankLimit();
                        }
                    })
                }
            };
            dialogScope.cancel_onClick = function () {
                dialogScope.closeThisDialog();
                $scope.selected.select = [];
                queryBankLimit();
            };
            dialogScope.closeThisDialog_onClick = function () {
                dialogScope.closeThisDialog();
                queryBankLimit();
            };
        }], "添加银行限额信息")
    }

    //删除按钮事件
    $scope.delete_onClick = function () {
        if ($scope.selected.select.length < 1) {
            $common.get_tipDialog('请选择一条银行限额记录!', 'showInform')
        } else {
            $common.get_tipDialog('确定删除该银行限额信息吗？', 'showTip').then(function () {
                var data = {
                	payBankLimit: $scope.selected.select[0]
                }
                var promise1 = $common.get_asyncData("bankLimitMngService/deleteBankLimit", data);
                promise1.then(function (res) {
                    if (res.errorCode == "SUC" && "" != res.contextData.value) {
                        var resultMessage = res.contextData.value;
                        $common.get_tipDialog(resultMessage, 'showInform');
                    } else if (res.errorCode == "SUC" &&(null == res.contextData.value || "" == res.contextData.value)) {
                    	queryBankLimit();
                    	$common.get_tipDialog('删除银行限额信息成功！', 'showSuccess');
                    } else {
                        $common.get_tipDialog(res.errorMsg, 'showInform');
                    }
                })
            })
        }
    }//删除函数结尾

    //撤销删除按钮事件
    $scope.revocationDelete_onClick = function () {
        $state.go("revocationDelete");//跳转，參數見mchntManager.js配置項'state'
    }

    //用户详情
    $scope.detail_onClick = function () {
        if ($scope.selected.select.length != 1) {
            $common.get_tipDialog('只能选择一条银行限额记录！', 'showInform');
        } else {
            var data = {
            	payBankLimit: $scope.selected.select[0]
            };
            $state.go("bankLimitDetail");//跳转
            dataDeliver.setter(data)//传值[可选]
        }
    }
    
    //详情界面

    //导出按钮事件
    // $scope.download_onClick = function () {
    //     $common.get_ngDialog('userManage/download.html', $scope, ["$scope", function (dialogScope) {
    //         dialogScope.download = {
    //             modelId: ""
    //         };
    //         dialogScope.dooextent = function (ds) {
    //             var data = {
    //                 path: '',
    //                 modelId: ds.modelId
    //             }
    //             //dialogScope.confirm_onClick = function () {
    //             var promise = $common.get_asyncData('userManageService/downloadExcelFileByModel', data)
    //             promise.then(function (res) {
    //                 if (res.errorCode == "SUC") {
    //                     //$common.get_tipDialog('导出成功！', 'showSuccess');
    //                     queryUserInfo();
    //                     $scope.selected.select = [];
    //                 } else {
    //                     $common.get_tipDialog(res.errorMsg, 'showInform');
    //                 }
    //             })
    //             //}
    //         };
    //         dialogScope.cancel_onClick = function () {
    //             dialogScope.closeThisDialog();
    //             $scope.selected.select = [];
    //         };
    //         dialogScope.config_onClick = function () {
    //             $common.get_ngDialog('userManage/modelInfo.html', dialogScope, ["$scope", function (configScope) {
    //                 configScope.formConfig = {state: "02"};
    //                 configScope.formConfigData = {};
    //                 configScope.selected = {select: []}
    //                 configScope.conf1 = {
    //                     pageNo: 1,
    //                     pageSize: 10
    //                 };
    //                 $scope.$watch("conf1.pageNo+conf1.pageSize", queryModel);
    //                 function queryModel() {
    //                     var data = {
    //                         pageNo: configScope.conf1.pageNo,
    //                         pageSize: configScope.conf1.pageSize,
    //                         custModel: configScope.formConfig
    //                     }
    //                     var promise = $common.get_asyncData("userManageService/findCustModelByPage", data);
    //                     promise.then(function (res) {
    //                         var data;
    //                         if (res.errorCode == "SUC") {
    //                             data = res.contextData;
    //                             configScope.formConfigData.ds = data.records;
    //                             configScope.conf1.totalRecord = data.totalRecord;
    //                         } else {
    //                             $common.get_tipDialog(res.errorMsg, 'showInform');
    //                         }
    //                     })
    //                 }
    //
    //                 configScope.query_onClick = function () {
    //                     queryModel();
    //                     configScope.selected.select = [];
    //                 };
    //                 configScope.reset_onClick = function () {
    //                     configScope.$apply(function () {
    //                         configScope.formConfig = {state: "02"};
    //                     })
    //                 }
    //                 configScope.add_onClick = function () {
    //                     $common.get_ngDialog('userManage/Add/moldboardAdd.html', dialogScope, ["$scope", function (addScope) {
    //                         addScope.moldboard = {};
    //                         addScope.confirm_onClick = function () {
    //                             var data = {custModel: addScope.moldboard}
    //                             var promise = $common.get_asyncData("userManageService/addCustModel", data);
    //                             promise.then(function (res) {
    //                                 if (res.errorCode == "SUC") {
    //                                     $common.get_tipDialog('新增成功！', 'showSuccess');
    //                                     addScope.closeThisDialog();
    //                                     queryModel();
    //                                 } else {
    //                                     $common.get_tipDialog(res.errorMsg, 'showInform');
    //                                 }
    //                             })
    //                         };
    //                         addScope.cancel_onClick = function () {
    //                             addScope.closeThisDialog();
    //                         };
    //                     }], "新增模板")
    //                 };
    //                 configScope.delete_onClick = function () {
    //                     if (configScope.selected.select.length < 1) {
    //                         $common.get_tipDialog('请选择一条记录!', 'showInform')
    //                     } else {
    //                         $common.get_tipDialog('确定删除吗？', 'showTip').then(function () {
    //                             var data = {
    //                                 custModel: configScope.selected.select,
    //                                 state: "03"
    //                             }
    //                             var promise = $common.get_asyncData('userManageService/updateCustModelForState', data)
    //                             promise.then(function (res) {
    //                                 if (res.errorCode == "SUC") {
    //                                     $common.get_tipDialog('删除成功！', 'showSuccess');
    //                                     queryModel();
    //                                     configScope.selected.select = [];
    //                                 } else {
    //                                     $common.get_tipDialog(res.errorMsg, 'showInform');
    //                                 }
    //                             })
    //                         })
    //                     }
    //                 };
    //                 configScope.detail_onClick = function () {
    //                     if (configScope.selected.select.length == 0) {
    //                         $common.get_tipDialog('请选择一条记录！', 'showInform');
    //                     } else {
    //                         //$common.get_ngDialog('userManage/Add/elementSelect.html',configScope,["$scope",function(detailScope){
    //                         //双选
    //                         //$common.get_asyncData('select',{}).then(function(res){
    //                         //    $scope.doubleSelect=res.contextData;
    //                         //})
    //                         $common.get_ngDialog('userManage/details/moldboardDetail.html', configScope, ["$scope", function (detailScope) {
    //                             var modelId = configScope.selected.select[0].modelId;
    //                             detailScope.moldboard = configScope.selected.select[0];
    //                             detailScope.selected = {select: []}
    //                             detailScope.elementData = {};
    //                             detailScope.conf2 = {
    //                                 pageNo: 1,
    //                                 pageSize: 10
    //                             };
    //                             detailScope.$watch("conf2.pageNo+conf2.pageSize", queryElements);
    //                             function queryElements() {
    //                                 var data = {
    //                                     pageNo: detailScope.conf2.pageNo,
    //                                     pageSize: detailScope.conf2.pageSize,
    //                                     modelId: modelId
    //                                 }
    //                                 //var promise = $common.get_asyncData("userManageService/findUsedCustElementsByModelId", data);
    //                                 //promise.then(function (res) {
    //                                 //    var data;
    //                                 //    if (res.errorCode == "SUC") {
    //                                 //        data = res.contextData;
    //                                 //        detailScope.elementData.ds = data.records;
    //                                 //        detailScope.conf2.totalRecord = data.totalRecord;
    //                                 //    } else {
    //                                 //        $common.get_tipDialog(res.errorMsg, 'showInform');
    //                                 //    }
    //                                 //})
    //                             }
    //
    //                             detailScope.confirm_onClick = function () {
    //
    //                             }
    //                             detailScope.cancel_onClick = function () {
    //                                 detailScope.closeThisDialog();
    //                                 queryElements();
    //                                 configScope.selected.select = [];
    //                             };
    //                         }], "新增要素")
    //                     }
    //                 };
    //                 configScope.cancel_onClick = function () {
    //                     configScope.closeThisDialog();
    //                 };
    //             }], "模板配置页面")
    //         };
    //     }], "导出模板信息")
    // }//模板导出函数结尾

    //模板选择下拉框
    // $scope.content = {
    //     type: "table",//展示类型table  tree
    //     url: "userManageService/findCustModelByValueByPage",//请求url
    //     //param:{kk:"e"},//请求参数,如果不写该属性或者param:{},则以输入当前字段查询
    //     split: "-",//分隔符
    //     extentColumn: "",
    //     column: ["modelId", "modelName", "picId"]//展示内容
    // };

    //导入按钮事件
    // $scope.upload_onClick = function () {
    //     $common.get_ngDialog('userManage/upload.html', $scope, ["$scope", function (dialogScope) {
    //         dialogScope.upload = {
    //             modelId: ""
    //         };
    //         dialogScope.dooextent = function (ds) {
    //             $scope.custMode = {modelId : ds.modelId};
    //             dialogScope.upload.modelId = ds.modelId;
    //         };
    //         var data = {
    //             path: '',
    //             modelId: dialogScope.upload.modelId
    //         }
    //         dialogScope.confirm_onClick = function () {
    //             var promise = $common.get_asyncData('userManageService/uploadDataByExcelFile', data)
    //             promise.then(function (res) {
    //                 if (res.errorCode == "SUC") {
    //                     $common.get_tipDialog('导入成功！', 'showSuccess');
    //                     queryUserInfo();
    //                     $scope.selected.select = [];
    //                 } else {
    //                     $common.get_tipDialog(res.errorMsg, 'showInform');
    //                 }
    //             })
    //         }
    //         dialogScope.cancel_onClick = function () {
    //             dialogScope.closeThisDialog();
    //             $scope.selected.select = [];
    //         };
    //         dialogScope.config_onClick = function () {
    //             $common.get_ngDialog('userManage/modelInfo.html', dialogScope, ["$scope", function (configScope) {
    //                 configScope.formConfig = {state: "02"};
    //                 configScope.formConfigData = {};
    //                 configScope.selected = {select: []}
    //                 configScope.conf1 = {
    //                     pageNo: 1,
    //                     pageSize: 10
    //                 };
    //                 $scope.$watch("conf1.pageNo+conf1.pageSize", queryModel);
    //                 function queryModel() {
    //                     var data = {
    //                         pageNo: configScope.conf1.pageNo,
    //                         pageSize: configScope.conf1.pageSize,
    //                         custModel: configScope.formConfig
    //                     }
    //                     var promise = $common.get_asyncData("userManageService/findCustModelByPage", data);
    //                     promise.then(function (res) {
    //                         var data;
    //                         if (res.errorCode == "SUC") {
    //                             data = res.contextData;
    //                             configScope.formConfigData.ds = data.records;
    //                             configScope.conf1.totalRecord = data.totalRecord;
    //                         } else {
    //                             $common.get_tipDialog(res.errorMsg, 'showInform');
    //                         }
    //                     })
    //                 }
    //
    //                 configScope.query_onClick = function () {
    //                     queryModel();
    //                     configScope.selected.select = [];
    //                 };
    //                 configScope.reset_onClick = function () {
    //                     configScope.$apply(function () {
    //                         configScope.formConfig = {state: "02"};
    //                     })
    //                 }
    //                 configScope.add_onClick = function () {
    //                     $common.get_ngDialog('userManage/Add/moldboardAdd.html', dialogScope, ["$scope", function (addScope) {
    //                         addScope.moldboard = {};
    //                         addScope.confirm_onClick = function () {
    //                             var data = {custModel: addScope.moldboard}
    //                             var promise = $common.get_asyncData("userManageService/addCustModel", data);
    //                             promise.then(function (res) {
    //                                 if (res.errorCode == "SUC") {
    //                                     $common.get_tipDialog('新增成功！', 'showSuccess');
    //                                     addScope.closeThisDialog();
    //                                     queryModel();
    //                                 } else {
    //                                     $common.get_tipDialog(res.errorMsg, 'showInform');
    //                                 }
    //                             })
    //                         };
    //                         addScope.cancel_onClick = function () {
    //                             addScope.closeThisDialog();
    //                         };
    //                     }], "新增模板")
    //                 };
    //                 configScope.delete_onClick = function () {
    //                     if (configScope.selected.select.length < 1) {
    //                         $common.get_tipDialog('请选择一条记录!', 'showInform')
    //                     } else {
    //                         $common.get_tipDialog('确定删除吗？', 'showTip').then(function () {
    //                             var data = {
    //                                 custModel: configScope.selected.select,
    //                                 state: "03"
    //                             }
    //                             var promise = $common.get_asyncData('userManageService/updateCustModelForState', data)
    //                             promise.then(function (res) {
    //                                 if (res.errorCode == "SUC") {
    //                                     $common.get_tipDialog('删除成功！', 'showSuccess');
    //                                     queryModel();
    //                                     configScope.selected.select = [];
    //                                 } else {
    //                                     $common.get_tipDialog(res.errorMsg, 'showInform');
    //                                 }
    //                             })
    //                         })
    //                     }
    //                 };
    //                 configScope.detail_onClick = function () {
    //                     if (configScope.selected.select.length == 0) {
    //                         $common.get_tipDialog('请选择一条记录！', 'showInform');
    //                     } else {
    //                         //$common.get_ngDialog('userManage/Add/elementSelect.html',configScope,["$scope",function(detailScope){
    //                         //双选
    //                         //$common.get_asyncData('select',{}).then(function(res){
    //                         //    $scope.doubleSelect=res.contextData;
    //                         //})
    //                         $common.get_ngDialog('userManage/details/moldboardDetail.html', configScope, ["$scope", function (detailScope) {
    //                             var modelId = configScope.selected.select[0].modelId;
    //                             detailScope.moldboard = configScope.selected.select[0];
    //                             detailScope.selected = {select: []}
    //                             detailScope.elementData = {};
    //                             detailScope.conf2 = {
    //                                 pageNo: 1,
    //                                 pageSize: 10
    //                             };
    //                             detailScope.$watch("conf2.pageNo+conf2.pageSize", queryElements);
    //                             function queryElements() {
    //                                 var data = {
    //                                     pageNo: detailScope.conf2.pageNo,
    //                                     pageSize: detailScope.conf2.pageSize,
    //                                     modelId: modelId
    //                                 }
    //                                 //var promise = $common.get_asyncData("userManageService/findUsedCustElementsByModelId", data);
    //                                 //promise.then(function (res) {
    //                                 //    var data;
    //                                 //    if (res.errorCode == "SUC") {
    //                                 //        data = res.contextData;
    //                                 //        detailScope.elementData.ds = data.records;
    //                                 //        detailScope.conf2.totalRecord = data.totalRecord;
    //                                 //    } else {
    //                                 //        $common.get_tipDialog(res.errorMsg, 'showInform');
    //                                 //    }
    //                                 //})
    //                             }
    //
    //                             detailScope.confirm_onClick = function () {
    //
    //                             }
    //                             detailScope.cancel_onClick = function () {
    //                                 detailScope.closeThisDialog();
    //                                 queryElements();
    //                                 configScope.selected.select = [];
    //                             };
    //                         }], "新增要素")
    //                     }
    //                 };
    //                 configScope.cancel_onClick = function () {
    //                     configScope.closeThisDialog();
    //                 };
    //             }], "模板配置页面")
    //         };
    //     }], "导入个人客户信息")
    // }//导入事件结束

    //上传
    // $scope.uploadoption = {
    //     inputHidden:[
    //         /* 回调接口的参数，如无需要，可不写   start */
    //         {name: 'modelId', value: function () {
    //             return $scope.custMode.modelId
    //         }},
    //         {name:'source',value: 'CustCustomerBase'},//客户信息导入
    //         /* 回调接口的参数，如无需要，可不写   end */
    //         {name:'callback',value: 'fileServiceSupport/upload'}
    //     ],
    //     callbackFun: function(res,status){
    //         console.log("res: "+res+"  status: "+status);
    //     }
    // };//上传结束
    //下载
    // $scope.downloadoption = {
    //     inputHidden:[
    //         /* 回调接口的参数，如无需要，可不写   start */
    //         {name: 'modelId', value: function () {
    //             return $scope.custMode.modelId
    //         }},
    //         {name:'source',value: 'CustCustomerBase'},
    //         /* 回调接口的参数，如无需要，可不写   end */
    //         {name:'callback',value: 'fileServiceSupport/download'},
    //         {name:'Authorization',value: window.authorization||sessionStorage.getItem("authorization")},
    //         {name:'genFileName',value: '用户表.xls'}
    //     ]
    // };//下载结束
    // $scope.condition={};//初始化查询条件对象
    // $scope.exportExcel = {
    //     form:function(){//查询条件--表单
    //         /* 根据条件导出所有数据  start */
    //         //$scope.condition.pageNo= 1;
    //         //$scope.condition.pageSize= $scope.conf.totalRecord;
    //         /* 根据条件导出所有数据  end */
    //         /* 根据条件导出单页数据  start */
    //         $scope.condition.pageNo= $scope.conf.pageNo;
    //          $scope.condition.pageSize= $scope.conf.pageSize;
    //         /* 根据条件导出单页数据  end */
    //         return $scope.condition;
    //     },
    //     transcode:"userManageService/findCustCustomerBaseByPage",
    //     tableId:"tableId",
    //     genFileName:"个人信息列表"//导出表格的文件名
    //     //tableHeaders:[]
    // }

}