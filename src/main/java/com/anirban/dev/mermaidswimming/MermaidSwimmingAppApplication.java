package com.anirban.dev.mermaidswimming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.anirban.dev.mermaidswimming.model")
public class MermaidSwimmingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MermaidSwimmingAppApplication.class, args);
	}

}
