package com.example.sbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
public class SbtestApplication {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	@RequestMapping("/aa")
	public String home2() {
		return "Hello Docker World 2";
	}

	@RequestMapping("/aa/bb")
	public String home3() {
		return "Hello Docker World 3";
	}

	@RequestMapping("/aa/cc")
	public String home4() {
		return "Hello Docker World 4";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SbtestApplication.class, args);
	}

}
