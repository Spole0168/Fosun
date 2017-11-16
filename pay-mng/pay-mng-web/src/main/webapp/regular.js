/**
 * Created by htrad0001 on 2016/9/19.
 */


var isNum = /^[0-9]+$/;   //数字
var isInt = /^[1-9]\d*$/;   //正整数
var isChn = /^[\u4e00-\u9fa5]+$/;   //中文
var isChnNum = /^[0-9\u4e00-\u9fa5]+$/;   //中文数字
var isENGNum = /^[a-zA-Z0-9]+$/;// 数字英文
var isChnEng = /^[\u4e00-\u9fa5a-zA-Z]+$/;   //中文英文
var isChnEngNum = /^[a-zA-Z0-9\u4e00-\u9fa5]+$/;   //中文英文数字
var isMec = /^[a-zA-Z0-9\u4e00-\u9fa5_]+$/;	// 数字英文中文下划线
var isCorpName = /^[a-zA-Z0-9\u4e00-\u9fa5_\(\)]+$/;	// 数字英文中文下划线（公司名称）
var isMobile = /1\d{10}/;	// 手机号码
var isMail = /^[a-zA-Z0-9]+@+[a-zA-Z0-9]+[.]+([a-zA-Z]{2,4})$/;// 邮箱
var isCard = /([0-9]{15})|([0-9]{17}([0-9]|X))/;	// 身份证
var isPostCode = /[0-9]{6}/;//邮编
var isHomePhone = /^((([0-9]{1,3})|([0-9]{1,4}))\-)?([0-9]{7,8}?)$/;//家庭电话
//var isMoney = /^([0-9]{1,11})+(.[0-9]{1,2})?$/;//金额
var isMoney = /^(([1-9][0-9]{0,9})|0)(\.[0-9]{1,2})?$/;//金额
var isRate = /^([0-9]{1,2})+(.[0-9]{1,6})?$/;//利率
var isPercent = /^(\d{1,2}(\.\d{1,2})?|100)$/;//比例0-100
var isOrganizationCode = /[0-9A-Z]+-+(X|[0-9])/;//组织机构代码
var isUnifiedSocialCreditCode = /^[0-9A-Z]{17}([0-9])$/;//统一社会信用代码
var isYear = /^[0-9]{0,}$/;//年限