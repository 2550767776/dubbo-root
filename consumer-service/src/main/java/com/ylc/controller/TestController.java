package com.ylc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ylc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        return testService.test();
    }
}
