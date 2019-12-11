package com.boot.renting.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zengzhangni
 * @version 1.0 2019年8月22日
 */
@Data
@ApiModel(value = "菜单表")
public class Menu implements Serializable {

    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("父id")
    private Integer pId;
    @ApiModelProperty("菜单名字")
    private String name;
    @ApiModelProperty("首页地址")
    private String indexUrl;
    @ApiModelProperty("图标")
    private String icon;
    @ApiModelProperty(value = "子菜单", hidden = true)
    private List<Menu> childs;

}