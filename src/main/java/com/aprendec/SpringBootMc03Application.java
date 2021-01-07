package com.aprendec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMc03Application implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(SpringBootMc03Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMc03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola coders desde SpringBoot Consola");
		LOG.info("Hola coders desde SpringBoot Consola");
	}

}
