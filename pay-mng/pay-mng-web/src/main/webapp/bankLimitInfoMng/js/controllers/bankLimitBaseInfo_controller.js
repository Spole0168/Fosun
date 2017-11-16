/**
 * Created by wualong on 2017/9/14.
 */
var bankLimitBaseInfoController = function ($scope, $common, dataDeliver, $state) {
    var data = dataDeliver.getter();
    var payBankLimit = data.payBankLimit;
    var param = {"payBankLimit": payBankLimit};
    var state = data.state;   //只读状态
    //alert(state);
    init();
    function init(){
        if(state=="readonly"){
            $scope.readonly = true;
        }else{
            $scope.readonly = false;
        }
    }
    var promise = $common.get_asyncData("bankLimitMngService/findBankLimitBaseInfo", param);
    promise.then(function (res) {
        $scope.customerForm;
        if (res.errorCode == "SUC") {
            $scope.bankLimitBaseInfoForm = res.contextData;
            
        	//$scope.provinceNameChange($scope.customerForm.liveProvince);
            //$scope.cityNameChange($scope.customerForm.liveCity);
        } else {
            $common.get_tipDialog(res.errorMsg, 'showInform');
        }
    })
    $scope.cancel_onClick = function () {
    	$state.go("bankLimitManage");
    }
    //保存按钮事件（留做样例）
    //$scope.mchntBaseInfoForm = {};
    $scope.save_onClick = function () {
        if ($.doValidate("mchntBaseInfoForm")) {
            if(updateCustCustomerBase($scope.customerForm,$common)==true){
                var data = {custCustomerBase: $scope.customerForm}
                var primise = $common.get_asyncData('userManageService/updateCustCustomerBase', data);
                primise.then(function (res) {
                    if (res.errorCode == "SUC") {
                        $common.get_tipDialog('保存成功！', 'showSuccess');
                    } else {
                        $common.get_tipDialog(res.errorMsg, 'showInform');
                    }
                })
            }
        }
    }
    //修改记录（留做样例）
    $scope.updateRecord_onClick = function () {
        $common.get_ngDialog('userManage/updateRecord.html', $scope, ["$scope", function (dialogScope) {
            dialogScope.custCustomerBaseModifyHistory = {custNo: custNo};
            dialogScope.updateRecordData = {}
            dialogScope.conf = {
                pageNo: 1,
                pageSize: 10
            }
            dialogScope.cancel_onClick = function(){
                dialogScope.closeThisDialog();
            }
            dialogScope.$watch("conf.pageNo+conf.pageSize", function () {
                dialogScope.selectedUpdateRecord = {select: []};
                queryUpdateInfo(dialogScope.custCustomerBaseModifyHistory);
            });
            function queryUpdateInfo(custCustomerBaseModifyHistory) {
                var data = {
                    pageNo: dialogScope.conf.pageNo,
                    pageSize: dialogScope.conf.pageSize,
                    custCustomerBaseModifyHistory: custCustomerBaseModifyHistory
                }
                var promise = $common.get_asyncData("userManageService/findCustCustomerBaseModifyHistoryByPageVo", data);
                promise.then(function (res) {
                    if (res.errorCode == "SUC") {
                        data = res.contextData;
                        dialogScope.updateRecordData.ds = data.records;
                        dialogScope.conf.totalRecord = data.totalRecord;
                    } else {
                        $common.get_tipDialog(res.errorMsg, 'showInform');
                    }
                })
            }
        }],"修改记录")
    }
    
	//级联查询市级列表;（留做样例）
	$scope.City={}; 
	$scope.provinceNameChange = function(val){
		if(!val ){
			return false;
		}
        if(val!=$scope.customerForm.liveProvince){
            $scope.customerForm.liveCity = "";
            $scope.customerForm.liveCounty = "";
            $scope.City.ds = [];
            $scope.County.ds = [];
        }
       var param = {
    		   upRegionCode : val     //注意這裡的參數必須與 RegionInfoService接口的方法中的參數名一樣;
       };
	   var promise = $common.get_asyncData("regionInfoService/findRegionInfoByUpRegionCode", param);	   
       promise.then(function (res) {
       	 var data;
         if (res.errorCode == "SUC") {
             data = res.contextData;
             $scope.City.ds = data;
           //$scope.batchNo = data.batchNo;
         } else {
            $common.get_tipDialog(res.errorMsg, 'showError');
         }
      })
	}
	//级联查询区级列表;（留做样例）
    $scope.County={}; 
    $scope.cityNameChange = function(val){
    	if(!val){
			return false;
		}
        if(val!=$scope.customerForm.liveCity){
    	    $scope.customerForm.liveCounty = "";
            $scope.County.ds = [];
        }
        var param = {
        		upRegionCode : val
        };
        var promise = $common.get_asyncData("regionInfoService/findRegionInfoByUpRegionCode", param);	   
        promise.then(function (res) {
	         var data;
		     if (res.errorCode == "SUC") {
		          data = res.contextData;
		          $scope.County.ds = data;
		        //$scope.batchNo = data.batchNo;
		     } else {
		          $common.get_tipDialog(res.errorMsg, 'showError');
		     }
         })
   }
    


}

