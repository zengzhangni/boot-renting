package com.boot.renting.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zengzhangni
 * @date 2019/12/11
 */
@Data
@ApiModel("系统用户登录条件")
public class SystemUserLoginDto {

    @ApiModelProperty("账号")
    private String loginName;
    @ApiModelProperty("密码")
    private String loginPassword;
}
