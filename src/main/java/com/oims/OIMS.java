package com.oims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * Name of Project: OIMS
 * Description: Service OIMS
 * Created on: 
 * Modified on:
 * @author goodtech
 * version :
 */

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class OIMS {

	public static void main(String[] args) {
		SpringApplication.run(OIMS.class, args);
	}
}