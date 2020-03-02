package com.jacaranda.dto;

import java.util.Set;

import com.jacaranda.entities.Comentario;
import com.jacaranda.entities.Role;

public class UserDTO {

	
	private String usuario;
	private String contrasena;
	private String nombre;
	private String email;
	private boolean active;
	
	private Set<Comentario> comentario;
	private Set<Role> roles;

	public UserDTO() {}
	
	public UserDTO(String usuario, String contrasena, String nombre, String email) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(Set<Comentario> comentario) {
		this.comentario = comentario;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [usuario=" + usuario + ", contrasena=" + contrasena + ", nombre=" + nombre + ", email=" + email
				+ "]";
	}
}
