package br.ufc.npi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="br.ufc.npi.repository")
@EntityScan(basePackages="br.ufc.npi.bean")
public class AutoestudoSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoestudoSecurityApplication.class, args);
	}
}
