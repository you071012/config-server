package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.configserver.*"})
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplicationTests.class, args);
	}

}
