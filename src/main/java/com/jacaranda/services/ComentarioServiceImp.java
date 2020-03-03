package com.jacaranda.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.dto.ComentarioDTO;
import com.jacaranda.entities.Comentario;
import com.jacaranda.repositories.IComentarioRepository;

@Service
public class ComentarioServiceImp implements ComentarioService{

	@Autowired
	private IComentarioRepository comentarioRepo;
	
	@Override
	public List<ComentarioDTO> findAllByTitulo(String titulo) {
		List<Comentario> comentarios = comentarioRepo.findComentarioByTitulo(titulo);
		List<ComentarioDTO> comentariosDTO = new ArrayList<ComentarioDTO>();
		for(Comentario comentario : comentarios) {
			
			comentariosDTO.add(new ComentarioDTO(comentario.getId(), comentario.getComentario(), comentario.getUserRating(), comentario.getPelicula(), comentario.getFecha(), comentario.getUsername()));
		}
		return comentariosDTO;
	}

	@Override
	public void addComentario(ComentarioDTO comentarioDTO) {
		Comentario comentario = new Comentario(comentarioDTO.getComentario(), comentarioDTO.getUserRating(), comentarioDTO.getPelicula(), comentarioDTO.getFecha(), comentarioDTO.getUsername());
		comentarioRepo.save(comentario);		
		
	}

	@Override
	public void deleteComentarioById(Integer id) {
		Optional<Comentario> comentario = comentarioRepo.findById(id);
		if(comentario.isPresent()) {
			comentarioRepo.deleteById(id);		
		}else {
			throw new RuntimeException("Este comentario no existe");
		}
		
	}

	@Override
	public void updateComentarioById(Integer id, ComentarioDTO comentario) {
		Optional<Comentario> comentariorepo = comentarioRepo.findById(id);
		if(comentariorepo.isPresent()) {
			Comentario comentarioDB = comentariorepo.get();
			comentarioDB.setComentario(comentario.getComentario());
			comentarioDB.setFecha(comentario.getFecha());
			comentarioDB.setPelicula(comentario.getPelicula());
			comentarioDB.setUserRating(comentario.getUserRating());
			comentarioRepo.save(comentarioDB);
		}else {
			throw new RuntimeException("Error al actualizar");
		}
		
	}
	
	
}
