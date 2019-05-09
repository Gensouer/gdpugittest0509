package net.togogo.sbth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThController {

    @RequestMapping("/hello")
    public String hello(Map<String ,Object>map){
        map.put("hello","你好啊！");
        return "hello";
    }
}
