package com.jacaranda.dto;

import java.util.Date;


import com.jacaranda.entities.Pelicula;
import com.jacaranda.entities.User;

public class ComentarioDTO {
	private Integer id;
	private String comentario;
	private double userRating;
	private Date fecha;
	

	private Pelicula pelicula;
	
	public ComentarioDTO() {}
	
	public ComentarioDTO(Integer id, String comentario, double userRating, Pelicula pelicula, Date fecha) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.userRating = userRating;
		this.fecha = fecha;
		this.pelicula = pelicula;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public double getUserRating() {
		return userRating;
	}

	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}
	



	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Comentario [comentario=" + comentario + ", userRating=" + userRating + "]";
	}

	public Integer getId() {
		return id;
	}
}