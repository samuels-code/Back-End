package com.generation.wehug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.wehug.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
 List <Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);

}