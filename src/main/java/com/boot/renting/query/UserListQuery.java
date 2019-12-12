package com.boot.renting.query;

import lombok.Data;

/**
 * @author zengzhangni
 * @date 2019/12/10
 */
@Data
public class UserListQuery extends Query {

    private Integer type;
    private String userCode;
    private String key;
}
