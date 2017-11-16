package com.fosun.paymng.service.mchnt;
import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fosun.paymng.constant.ErrorMsgConstant;
import com.fosun.paymng.dao.PayMchntInfDAO;
import com.fosun.paymng.model.PayMchntInf;
import com.fosun.paymng.model.PayMchntInfExample;
import com.fosun.paymng.utils.ToolUtil;
import com.huateng.base.common.beans.Page;
import com.huateng.scube.exception.ScubeBizException;
import com.huateng.scube.server.annotation.ScubeParam;
import com.huateng.scube.server.annotation.ScubeService;

/**
 * @author Sherlock
 * 
 */
@ScubeService
@Service()
public class MchntMngServiceImpl implements MchntMngService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "PayMchntInfDAO")
	private PayMchntInfDAO payMchntInfDAO;
//	@Resource(name = "httpImageService")
//	HttpImageController httpImageController;
//	@Autowired
//	BdDataDictService bdDataDictService;
	


	// findCustCustomerBase
	@Override
	public Page findMchntInfosByPage(int pageNo, int pageSize,
			PayMchntInf mchntInfo) {
		logger.info("[mchntMngService findMchntInfosByPage] "
				+ " pageNo= " + pageNo + " pageSize= " + pageSize + " mchntId= "
				+ mchntInfo.getMchntId() + " mchntNm= "
				+ mchntInfo.getMchntNm());

		PayMchntInfExample example = new PayMchntInfExample();
		PayMchntInfExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("rec_crt_ts desc");
		if (mchntInfo != null) {
			if (ToolUtil.stringCheck(mchntInfo.getMchntNm())) {
				criteria.andMchntNmLike("%" +mchntInfo.getMchntNm()+ "%");
			}
			if (ToolUtil.stringCheck(mchntInfo.getMchntId())) {
				criteria.andMchntIdEqualTo(mchntInfo.getMchntId());
			}
		}
		int total = payMchntInfDAO.countByExample(example);
		Page p = new Page(pageSize, pageNo, total);
		p.setRecords(payMchntInfDAO.selectByPage(example, p));
		return p;
	}
	
	@Override
	public String addMchntInf(PayMchntInf mchntInfo) {
		logger.info("[mchntMngService addMchntInf] mchntId= "
				+ mchntInfo.getMchntId() + " mchntNm= "
				+ mchntInfo.getMchntNm());
		//throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10020061); iccsErrMsg.js
		if(mchntInfo == null || StringUtils.isEmpty(mchntInfo.getMchntId())|| StringUtils.isEmpty(mchntInfo.getMchntNm())){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010001);
		}
		payMchntInfDAO.insert(mchntInfo);
		return mchntInfo.getMchntId();
	}

	/**
	 * 删除商户
	 * @param mchntInfo
	 * @return
	 */
	public String deleteMchntInfo(@ScubeParam("mchntInfo")PayMchntInf mchntInfo){
		logger.info("[mchntMngService deleteMchntInfo] mchntId= "
				+ mchntInfo.getMchntId() + " mchntNm= " + mchntInfo.getMchntNm());
		//throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10020061); iccsErrMsg.js
		if(mchntInfo == null || StringUtils.isEmpty(mchntInfo.getMchntId())){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010001);
		}
		payMchntInfDAO.deleteByPrimaryKey(mchntInfo.getMchntId());
		return "";
	}

	@Override
	public PayMchntInf findMchntBaseInfo(String mchntId) {
		logger.info("[mchntMngService findMchntBaseInfo] mchntId= " + mchntId);
		//throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10020061); iccsErrMsg.js
		if(StringUtils.isEmpty(mchntId)){
			throw new ScubeBizException(ErrorMsgConstant.ICCS_CU_10010001);
		}
		return payMchntInfDAO.selectByPrimaryKey(mchntId);
	}
	
	
}
