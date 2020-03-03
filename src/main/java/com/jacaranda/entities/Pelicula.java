package com.jacaranda.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Pelicula")
public class Pelicula {
	
	@Id
	@Column(length = 100)
	private String titulo;
	private String director;
	private String argumento;
	private String poster;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecha;
	
	@Column(length = 4)
	private double rating;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pelicula")
	private Set<Comentario> comentario;
	
	public Pelicula() {}
	
	public Pelicula(String titulo, String director, String argumento, String poster, Date fecha, double rating) {
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
