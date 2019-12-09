package com.boot.renting.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户")
public class User {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("账号")
    private String userName;
    @ApiModelProperty("密码")
    private String userPassword;
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("头像")
    private String img;
    @ApiModelProperty("性别")
    private Integer sex;
    @ApiModelProperty("类型 0:管理员 1:用户 2:房东")
    private Integer type;

}
