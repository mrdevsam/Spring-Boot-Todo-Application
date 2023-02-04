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
	public InMemoryUserDetailsManager createUserDetailsManager() {
		Function<String, String> pswdEncoder = input -> passwordEncoder().encode(input);
		UserDetails usrDetails = User.builder()
									.passwordEncoder(pswdEncoder).username("myusrnm").password("dummyx").roles("USER","ADMIN").build();
		return new InMemoryUserDetailsManager(usrDetails);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
