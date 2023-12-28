package com.digitcomart.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.digitcomart.workshopmongo.domain.User;
import com.digitcomart.workshopmongo.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User edson = new User(null, "Edson Marco", "edson@gmail.com");
		User mel = new User(null, "Mel Sophie", "mel@gmail.com");
		User shirley = new User(null, "Shirley Aline", "shirley@gmail.com");
		
		userRepository.saveAll(Arrays.asList(edson, mel, shirley));
		
	}

}
