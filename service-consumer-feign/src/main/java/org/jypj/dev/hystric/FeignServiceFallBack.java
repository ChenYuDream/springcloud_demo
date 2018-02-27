package org.jypj.dev.hystric;

import org.jypj.dev.service.FeignService;

/**
 * @author ChenYu
 */
public class FeignServiceFallBack implements FeignService {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}