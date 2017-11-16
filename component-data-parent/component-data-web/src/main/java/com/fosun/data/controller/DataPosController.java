package com.fosun.data.controller;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fosun.component.base.util.BeanUtil;
import com.fosun.data.service.CreditRiskService;
import com.fosun.data.service.DataTaskService;
import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.CreditRiskReq;
import com.fosun.data.service.model.DataTaskRep;
import com.fosun.data.service.model.DataTaskReq;

@Controller
@RequestMapping(value = "/pos")
public class DataPosController {
	private static Logger logger = LoggerFactory.getLogger(DataPosController.class);
	
	@Autowired
	private DataTaskService dataTaskService;
	
	@Autowired
	private CreditRiskService creditRiskService;
	
	@RequestMapping(value = "/genDataTask", method = RequestMethod.POST)
	@ResponseBody
	public String genDataTask(HttpServletRequest request) {
		logger.info("genDataTask(HttpServletRequest request) request="+request);
		DataTaskReq dataTaskReq = BeanUtil.map2Bean(request.getParameterMap(), DataTaskReq.class);
		DataTaskRep rep = dataTaskService.genDataTask(dataTaskReq);
		return JSONObject.fromObject(rep).toString();
	}

	@RequestMapping(value = "/queryDataTask", method = RequestMethod.POST)
	@ResponseBody
	public String queryDataTask(HttpServletRequest request) {
		logger.info("queryDataTask(HttpServletRequest request) request="+request);
		DataTaskReq dataTaskReq = BeanUtil.map2Bean(request.getParameterMap(), DataTaskReq.class);
		DataTaskRep rep = dataTaskService.queryDataTask(dataTaskReq);
		return JSONObject.fromObject(rep).toString();
	}
	
	@RequestMapping(value = "/queryMerchant", method = RequestMethod.POST)
	@ResponseBody
	public String queryMerchant(HttpServletRequest request) {
		logger.info("queryMerchant(HttpServletRequest request) request="+request);
		String merchant = request.getParameter("merchant");
		String bizUk = request.getParameter("bizUk");
		DataTaskRep rep = dataTaskService.queryMerchant(merchant, bizUk);
		return JSONObject.fromObject(rep).toString();
	}

	@RequestMapping(value = "/riskRating", method = RequestMethod.POST)
	@ResponseBody
	public String riskRating(HttpServletRequest request) {
		logger.info("queryDataTask(HttpServletRequest request) request="+request);
		CreditRiskReq creditRiskReq = BeanUtil.map2Bean(request.getParameterMap(), CreditRiskReq.class);
		CreditRiskRep rep = creditRiskService.riskRating(creditRiskReq);
		return JSONObject.fromObject(rep).toString();
	}

}
