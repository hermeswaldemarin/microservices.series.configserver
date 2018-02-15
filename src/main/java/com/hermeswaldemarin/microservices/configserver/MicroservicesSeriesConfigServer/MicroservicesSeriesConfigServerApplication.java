package com.hermeswaldemarin.microservices.configserver.MicroservicesSeriesConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicesSeriesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesSeriesConfigServerApplication.class, args);
	}
}
