package com.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.db.sys.dao")
public class DbTravel1Application {

	public static void main(String[] args) { 
		SpringApplication.run(DbTravel1Application.class, args);
	}

}
