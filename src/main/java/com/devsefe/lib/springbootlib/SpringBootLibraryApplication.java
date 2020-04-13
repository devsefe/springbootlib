package com.devsefe.lib.springbootlib;

import com.devsefe.lib.springbootlib.repository.BaseRepositoryImp;
import com.devsefe.lib.springbootlib.security.Encryption;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.devsefe.lib.springbootlib.repository"}, repositoryBaseClass = BaseRepositoryImp.class)
public class SpringBootLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryApplication.class, args);

		// test


		int i = 0;
	}

}
