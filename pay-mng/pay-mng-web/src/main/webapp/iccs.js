/**
 * Created by htrad0001 on 2016/9/19.
 */
//商户管理
// 商户基本信息新增
function addMchntInfoCheck(data,$common) {
    var mchntNm = data.mchntNm;
    var mchntAbbr = data.mchntAbbr;
    if (mchntNm.length >20) {
        $common.get_tipDialog(ICCS_CU_10010002, 'showInform');
        return false;
    } else if (mchntAbbr.length >10) {
        $common.get_tipDialog(ICCS_CU_10010003, 'showInform');
        return false;
    } else{
        return true;
    }
}


