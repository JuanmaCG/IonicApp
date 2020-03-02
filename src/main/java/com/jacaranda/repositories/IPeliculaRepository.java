package com.jacaranda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacaranda.entities.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, String>{

	Pelicula findByTitulo(String titulo);
}
