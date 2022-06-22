package com.example.demo;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {

	@GetMapping("/simpleMessageWelcome")
	public String simpleMessageWelcome() {
		String message = "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
		return message;
	}

	@GetMapping("/login")
	public String login(String user, String password) {
		
		String result;
		
		  if(user == "" || user.isEmpty() || password == "" || password.isEmpty()) {
			  result = "USUÁRIO E SENHA NÃO INFORMADOS";
			 }
		  else if (user.length() > 15 || password.length() > 15) {
			  result = "USUÁRIO E SENHA INVÁLIDOS";
		  }else {
			  result= "LOGIN EFETUADO COM SUCESSO !!!";
			 }
		 return result;
		 
	}

}
