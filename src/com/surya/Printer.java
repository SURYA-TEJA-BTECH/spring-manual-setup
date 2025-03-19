package com.surya;

import org.springframework.stereotype.Component;

@Component("printer")
public class Printer {

	public void print() {
		System.out.println("printing");
	}

}
