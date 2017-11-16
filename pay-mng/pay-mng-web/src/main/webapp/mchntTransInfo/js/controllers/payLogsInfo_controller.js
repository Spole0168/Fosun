/**
 * Created by htrad0001 on 2016/8/17.
 */
var payLogsInfoController = function ($scope, $common, dataDeliver, $state) {
    var data = dataDeliver.getter();
    var transSeqId = data.transSeqId;
    var param = {"transSeqId": transSeqId};
    var state = data.state;   //只读状态
    init();
    function init(){
        if(state=="readonly"){
            $scope.readonly = true;
        }else{
            $scope.readonly = false;
        }
    }
    var payLogList = $common.get_asyncData("mchntTransService/queryPayLogsList", param);
    payLogList.then(function (res) {
        if (res.errorCode == "SUC") {
        	var rc = res.contextData;
        	for(var i =0;i<rc.length;i++){
            	var obj = rc[i];
            	obj.transAmt = obj.transAmt/100;
            }
            $scope.mchntPayLogsData.ds = rc;
        } else {
            $common.get_tipDialog(res.errorMsg, 'showInform');
        }
    });
    $scope.cancel_onClick = function () {
    	$state.go("transLogList");
    }
    
}

