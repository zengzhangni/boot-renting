package com.boot.renting.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zengzhangni
 * @date 2019/12/10
 */
@Data
@ApiModel("订单")
@TableName("order")
public class Order implements Serializable {
}
