package com.uabc.dev.modelos;

public class Pregunta {
	private int id;
	private String tipo;
	private String nombre;
	private String respuesta;
	
	public Pregunta(int id, String tipo, String nombre, String respuesta) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.respuesta = respuesta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
}
