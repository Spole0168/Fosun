/**
 * Created by htrad0001 on 2016/8/17.
 */
var transLogInfoController = function ($scope, $common, dataDeliver, $state) {
//	alert("QQQQQQQ");
    var data = dataDeliver.getter();
    var transSeqId = data.transSeqId;
    var param = {"transSeqId": transSeqId};
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
    var promise = $common.get_asyncData("mchntTransService/getTransLogById", param);
    promise.then(function (res) {
        if (res.errorCode == "SUC") {
        	//处理金额问题  除以100
        	var obj = res.contextData;
        	obj.transAmt = obj.transAmt/100;
            $scope.transLogDetailBaseInfoForm = obj;
        } else {
            $common.get_tipDialog(res.errorMsg, 'showInform');
        }
    });
    $scope.cancel_onClick = function () {
    	$state.go("transLogList");
    }
    


}

