package com.wjx.reading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReadingEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingEurekaApplication.class, args);
	}

}
