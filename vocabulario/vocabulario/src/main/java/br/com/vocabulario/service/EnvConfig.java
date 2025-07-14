package br.com.vocabulario.service;

import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;


@Configuration
public class EnvConfig {
	static {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USER", dotenv.get("DB_USER"));
		System.setProperty("DB_PASS", dotenv.get("DB_PASS"));
	}
}
