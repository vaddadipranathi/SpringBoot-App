package com.hcl.onlinefood.OnlineFoodHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan({ "com.hcl.onlinefood.OnlineFoodHibernate.*" })
public class OnlineFoodHibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(OnlineFoodHibernateApplication.class, args);
	}

}
