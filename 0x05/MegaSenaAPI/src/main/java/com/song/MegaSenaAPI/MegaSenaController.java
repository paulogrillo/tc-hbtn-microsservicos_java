package com.song.MegaSenaAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {
	
	   Random random = new Random();

	   @GetMapping("/simpleMessageWelcome")
	   public String mensagemBoasVindas() {
	        // TODO
	        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
	   }


	   @GetMapping("/getNumbers")
	   public List<Integer> numerosMegaSena() {
	          // TODO
	         // Obs: Retornar os números gerados em ordem crescente. 
	        return random.ints(6, 0, 1000).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	   }
	

}
