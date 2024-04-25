package com.example.To.Do.App;

import java.beans.JavaBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan

@EnableJpaRepositories(basePackages="com.example.To.Do.App.Repo")
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages="com.example.To.Do.App.Model")
@SpringBootApplication
public class ToDoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

}
