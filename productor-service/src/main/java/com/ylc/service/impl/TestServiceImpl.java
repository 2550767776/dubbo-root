package com.ylc.service.impl;

import com.ylc.service.TestService;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "test success!";
    }
}
