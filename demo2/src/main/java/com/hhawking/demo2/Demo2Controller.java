package com.hhawking.demo2;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Demo2Controller {

    @GetMapping("getString")
    public String getString(){
        return "拿到了String";
    }

    @PostMapping("getMap")
    public Map getMap(@RequestBody Map<String,Object> map){
        EngineBand band = new EngineBand();
        band.setId(666);
        band.setName("new");
        band.setDiscription("新建的对象");
        map.put("BBB",band);
        return map;
    }

    @GetMapping("param")
    public Map testParam(String a,String b,@RequestParam(required = false) String c){
        Map<String,String> map = new HashMap<>(3);
        map.put("a",a);
        map.put("b",b);
        map.put("c",c);
        return map;
    }
}
