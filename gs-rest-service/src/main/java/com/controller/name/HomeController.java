package com.controller.name;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aliyun.mariana.restful.Restful;
import com.aliyun.mariana.restful.protocol.BeanProtocol;
import com.controller.param.UserParam;

import io.swagger.annotations.ApiOperation;

@RestController
public class HomeController {
    @ApiOperation(value="欢迎首页home")
    @RequestMapping(value="/home",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public BeanProtocol<UserVO> queryUser(UserParam param){
        BeanProtocol<UserVO> result = Restful.createMockBeanProtocol(UserVO.class);
        return result;
    }
}
