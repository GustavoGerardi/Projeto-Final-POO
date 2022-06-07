package com.gustavo.finalProject.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.gustavo.finalProject.domain.User;
import com.gustavo.finalProject.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		
		User gustavo = new User(null, "Gustavo Gerardi de Faria", "gustavo.faria4@fatec.sp.gov.br");
		User thamires = new User(null, "Thamires Agnes", "thamires.agnes@fatec.sp.gov.br");
		User maromo = new User(null, "Marcos Roberto Moraes", "marcos.moraes6@fatec.sp.gov.br");

		userRepository.saveAll(Arrays.asList(gustavo, thamires, maromo));
	}
}