package com.boot.renting.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("用户")
@TableName("t_user")
public class User implements Serializable {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("用户编码")
    private String userCode;
    @ApiModelProperty("账号")
    private String loginName;
    @ApiModelProperty("密码")
    private String loginPassword;
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("头像")
    private String img;
    @ApiModelProperty("性别")
    private Integer sex;
    @ApiModelProperty("类型 0:管理员 1:用户 2:房东")
    private Integer type;

}
