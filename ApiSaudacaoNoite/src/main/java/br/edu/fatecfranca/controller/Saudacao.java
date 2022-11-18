package br.edu.fatecfranca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// avisa que esta classe responde
// requisição RestFull
@RestController
// vai responder pela rota /api/saudacao
@RequestMapping("/api/saudacao")
public class Saudacao {

	@GetMapping
	public String boaNoite() {
		return "<h2> Tenham todos uma boa noite </h2>";
	}
	
	@GetMapping("/{nome}")
	public String boaNoite(@PathVariable String nome) {
		
		return " Tenham todos uma boa noite " + nome;
	}
	
}
