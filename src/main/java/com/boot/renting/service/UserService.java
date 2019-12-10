package com.boot.renting.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.boot.renting.entity.User;
import com.boot.renting.query.UserListQuery;
import com.github.pagehelper.PageInfo;


public interface UserService extends IService<User> {

    PageInfo<User> userList(UserListQuery query);

    User queryByUserCode(String userCode);

    User queryByLoginName(String loginName);

    User queryByPhone(String phone);
}
