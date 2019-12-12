package com.boot.renting.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("足迹详情")
public class TraceInfoVo {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("标题")
    private String subject;
    @ApiModelProperty("房东姓名")
    private String name;
    @ApiModelProperty("房东手机号")
    private String phone;
    @ApiModelProperty("地址")
    private String houseAddress;
    @ApiModelProperty("房源金额")
    private Integer price;
    @ApiModelProperty("房源备注")
    private String remark;
}
