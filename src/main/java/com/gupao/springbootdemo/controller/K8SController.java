package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {

    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s 第77777次提交";
    }
}
