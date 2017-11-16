/**
 * 
 */
package com.fosun.data.service;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.Path;

import com.alibaba.fastjson.JSONObject;
import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.ZMXYReq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 * 
 * @author Spole
 *
 */
@Api(value="芝麻信用相关接口",tags="芝麻信用",consumes="application/json",produces="application/json")
@Path("ZMXYService")
public interface ZMXYService {
	
	@ApiOperation(value="欺诈关注清单",httpMethod=HttpMethod.POST,notes="",response=CreditRiskRep.class)
	@Path("zmxyCreditAntifraudRiskList")
	public JSONObject zmxyCreditAntifraudRiskList(@ApiParam(name="ZMXYReq",value="欺诈关注清单",required=true)ZMXYReq ZMXYReq);
	
	
	@ApiOperation(value="欺诈信息验证",httpMethod=HttpMethod.POST,notes="",response=CreditRiskRep.class)
	@Path("zmxyCreditAntifraudVerify")
	public JSONObject zmxyCreditAntifraudVerify(@ApiParam(name="ZMXYReq",value="欺诈信息验证",required=true)ZMXYReq ZMXYReq);
	
	
	@ApiOperation(value="申请欺诈评分",httpMethod=HttpMethod.POST,notes="",response=CreditRiskRep.class)
	@Path("zmxyCreditAntifraudScore")
	public JSONObject zmxyCreditAntifraudScore(@ApiParam(name="ZMXYReq",value="申请欺诈评分",required=true)ZMXYReq ZMXYReq);
	
}
