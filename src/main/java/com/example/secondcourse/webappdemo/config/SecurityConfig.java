package com.example.secondcourse.webappdemo.config;

import java.util.function.Function;
import org.springframework.context.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager createDetailsManager() {
		UserDetails usrdetails1 = createNewUser("myusrnm", "dummyx");
		UserDetails usrdetails2 = createNewUser("myusrb", "thisisb");
		return new InMemoryUserDetailsManager(usrdetails1,usrdetails2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> pswdEncoder = input -> passwordEncoder().encode(input);
		UserDetails usrDetails = User.builder().passwordEncoder(pswdEncoder).username(username).password(password).roles("USER","ADMIN").build();
		return usrDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
