package com.uabc.dev.datos;


import java.util.ArrayList;
import org.springframework.stereotype.Component;
import com.uabc.dev.modelos.Usuario;

@Component
public class DatosJugadores {
	ArrayList<Usuario> jugadores= new ArrayList<>();
	
	public void agregarJugador(Usuario us){
		us.setId(jugadores.size()+1);
		jugadores.add(us);
	}

	public Usuario getJugador(int id){
		Usuario usuario= null;
		for(Usuario u : jugadores) {
			if(u.getId() == id) {
				usuario = u;
			}
		}
		return usuario;
	}
}
