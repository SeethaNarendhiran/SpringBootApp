package com.local.springBasics.SpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner{
	
	@Autowired
	PersonJdbcDao dao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		//ApplicationContext appContext =
				SpringApplication.run(SpringBootAppApplication.class, args);
		
//		for(String name : appContext.getBeanDefinitionNames()){
//			System.out.println(name);
//		}
	}

	

	public void run(String... args) throws Exception {
		// logger.info("\nAll persons data-->{}",dao.findAll());
		//logger.info("\nAll persons data-->{}",dao.findById(10004));
		
		logger.info("\nAll persons data-->{}",dao.findByName("seetha"));
		
		
	}
}
