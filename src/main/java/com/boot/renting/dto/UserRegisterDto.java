package com.boot.renting.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zengzhangni
 * @date 2019/12/11
 */
@Data
@ApiModel("用户注册条件")
public class UserRegisterDto {

    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("手机号")
    private String name;
    @ApiModelProperty("验证码")
    private String code;
    @ApiModelProperty("类型 0:管理员 1:用户 2:房东")
    private Integer type;

}
