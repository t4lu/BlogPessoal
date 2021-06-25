package br.com.generation.blogPessoal.repository;
/*Função: Criacao blog pessoal no Spring
 * Autora: Talu - Turma 25
 * Data: 24.06.2021
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.blogPessoal.model.Postagens;

@Repository
public interface PostagensRepository extends JpaRepository<Postagens, Long>{
						
	public List <Postagens> findAllByTituloContainingIgnoreCase(String titulo);
	
}