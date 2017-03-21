package com.controller.name;

import com.aliyun.mariana.restful.protocol.RestfulProtocolVo;

import io.swagger.annotations.ApiModelProperty;

public class UserVO implements RestfulProtocolVo{
    /**
     * 
     */
    private static final long serialVersionUID = 5020412916713214169L;
    //姓名
    @ApiModelProperty(value="姓名")
    private String  name;
    @ApiModelProperty(value="年龄")
    private Integer age;
    @ApiModelProperty(value="部门")
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
