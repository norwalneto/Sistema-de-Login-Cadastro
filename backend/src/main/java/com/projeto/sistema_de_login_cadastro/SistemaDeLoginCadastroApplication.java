package com.projeto.sistema_de_login_cadastro;

import com.azure.spring.cloud.autoconfigure.implementation.context.AzureTokenCredentialAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {AzureTokenCredentialAutoConfiguration.class})
public class SistemaDeLoginCadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeLoginCadastroApplication.class, args);
	}

}
