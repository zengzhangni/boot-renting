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
@ApiModel("足迹")
@TableName("t_trace")
public class Trace implements Serializable {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("用户编码")
    private String userCode;
    @ApiModelProperty("房子编码")
    private String houseCode;
}
