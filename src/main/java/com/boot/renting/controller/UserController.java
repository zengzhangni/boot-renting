package com.boot.renting.controller;


import com.boot.renting.entity.User;
import com.boot.renting.query.UserListQuery;
import com.boot.renting.service.UserService;
import com.boot.renting.utils.ResponseMessage;
import com.boot.renting.utils.exception.BaseException;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "用户")
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("列表")
    @PostMapping("list")
    public ResponseMessage<List> list() {
        return new ResponseMessage<>(userService.list());
    }

    @ApiOperation("分页列表")
    @PostMapping("userList")
    public ResponseMessage<PageInfo<User>> userList(@RequestBody UserListQuery query) {
        return new ResponseMessage<>(userService.userList(query));
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
}
