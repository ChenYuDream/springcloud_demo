package org.jypj.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceProviderHi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderHi2Application.class, args);
	}
}
