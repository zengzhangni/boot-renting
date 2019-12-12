package com.boot.renting.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.renting.entity.Trace;
import com.boot.renting.mapper.TraceMapper;
import com.boot.renting.service.TraceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TraceServiceImpl extends ServiceImpl<TraceMapper, Trace> implements TraceService {
    @Resource
    private TraceMapper traceMapper;

}
