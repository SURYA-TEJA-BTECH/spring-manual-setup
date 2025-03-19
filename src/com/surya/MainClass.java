package com.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.surya")
public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);

		Printer printer = context.getBean(Printer.class);

		printer.print();

		((AnnotationConfigApplicationContext) (context)).close();

	}

}
