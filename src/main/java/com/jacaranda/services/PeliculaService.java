package com.jacaranda.services;

import java.util.List;

import com.jacaranda.dto.PeliculaDTO;


public interface PeliculaService {

	List<PeliculaDTO> findAll();
	PeliculaDTO findByTitulo(String titulo);
	void addPelicula(PeliculaDTO pelicula);
	void deletePeliculaByTitulo(String titulo);
	void updatePeliculaByTitulo(String titulo, PeliculaDTO pelicula);
}
