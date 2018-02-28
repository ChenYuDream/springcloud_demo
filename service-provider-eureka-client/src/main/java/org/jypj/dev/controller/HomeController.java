package org.jypj.dev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu_chen
 * @create 2017-12-11 10:37
 **/
@RestController
public class HomeController {

    @Value("${server.port}")
    String port;

    /**
     * @param name
     * @return
     */
    @RequestMapping("/hi1")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
