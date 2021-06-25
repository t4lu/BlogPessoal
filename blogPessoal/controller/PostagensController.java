package br.com.generation.blogPessoal.controller;
/*Função: Criacao blog pessoal no Spring
 * Autora: Talu - Turma 25
 * Data: 24.06.2021
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.blogPessoal.model.Postagens;
import br.com.generation.blogPessoal.repository.PostagensRepository;

@RestController
@RequestMapping ("/postagens")
@CrossOrigin ("*")
public class PostagensController {
	
	@Autowired
	PostagensRepository repository;
	
	@GetMapping ("/listar")
	public List<Postagens> listar(){
		return repository.findAll();
}
}