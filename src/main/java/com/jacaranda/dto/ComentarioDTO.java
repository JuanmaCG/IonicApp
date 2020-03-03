package com.jacaranda.dto;

import java.util.Date;


import com.jacaranda.entities.Pelicula;
import com.jacaranda.entities.User;

public class ComentarioDTO {
	private Integer id;
	private String comentario;
	private double userRating;
	private Date fecha;
	private String username;

	private Pelicula pelicula;
	
	public ComentarioDTO() {}
	
	public ComentarioDTO(Integer id, String comentario, double userRating, Pelicula pelicula, Date fecha, String username) {
		super();
		this.id = id;
		this.comentario = comentario;
		this.userRating = userRating;
		this.fecha = fecha;
		this.pelicula = pelicula;
		this.username = username;
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
	



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
