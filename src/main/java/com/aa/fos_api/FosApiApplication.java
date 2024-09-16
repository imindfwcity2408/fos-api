package com.aa.fos_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.aa.cc","com.aa.fos_api"})
public class FosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FosApiApplication.class, args);
	}

}
