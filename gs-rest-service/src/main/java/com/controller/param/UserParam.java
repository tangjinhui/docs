package com.controller.param;

import com.aliyun.mariana.restful.protocol.RestfulProtocolVo;

import io.swagger.annotations.ApiParam;
public class UserParam implements RestfulProtocolVo{
    /**
     * 
     */
    private static final long serialVersionUID = 5020412916713214169L;
    //姓名
    @ApiParam(value="姓名")
    private String  name;
    @ApiParam(value="年龄")
    private Integer age;
    @ApiParam(value="部门")
    private String  depno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno;
    }

}
