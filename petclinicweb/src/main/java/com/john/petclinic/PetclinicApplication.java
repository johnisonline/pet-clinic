package com.john.petclinic;

import com.john.petclinic.samplebeans.FakeDataSource;
import com.john.petclinic.samplebeans.JmsDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PetclinicApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(PetclinicApplication.class, args);

		FakeDataSource fakeDataSource =  ctx.getBean(FakeDataSource.class);

		JmsDataSource jmsDataSource = ctx.getBean(JmsDataSource.class);

		System.out.println("name: " + fakeDataSource.getUserName());

		System.out.println("jms:" + jmsDataSource.getUserName());
	}

}
