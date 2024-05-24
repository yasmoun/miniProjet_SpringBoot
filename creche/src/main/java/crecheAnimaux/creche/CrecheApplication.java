package crecheAnimaux.creche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"crecheAnimaux.creche"})

public class CrecheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrecheApplication.class, args);
	}

}
