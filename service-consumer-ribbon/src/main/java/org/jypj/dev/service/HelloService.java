package org.jypj.dev.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ChenYu
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
     * @param name
     * @return
     */
    public String hi1Service(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi1?name=" + name, String.class);
    }

    public String hi2Service(String name) {
        return restTemplate.getForObject("http://service-hi/hi2?name=" + name, String.class);
    }
}