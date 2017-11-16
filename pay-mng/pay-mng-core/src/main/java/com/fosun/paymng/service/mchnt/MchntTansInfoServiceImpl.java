package com.fosun.paymng.service.mchnt;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fosun.paymng.dao.PayChanlPayLogDAO;
import com.fosun.paymng.dao.PayMchntTransLogDAO;
import com.fosun.paymng.model.PayChanlPayLog;
import com.fosun.paymng.model.PayChanlPayLogExample;
import com.fosun.paymng.model.PayMchntTransLog;
import com.fosun.paymng.model.PayMchntTransLogExample;
import com.fosun.paymng.model.PayMchntTransLogExample.Criteria;
import com.fosun.paymng.utils.ToolUtil;
import com.huateng.base.common.beans.Page;
import com.huateng.scube.server.annotation.ScubeService;
@ScubeService
@Service()
public class MchntTansInfoServiceImpl implements MchntTansInfoService{
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name = "PayMchntTransLogDAO")
	private PayMchntTransLogDAO payMchntTransLogDAO;
	@Resource(name = "PayChanlPayLogDAO")
	private PayChanlPayLogDAO payChanlPayLogDAO;
	
	@Override
	public Page queryTransLogByPage(int pageNo, int pageSize,
			PayMchntTransLog transLog) {
		logger.info("queryTransLogByPage(int pageNo, int pageSize,PayMchntTransLog transLog) pageNo ="+pageNo+"|pageSize ="+pageSize+" | transLog="+JSON.toJSONString(transLog));
		
		PayMchntTransLogExample transLogExample = new PayMchntTransLogExample();
		transLogExample.setOrderByClause("sys_trans_dt desc");
		Criteria createCriteria = transLogExample.createCriteria();
		//设置查询条件
		if(null!=transLog){
			if (ToolUtil.stringCheck(transLog.getBankAcctNm())) {
				createCriteria.andBankAcctNmLike("%" +transLog.getBankAcctNm()+ "%");
			}
			
			if (ToolUtil.stringCheck(transLog.getTransCd())) {
				createCriteria.andTransCdEqualTo(transLog.getTransCd());
			}
			if (ToolUtil.stringCheck(transLog.getMchntId())) {
				createCriteria.andMchntIdEqualTo(transLog.getMchntId());
			}
			if (ToolUtil.stringCheck(transLog.getMchntTransDt())) {
				createCriteria.andMchntTransDtEqualTo(transLog.getMchntTransDt());
			}
			if (ToolUtil.stringCheck(transLog.getMchntTransId())) {
				createCriteria.andMchntTransIdEqualTo(transLog.getMchntTransId());
			}
			if (ToolUtil.stringCheck(transLog.getTransSt())) {
				createCriteria.andTransStEqualTo(transLog.getTransSt());
			}
		}
		int total = payMchntTransLogDAO.countByExample(transLogExample);
		Page page = new Page(pageSize, pageNo, total);
		page.setRecords(payMchntTransLogDAO.selectByPage(transLogExample, page));
		logger.info("queryTransLogByPage(int pageNo, int pageSize,PayMchntTransLog transLog)-Result page="+JSON.toJSONString(page));
		return page;
	}
	@Override
	public PayMchntTransLog getTransLogById(String transSeqId) {
		logger.info("getTransLogById(String transSeqId) transSeqId ="+transSeqId);
		PayMchntTransLog obj = payMchntTransLogDAO.selectByPrimaryKey(transSeqId);
		return obj;
	}
	@Override
	public List<PayChanlPayLog> queryPayLogsList(String transSeqId) {
		logger.info("queryPayLogsList(String transSeqId) transSeqId ="+transSeqId);
		PayChanlPayLogExample payLogExample = new PayChanlPayLogExample();
		payLogExample.createCriteria().andTransSeqIdEqualTo(transSeqId);
		List<PayChanlPayLog> selectByExample = payChanlPayLogDAO.selectByExample(payLogExample);
		return selectByExample;
	}
	
	
	
	
	
	
}
