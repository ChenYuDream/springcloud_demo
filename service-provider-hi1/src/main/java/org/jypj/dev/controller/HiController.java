package org.jypj.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu_chen
 * @create 2018-03-01 10:04
 **/
@RestController
public class HiController {

    @GetMapping("/hi1")
    public String sayHi() {

        return "service-hi-hi1";
    }
}
