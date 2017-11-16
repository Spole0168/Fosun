package com.fosun.paymng.service.banklimit;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fosun.paymng.constant.ErrorMsgConstant;
import com.fosun.paymng.dao.PayBankInfDAO;
import com.fosun.paymng.dao.PayBankLimitDAO;
import com.fosun.paymng.model.PayBankInf;
import com.fosun.paymng.model.PayBankInfExample;
import com.fosun.paymng.model.PayBankLimit;
import com.fosun.paymng.model.PayBankLimitExample;
import com.huateng.base.common.beans.Page;
import com.huateng.scube.exception.ScubeBizException;
import com.huateng.scube.server.annotation.ScubeParam;
import com.huateng.scube.server.annotation.ScubeService;


/**
 * 
 * @author along.wu
 * @date 2017年9月12日
 */
@ScubeService
@Service()
public class BankLimitMngServiceImpl implements BankLimitMngService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "PayBankLimitDAO")
	private PayBankLimitDAO payBankLimitDAO;
	
	@Resource(name = "PayBankInfDAO")
	private PayBankInfDAO payBankInfDAO;
	
	@Override
	public Page findBankLimitByPage(int pageNo, int pageSize,
			PayBankLimit payBankLimit) {
		logger.info("[bankLimitMngService findBankLimitByPage] "
				+ " pageNo= " + pageNo + " pageSize= " + pageSize + " payType= "
				+ payBankLimit.getPayType() + " bankType= "
				+ payBankLimit.getBankType());
		
		PayBankLimitExample example = new PayBankLimitExample();
		PayBankLimitExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("bank_type asc");
		if(payBankLimit != null){
			if (StringUtils.isNotEmpty(payBankLimit.getPayType())) {
				criteria.andPayTypeEqualTo(payBankLimit.getPayType());
			}
			if(StringUtils.isNotEmpty(payBankLimit.getBankType())){
				criteria.andBankTypeEqualTo(payBankLimit.getBankType());
			}
//			if(StringUtils.isNotEmpty(payBankLimit.getBankName())){
//				criteria.andBankNameEqualTo(payBankLimit.getBankName());
//			}
		}
		int total = payBankLimitDAO.countByExample(example);
		Page page = new Page(pageSize, pageNo, total);
		page.setRecords(payBankLimitDAO.selectByPage(example, page));
		return page;
	}
	
	@Override
	public String addBankLimit(PayBankLimit payBankLimit) {
		logger.info("[bankLimitMngService addBankLimit] payType= "
				+ payBankLimit.getPayType() + " bankType= "
				+ payBankLimit.getBankType());
		
		if(payBankLimit == null || StringUtils.isEmpty(payBankLimit.getPayType()) || StringUtils.isEmpty(payBankLimit.getBankType())){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010001);
		}
		if(!validatorUnique(payBankLimit)){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010003);
		}
		String bankName = queryBankNmByBankEcd(payBankLimit);
		if(StringUtils.isNotEmpty(bankName)){
			payBankLimit.setBankName(bankName);
		}
		payBankLimitDAO.insert(payBankLimit);
		return payBankLimit.getBankType();
	}
	
	/**
	 * 查询是否存在相同渠道的银行限额数据
	 * @param payBankLimit
	 * @return
	 */
	private boolean validatorUnique(PayBankLimit payBankLimit){
		PayBankLimitExample example = new PayBankLimitExample();
		PayBankLimitExample.Criteria criteria = example.createCriteria();
		criteria.andPayTypeEqualTo(payBankLimit.getPayType());
		criteria.andBankTypeEqualTo(payBankLimit.getBankType());
		List<PayBankLimit> limitList = payBankLimitDAO.selectByExample(example);
		if(limitList != null && limitList.size() > 0){//存在相同数据
			return false;
		}
		return true;
	}
	
	/**
	 * 通过银行编码查询银行名称
	 * @param payBankLimit
	 * @return
	 */
	private String queryBankNmByBankEcd(PayBankLimit payBankLimit){
		PayBankInfExample bankInfExample = new PayBankInfExample();
		PayBankInfExample.Criteria bankInfCriteria = bankInfExample.createCriteria();
		bankInfCriteria.andBankEcdEqualTo(payBankLimit.getBankType());
		List<PayBankInf> list = payBankInfDAO.selectByExample(bankInfExample);
		if(list != null && list.size() > 0){
			PayBankInf payBankInf = list.get(0);
			if(payBankInf != null && StringUtils.isNotEmpty(payBankInf.getBankNm())){
				return payBankInf.getBankNm();
			}
		}
		return null;
	}

	/**
	 * 删除商户
	 * @param mchntInfo
	 * @return
	 */
	public String deleteBankLimit(@ScubeParam("payBankLimit")PayBankLimit payBankLimit){
		logger.info("[bankLimitMngService deleteBankLimit] payType= "
				+ payBankLimit.getPayType() + " bankType= "
				+ payBankLimit.getBankType());
		if(payBankLimit == null || StringUtils.isEmpty(payBankLimit.getPayType()) || StringUtils.isEmpty(payBankLimit.getBankType())){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010001);
		}
		PayBankLimitExample example = new PayBankLimitExample();
		PayBankLimitExample.Criteria criteria = example.createCriteria();
		criteria.andPayTypeEqualTo(payBankLimit.getPayType());
		criteria.andBankTypeEqualTo(payBankLimit.getBankType());
		int result = payBankLimitDAO.deleteByExample(example);
		if(result != 1){
			return ErrorMsgConstant.ICCS_CU_10010001;
		}
		return "";
	}

	@Override
	public PayBankLimit findBankLimitBaseInfo(PayBankLimit payBankLimit) {
		logger.info("[bankLimitMngService findBankLimitBaseInfo] payType= "
				+ payBankLimit.getPayType() + " bankType= "
				+ payBankLimit.getBankType());
		if(payBankLimit == null || StringUtils.isEmpty(payBankLimit.getPayType()) || StringUtils.isEmpty(payBankLimit.getBankType())){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010001);
		}
		PayBankLimitExample example = new PayBankLimitExample();
		PayBankLimitExample.Criteria criteria = example.createCriteria();
		criteria.andPayTypeEqualTo(payBankLimit.getPayType());
		criteria.andBankTypeEqualTo(payBankLimit.getBankType());
		List<PayBankLimit> list = payBankLimitDAO.selectByExample(example);
		if(list != null && list.size()==1){
			return list.get(0);
		}
		return null;
	}
	
	
}
