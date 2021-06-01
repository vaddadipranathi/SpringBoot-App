package com.hcl.onlinefood.OnlineFoodHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
//@ComponentScan({ "com.hcl.onlinefood.OnlineFoodHibernate.*" })
public class OnlineFoodHibernateApplication extends SpringBootServletInitializer{
		 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(SpringbootFoodApplication.class);
    }



	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(OnlineFoodHibernateApplication.class, args);
	}

}
