package com.hhawking.demo1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(name = "demo2")
public interface DemoClient {

    @PostMapping(value = "/getMap")
    Map getMap(Map map);

    @GetMapping(value = "/getString")
    String getString();

    @GetMapping(value = "/getList")
    Map getList();

    @GetMapping(value = "/getVo")
    EngineBand getVo();
}