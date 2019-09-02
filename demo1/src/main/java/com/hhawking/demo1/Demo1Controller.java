package com.hhawking.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
* @title: TODO
* @Author: HH
* @Date: 2019-9-2 9:59
*/
@RestController
public class Demo1Controller {

    @Autowired
    private DemoClient demoClient;

    @GetMapping("map")
    public Map testMap(){
        Map<String ,Object> map = new HashMap<>();
        map.put("id",115);
        map.put("msg","发送成功");
        return demoClient.getMap(map);
    }

    @GetMapping("string")
    public String getString(){
        return demoClient.getString();
    }
}
