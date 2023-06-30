package com.miniproject.studentmicroimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentMicroImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroImplApplication.class, args);
	}

}
