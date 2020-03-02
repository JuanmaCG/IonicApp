package com.jacaranda.dto;

import java.util.Date;

import javax.persistence.Id;

public class PeliculaDTO {

	private String titulo;
	private String director;
	private String argumento;
	private String poster;
	
	private Date fecha;
	
	private double rating;
	
	public PeliculaDTO(String titulo, String director, String argumento, String poster, Date fecha, double rating) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.argumento = argumento;
		this.poster = poster;
		this.fecha = fecha;
		this.rating = rating;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getArgumento() {
		return argumento;
	}

	public void setArgumento(String argumento) {
		this.argumento = argumento;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", argumento=" + argumento + ", poster="
				+ poster + ", fecha=" + fecha + ", rating=" + rating + "]";
	}
}
