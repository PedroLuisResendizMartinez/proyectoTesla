package com.uabc.dev.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uabc.dev.datos.DatosJugadores;
import com.uabc.dev.modelos.Usuario;

@Controller
public class JuegoControlador {
	
	@Autowired
	DatosJugadores datosJugadores;
	
	@GetMapping("/inicio")
	public String inicio() {
		return "Inicio";
	}
	
	@GetMapping("/menu")
	public String menu(@RequestParam(name="nombre") String nombre, Model model) {
		
		Usuario us = new Usuario(0, nombre.trim(), 0, 0);		
		model.addAttribute("usuario", us);
		datosJugadores.agregarJugador(us);
		return "Menu";
	}

	@GetMapping("/juegosplay")
	public String juegosplay(@RequestParam(name="idUsuario") int idUsuario, Model model) {
		Usuario us = datosJugadores.getJugador(idUsuario);		
		model.addAttribute("usuario", us);
		return "MenuJuegos";
	}
	
	@GetMapping("/backmenu")
	public String backmenu(@RequestParam(name="idUsuario") int idUsuario, Model model) {
	
		Usuario us = datosJugadores.getJugador(idUsuario);
		model.addAttribute("usuario", us);
		datosJugadores.agregarJugador(us);
		return "Menu";
	}
}
