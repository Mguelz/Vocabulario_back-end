package br.com.vocabulario.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "br.com.vocabulario") // ajuste com seu pacote real
@EnableJpaRepositories(basePackages = "br.com.vocabulario.repository")
@EntityScan(basePackages = "br.com.vocabulario.model")
public class VocabularioApplication {

	public static void main(String[] args) {
		SpringApplication.run(VocabularioApplication.class, args);
	}

}
