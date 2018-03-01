package org.jypj.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceProviderHi1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderHi1Application.class, args);
    }
}
