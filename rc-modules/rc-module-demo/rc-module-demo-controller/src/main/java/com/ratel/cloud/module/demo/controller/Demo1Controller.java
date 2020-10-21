package com.ratel.cloud.module.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("demo1")
public class Demo1Controller {

    @GetMapping("/hello")
    @ApiOperation("demo1 测试")
    public String hello(){
        return "hello";
    }

}
