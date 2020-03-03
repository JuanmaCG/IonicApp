package com.jacaranda.controller;

import java.util.List;

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

import com.jacaranda.dto.ComentarioDTO;
import com.jacaranda.entities.Comentario;
import com.jacaranda.services.ComentarioService;

@RestController
@RequestMapping("/peliculas")
@CrossOrigin("http://localhost:8100")
public class ComentarioController {

	
	@Autowired
	ComentarioService comentarioService;
	
	@GetMapping("/{titulo}/comentarios")
	public List<ComentarioDTO> getComentarioByTitulo(@PathVariable String titulo){
		return comentarioService.findAllByTitulo(titulo);
	}
	
	@PostMapping("/{titulo}/comentarios")
	public void addComentario(@RequestBody ComentarioDTO comentario) {
		comentarioService.addComentario(comentario);
	}
	
	@DeleteMapping("/{titulo}/comentarios/{id}")
	public void deleteComentario(@PathVariable String titulo, @PathVariable Integer id) {
		comentarioService.deleteComentarioById(id);
	}
	
	@PutMapping("/{titulo}/comentarios/{id}")
	public void updateComentario(@PathVariable String titulo, @PathVariable Integer id, @RequestBody ComentarioDTO comentario) {
		comentarioService.updateComentarioById(id, comentario);
	}
}
