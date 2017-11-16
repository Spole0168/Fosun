/**
 * Created by yanbingwei on 2016/8/9.
 */
var transLogListController = function ($scope, $common, dataDeliver, $state) {
	//初始化变量
    $scope.custMode = {modelId: ""};
    $scope.condition = {};
    $scope.custData = {};
    $scope.selected = {select: []}
    $scope.conf = {
        pageNo: 1,
        pageSize: 10
    };
    $scope.$watch("conf.pageNo+conf.pageSize", queryMchntInfo);
    //查询方法
    function queryMchntInfo() {
        $scope.custMode = {modelId: ""};
        if ($scope.condition.state == null) {
            $scope.condition.state = "01,02";
        }
        var data = {
            pageNo: $scope.conf.pageNo,
            pageSize: $scope.conf.pageSize,
            transLog : $scope.condition
        }
        //这两行代码解决: 传对象参数为空的问题;
        var dataString = JSON.stringify(data);
        data = JSON.parse(dataString);
        var promise = $common.get_asyncData("mchntTransService/queryTransLogByPage", data);
        promise.then(function (res) {
            var data;
            if (res.errorCode == "SUC") {
                data = res.contextData;
                var rc = data.records;
                for(var i =0;i<rc.length;i++){
                	var obj = rc[i];
                	obj.transAmt = obj.transAmt/100;
                }
                $scope.mchntTransData.ds = rc;
                $scope.conf.totalRecord = data.totalRecord;
            } else {
                $common.get_tipDialog(res.errorMsg, 'showInform');
            }
        })
        
    }
    //查询按钮事件
    $scope.submit_onClick = function () {
    	//重新获取 state;
    	//var stateNow = $scope.condition.state;
    	queryMchntInfo();
    }
    //重置按钮事件
    $scope.reset_onClick = function () {
        $scope.$apply(function () {
            $scope.condition = {state: "01,02"};
        })
        
    }
    //用户详情
    $scope.detail_onClick = function () {
        if ($scope.selected.select.length != 1) {
            $common.get_tipDialog('只能选择一条记录！', 'showInform');
        } else {
            var data = {
            	transSeqId : $scope.selected.select[0].transSeqId,
            	state : "readonly"
            };
            $state.go("transLogDetail");//跳转
            dataDeliver.setter(data);	//传值[可选]
        }
    };
}