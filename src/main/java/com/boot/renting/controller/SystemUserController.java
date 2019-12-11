package com.boot.renting.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.renting.dto.SystemUserLoginDto;
import com.boot.renting.dto.UserLoginDto;
import com.boot.renting.dto.UserRegisterDto;
import com.boot.renting.entity.User;
import com.boot.renting.query.UserListQuery;
import com.boot.renting.service.UserService;
import com.boot.renting.utils.CookieUtil;
import com.boot.renting.utils.HttpContextUtils;
import com.boot.renting.utils.ResponseMessage;
import com.boot.renting.utils.create.NoUtil;
import com.boot.renting.utils.exception.BaseException;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Api(tags = "系统用户")
@RestController
@RequestMapping("systemUser")
public class SystemUserController {

    @Resource
    private UserService userService;

    @ApiOperation("cs")
    @GetMapping("cs")
    public ResponseMessage cs(Integer num) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User user = new User();
            user.setName("管理员" + NoUtil.getRandom(7));
            user.setUserCode(NoUtil.getUserCode());
            user.setLoginName("admin" + NoUtil.getRandom(5));
            user.setLoginPassword(NoUtil.getRandom(8));
            user.setSex(new Random().nextInt(2));
            user.setType(0);
            list.add(user);
        }
        return new ResponseMessage<>(userService.saveBatch(list));
    }

    @ApiOperation("获取用户信息")
    @GetMapping("getInfo")
    public ResponseMessage<User> getInfo() {
        String systemUserName = CookieUtil.getValue(HttpContextUtils.getHttpServletRequest(), "systemUserName");
        return new ResponseMessage<>(userService.queryByLoginName(systemUserName));
    }

    @ApiOperation("分页列表")
    @PostMapping("systemUserPageList")
    public ResponseMessage<IPage<User>> systemUserPageList(@RequestBody UserListQuery query) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("type", 0);
        IPage<User> page = new Page<>(query.getPageNo(), query.getPageSize());
        return new ResponseMessage<>(userService.page(page, wrapper));
    }

    @ApiOperation("保存")
    @PostMapping("save")
    public ResponseMessage<Boolean> save(@RequestBody User user) {
        User user1 = userService.queryByLoginName(user.getLoginName());
        if (user1 != null) {
            throw new BaseException("账号已存在");
        }
        return new ResponseMessage<>(userService.save(user));
    }

    @ApiOperation("通过id更新")
    @PostMapping("updateById")
    public ResponseMessage<Boolean> updateById(@RequestBody User user) {
        return new ResponseMessage<>(userService.updateById(user));
    }

    @ApiOperation("通过id删除")
    @GetMapping("removeById/{id}")
    public ResponseMessage<Boolean> removeById(@PathVariable("id") Integer id) {
        return new ResponseMessage<>(userService.removeById(id));
    }

    @ApiOperation("登录")
    @PostMapping("login")
    public ResponseMessage<String> systemUserLogin(@RequestBody SystemUserLoginDto loginDto) {
        return new ResponseMessage<>(userService.systemUserLogin(loginDto));
    }

    @ApiOperation("注册")
    @PostMapping("register")
    public ResponseMessage<String> register(@RequestBody UserRegisterDto dto) {
        return new ResponseMessage<>(userService.register(dto));
    }
}
