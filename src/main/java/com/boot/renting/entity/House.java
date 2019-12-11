package com.boot.renting.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zengzhangni
 * @date 2019/12/10
 */
@Data
@ApiModel("房子")
@TableName("house")
public class House implements Serializable {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("发布人")
    private String userCode;
    @ApiModelProperty("标题")
    private String subject;
    @ApiModelProperty("房子编码")
    private String houseCode;
    @ApiModelProperty("房子图片")
    private String houseImg;
    @ApiModelProperty("房子地址")
    private String houseAddress;
    @ApiModelProperty("金额")
    private Integer price;
    @ApiModelProperty("备注")
    private String remark;
}
