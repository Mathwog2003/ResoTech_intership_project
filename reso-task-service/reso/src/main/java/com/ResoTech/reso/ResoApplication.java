package com.ResoTech.reso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResoApplication.class, args);
	}





}
