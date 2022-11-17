package com.isizwemadalane.springbootreactjs;

import com.isizwemadalane.springbootreactjs.model.User;
import com.isizwemadalane.springbootreactjs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReactjsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactjsApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Tony", "Stark", "tony@stark.com"));
		this.userRepository.save(new User("Lex", "Luthor", "lex@luthor.com"));
		this.userRepository.save(new User("Elon", "Musk", "elon@musk.com"));
		this.userRepository.save(new User("Isizwe", "Madalane", "isizwe@madalane.com"));
	}
}
