package com.jacaranda.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.dto.PeliculaDTO;
import com.jacaranda.entities.Pelicula;
import com.jacaranda.repositories.IPeliculaRepository;

@Service
public class PeliculaServiceImp implements PeliculaService {

	@Autowired
	private IPeliculaRepository peliRepo;

	@Override
	public void addPelicula(PeliculaDTO pelicula) {
		Pelicula peli = new Pelicula(pelicula.getTitulo(), pelicula.getDirector(), pelicula.getArgumento(),
				pelicula.getPoster(), pelicula.getFecha(), pelicula.getRating());
		peliRepo.save(peli);
	}

	@Override
	public void deletePeliculaByTitulo(String titulo) {
		Pelicula pelicula = peliRepo.findByTitulo(titulo);
		if(pelicula.getTitulo() != null) {
			peliRepo.delete(pelicula);
		}else {
			throw new RuntimeException("Esta Pelicula No existe");
		}

	}

	@Override
	public void updatePeliculaByTitulo(String titulo, PeliculaDTO pelicula) {
		Pelicula peli = peliRepo.findByTitulo(titulo);
		if(peli.getTitulo() != null || peli.getTitulo() != "undefined") {
			peli.setTitulo(pelicula.getTitulo());
			peli.setArgumento(pelicula.getArgumento());;
			peli.setDirector(pelicula.getDirector());
			peli.setFecha(pelicula.getFecha());;
			peli.setPoster(pelicula.getPoster());
			peli.setRating(pelicula.getRating());
			peliRepo.save(peli);
		}else {
			throw new RuntimeException("Error al actualizar");
		}

	}

	@Override
	public List<PeliculaDTO> findAll() {
		List<Pelicula> peliculas = peliRepo.findAll();
		List<PeliculaDTO> peliculasDTO = new ArrayList<PeliculaDTO>();
		for(Pelicula pelicula : peliculas) {
			
			peliculasDTO.add(new PeliculaDTO(pelicula.getTitulo(), pelicula.getArgumento(), pelicula.getPoster(), pelicula.getDirector(), pelicula.getFecha(), pelicula.getRating()));
		}
		return peliculasDTO;
	}

	

	@Override
	public PeliculaDTO findByTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

}
