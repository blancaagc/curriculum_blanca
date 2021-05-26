package com.bagc.curriculumapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CurriculumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurriculumApiApplication.class, args);
	}

}
