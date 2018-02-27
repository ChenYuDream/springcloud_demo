package org.jypj.dev.service;

import org.jypj.dev.hystric.FeignServiceFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yu_chen
 * @date 2017/4/6
 */
@FeignClient(value = "service-hi", fallback = FeignServiceFallBack.class)
public interface FeignService {


    /**
     * 声明式的服务消费
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
