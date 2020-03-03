package com.jacaranda.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Comentarios")
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String comentario;
	private double userRating;
	private Date fecha;
	private String username;
	
	@ManyToOne
	@JoinColumn(name = "pelicula")
	private Pelicula pelicula;
	
	public Comentario() {}
	
	public Comentario(String comentario, double userRating, Pelicula pelicula, Date fecha, String username) {
		super();
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

	public Integer getId() {
		return id;
	}
	
	
}
