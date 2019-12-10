package com.boot.renting.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.renting.entity.User;
import com.boot.renting.mapper.UserMapper;
import com.boot.renting.query.UserListQuery;
import com.boot.renting.service.UserService;
import com.boot.renting.utils.create.NoUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

    private static Map<String, String> redis = new HashMap<>(10);

    @Override
    public PageInfo<User> userList(UserListQuery query) {
        PageHelper.startPage(query.getPageNo(), query.getPageSize());
        List<User> users = userMapper.selectList(null);
        return new PageInfo<>(users);
    }

    @Override
    public User queryByUserCode(String userCode) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_code", userCode);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public User queryByLoginName(String loginName) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("login_name", loginName);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public User queryByPhone(String phone) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("phone", phone);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public String sendCode(String phone) {
//        User user = queryByPhone(phone);
//        if (user == null) {
//            throw new BaseException("账号不存在");
//        }

        String code = NoUtil.getRandom(4);
        redis.put(phone, code);
        return code;
    }

    @Override
    public Object login(User user) {
        String redisCode = redis.get(user.getPhone());

        return "OK";
    }

}
