package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ex")
public class SpringBootRestEx {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestEx.class, args);
	}
}
