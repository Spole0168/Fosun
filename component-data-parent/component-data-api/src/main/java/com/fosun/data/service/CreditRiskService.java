/**
 * 
 */
package com.fosun.data.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.Path;

import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.CreditRiskReq;
/**
 * 
 * @author Spole
 *
 */
@Api(value="征信风险评估",tags="信用风险",consumes="application/json",produces="application/json")
@Path("creditRiskService")
public interface CreditRiskService {
	
	@ApiOperation(value="根据信息评估用户风险等级",httpMethod=HttpMethod.POST,notes="",response=CreditRiskRep.class)
	@Path("riskRating")
	public CreditRiskRep riskRating(@ApiParam(name="creditRiskReq",value="风险评估参数",required=true)CreditRiskReq creditRiskReq);
	
	
}
