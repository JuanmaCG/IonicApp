package com.jacaranda.services;

import java.util.List;


import com.jacaranda.dto.ComentarioDTO;
import com.jacaranda.dto.UserDTO;

public interface ComentarioService {

	void addComentario(ComentarioDTO comentario);
	void deleteComentarioById(Integer id);
	void updateComentarioById(Integer id, ComentarioDTO comentario);
	List<ComentarioDTO> findAllByTitulo(String titulo);
	
}
