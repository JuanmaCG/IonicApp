package com.jacaranda.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jacaranda.entities.Comentario;

public interface IComentarioRepository extends JpaRepository<Comentario, Integer>{

	@Query(value = "select c.* from comentarios c, pelicula p where p.titulo = c.pelicula and p.titulo = ?1", nativeQuery = true)
	List<Comentario> findComentarioByTitulo(String titulo);
	
	
}
