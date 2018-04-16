package com.ipartek.formacion.nidea.pojo;

public class Usuario {
	private int id;
	private String nombre;

	private String password;
	private int id_rol;

	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + "]";
	}

}
