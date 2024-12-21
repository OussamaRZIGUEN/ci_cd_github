package com.ci_cd_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/api/v1")
@RestController
public class CiCdGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdGithubApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Oussama Rziguen Backend Dev";
	}

	public Integer returnNumber() {
		Random random = new Random();
		return random.nextInt(100);
	}

}
