package com.jacaranda.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.dto.PeliculaDTO;
import com.jacaranda.entities.Pelicula;
import com.jacaranda.services.PeliculaService;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:8100")
public class PeliculaControler {

	@Autowired
	PeliculaService peliculaService;
	
	@GetMapping("/peliculas") 
	public List<PeliculaDTO> getPeliculas() {
		return peliculaService.findAll();
	}
	
	@GetMapping("/peliculas/{titulo}")
	public Pelicula getPeliculaByTitulo(@PathVariable String titulo) {
		return peliculaService.findByTitulo(titulo);
	}
	
	@PostMapping("/peliculas")
	public void createPelicula(@RequestBody PeliculaDTO pelicula) {
		peliculaService.addPelicula(pelicula);
	}
	
	@PutMapping("/peliculas/{titulo}")
	public void updatePelicula(@PathVariable String titulo, @RequestBody PeliculaDTO pelicula) {
		peliculaService.updatePeliculaByTitulo(titulo, pelicula);
	}
	
	@DeleteMapping("/peliculas/{titulo}")
	public void deletePelicula(@PathVariable String titulo) {
		peliculaService.deletePeliculaByTitulo(titulo);
	}
	
}
