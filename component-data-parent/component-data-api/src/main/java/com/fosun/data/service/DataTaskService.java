/**
 * 
 */
package com.fosun.data.service;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.Path;

import com.fosun.data.service.model.DataTaskRep;
import com.fosun.data.service.model.DataTaskReq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 *
 * @author 	abudula
 * @date 	2017年5月6日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年5月6日			新增
 *
 * </pre>
 */
@Api(value="数据服务",tags="任务",consumes="application/json",produces="application/json")
@Path("dataTaskService")
public interface DataTaskService {
	
	@ApiOperation(value="根据数据服务请求数据生成数据任务",httpMethod=HttpMethod.POST,notes="",response=DataTaskRep.class)
	@Path("genDataTask")
	public DataTaskRep genDataTask(@ApiParam(name="dataTaskReq",value="数据服务请求数据",required=true)DataTaskReq dataTaskReq);
	
	@ApiOperation(value="根据任务编号返回任务信息",httpMethod=HttpMethod.POST,notes="",response=DataTaskRep.class)
	@Path("queryDataTask")
	public DataTaskRep queryDataTask(@ApiParam(name="dataTaskReq",value="任务查询服务请求数据",required=true)DataTaskReq dataTaskReq);
	
	@ApiOperation(value="根据商户号查询",httpMethod=HttpMethod.POST,notes="",response=DataTaskRep.class)
	@Path("queryMerchant")
	public DataTaskRep queryMerchant(
			@ApiParam(name="merchant",value="根据商户号查询",required=true)String merchant,
			@ApiParam(name="bizUk",value="外部订单号",required=true)String bizUk
			);
	
}
