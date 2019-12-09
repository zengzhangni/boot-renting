package com.boot.renting.controller;


import com.boot.renting.service.UserService;
import com.boot.renting.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "用户")
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("list")
    @ApiOperation("列表")
    public ResponseMessage<List> list() {
        return new ResponseMessage<>(userService.list());
    }
}
