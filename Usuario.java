package com.uabc.dev.modelos;

public class Usuario {
	
	private int id;
	private String nombre;
	private int puntajeNormal;
	private int puntajeQuick;
	
	public Usuario(int id, String nombre, int puntajeNormal, int puntajeQuick) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntajeNormal = puntajeNormal;
		this.puntajeQuick = puntajeQuick;
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

	public int getPuntajeNormal() {
		return puntajeNormal;
	}

	public void setPuntajeNormal(int puntajeNormal) {
		this.puntajeNormal = puntajeNormal;
	}

	public int getPuntajeQuick() {
		return puntajeQuick;
	}

	public void setPuntajeQuick(int puntajeQuick) {
		this.puntajeQuick = puntajeQuick;
	}
	
	
}
