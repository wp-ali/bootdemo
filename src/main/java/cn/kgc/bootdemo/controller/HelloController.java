package cn.kgc.bootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloController {


    @RequestMapping("/hello")
    public String toString() {

        return "hello java 这一次热部署成功了";
    }
}
