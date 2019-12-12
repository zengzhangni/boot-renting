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
@ApiModel("订单")
@TableName("t_order")
public class Order implements Serializable {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("订单编号")
    private String orderCode;
    @ApiModelProperty("用户编码")
    private String userCode;
    @ApiModelProperty("房子编码")
    private String houseCode;
    @ApiModelProperty("金额")
    private Integer price;

}
