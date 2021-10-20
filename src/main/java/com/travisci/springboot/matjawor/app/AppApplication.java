package com.travisci.springboot.matjawor.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class AppApplication {
	private static Logger LOG = LoggerFactory.getLogger(AppApplication.class);


	public static void main(String[] args) {
		LOG.info("STARTING MY APP");
		SpringApplication.run(AppApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Bean
    @Profile(value="dev")
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
            System.out.println("IN DEVELOPMENT");
            System.out.println("MESSAGE FROM DEV PROPERTIES");

			System.out.println("Beans list provided by Springboot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
