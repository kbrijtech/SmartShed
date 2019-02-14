package com.kbrij.smartshade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kbrij.")
public class SmartShadeApplication
{

	public static void main(String[] args)
	{
	SpringApplication.run(SmartShadeApplication.class, args);
	}

}