package org.jypj.dev.controller;

import org.jypj.dev.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenYu
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi1")
    public String hi1(@RequestParam String name) {
        return "service-ribbon:" + helloService.hi1Service(name);
    }

    @RequestMapping(value = "/hi2")
    public String hi2(@RequestParam String name) {
        return "service-ribbon:" + helloService.hi2Service(name);
    }


}