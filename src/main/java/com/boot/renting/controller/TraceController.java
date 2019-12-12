package com.boot.renting.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boot.renting.entity.Trace;
import com.boot.renting.query.UserListQuery;
import com.boot.renting.service.TraceService;
import com.boot.renting.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "足迹")
@RestController
@RequestMapping("trace")
public class TraceController {
    @Resource
    private TraceService traceService;

    @ApiOperation("分页列表")
    @PostMapping("orderPageList")
    public ResponseMessage<IPage<Trace>> orderPageList(@RequestBody UserListQuery query) {
        Page<Trace> page = new Page<>(query.getPageNo(), query.getPageSize());
        page.setDesc("id");
        return new ResponseMessage<>(traceService.page(page));
    }

    @ApiOperation("保存")
    @PostMapping("save")
    public ResponseMessage<Boolean> save(@RequestBody Trace trace) {
        return new ResponseMessage<>(traceService.save(trace));
    }

    @ApiOperation("通过id删除")
    @GetMapping("removeById/{id}")
    public ResponseMessage<Boolean> removeById(@PathVariable("id") Integer id) {
        return new ResponseMessage<>(traceService.removeById(id));
    }


}
