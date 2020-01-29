package com.project.helpinghands;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.project.helpinghands.ngo.controller","com.project.helpinghands.ngo.repository","com.project.helpinghands.services","com.project.helpinghands.entity"})
@EnableJpaRepositories
@EntityScan
public class HelpinghandsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpinghandsApplication.class, args);

	}

}
