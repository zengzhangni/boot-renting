package com.boot.renting.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zengzhangni
 * @date 2019/12/10
 */
@Data
public class Query implements Serializable {
    @ApiModelProperty("分页下标")
    public Integer pageNo = 1;
    @ApiModelProperty("分页数量")
    public Integer pageSize = 10;
}
