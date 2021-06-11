package com.suswagata.Webseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.suswagata.Webseries.controller","com.suswagata.Webseries.repo"})
@EntityScan("com.suswagata.Webseries.model")
@EnableJpaRepositories
public class WebseriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebseriesApplication.class, args);
	}

}
