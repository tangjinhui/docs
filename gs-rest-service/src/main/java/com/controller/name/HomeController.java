package com.controller.name;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.controller.param.UserParam;
import com.controller.param.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(description="使用swagger的Controller")
public class HomeController {
    @ApiOperation(value="欢迎使用swagger")
    @RequestMapping(value="/home",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String queryUser(UserParam param){
        return "hello world";
    }
    
    @ApiOperation(value = "搜索运营后台查询接口", notes = "此接口描述xxxxxxxxxxxxx<br/>xxxxxxx<br>值得庆幸的是这儿支持html标签<hr/>", response = String.class)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "vno", value = "车牌", required = false, dataType = "string", paramType = "query", defaultValue = "辽A12345"),
			@ApiImplicitParam(name = "page", value = "page", required = false, dataType = "Integer", paramType = "query", defaultValue = "1"),
			@ApiImplicitParam(name = "count", value = "count", required = false, dataType = "Integer", paramType = "query", defaultValue = "10") })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful — 请求已完成"),
			@ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
			@ApiResponse(code = 401, message = "未授权客户机访问数据"),
			@ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
			@ApiResponse(code = 500, message = "服务器不能完成请求") })
	@RequestMapping(value = "/searchData", method = { RequestMethod.GET,
			RequestMethod.HEAD })
	public String hello(
			@RequestParam(value = "vno", required = false) String vno,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "count", required = false) Integer count) {
		return "test";
	}
	@ApiOperation(value = "搜索运营后台查询接口test2")
	@ApiImplicitParams({ @ApiImplicitParam(paramType = "vo", dataType = "UserVO", name = "param", value = "信息参数", required = true) })
	@RequestMapping(value = "/test", method = { RequestMethod.GET })
	public String hello(UserVO vo) {
		return "vo";
	}
}
