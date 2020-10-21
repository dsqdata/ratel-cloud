package com.ratel.cloud.gateway.hystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HystrixHandle {

    @GetMapping(value = "/fallbackhystrix")
    public String hystrixFallback() {
        return "服务器繁忙,请稍候再试！";
    }

}
