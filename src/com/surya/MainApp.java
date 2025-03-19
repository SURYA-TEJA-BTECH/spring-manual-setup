package com.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surya.beans.Printer;
import com.surya.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Printer printer = context.getBean(Printer.class);

		printer.print();

		((AnnotationConfigApplicationContext) (context)).close();

	}

}
