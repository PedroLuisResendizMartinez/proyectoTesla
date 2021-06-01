package com.uabc.dev.datos;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.uabc.dev.modelos.Pregunta;

@Component
public class DatosJuegos {
	
	ArrayList<Pregunta> preguntasHard = new ArrayList<>();
	ArrayList<Pregunta> preguntasMedium = new ArrayList<>();
	ArrayList<Pregunta> preguntasEasy = new ArrayList<>();
	ArrayList<Pregunta> preguntasQuick = new ArrayList<>();
	
	public DatosJuegos() {
		Pregunta p1= new Pregunta(1, "Hard", "Que dia es ho 1?", "lunes");
		Pregunta p2= new Pregunta(1, "Hard", "Que dia es ho 2?", "martes");
		Pregunta p3= new Pregunta(1, "Hard", "Que dia es ho 3?", "h");
		Pregunta p4= new Pregunta(1, "Hard", "Que dia es ho 4?", "LL");
		Pregunta p5= new Pregunta(1, "Hard", "Que dia es ho 5?", "lll");
		preguntasHard.addAll(Arrays.asList(p1, p2, p3, p4, p5));

		Pregunta pp1= new Pregunta(1, "Medium", "Que dia es ho 1?", "lunes");
		Pregunta pp2= new Pregunta(1, "Medium", "Que dia es ho 2?", "martes");
		preguntasMedium.addAll(Arrays.asList(pp1, pp2));
		
		Pregunta ppp1= new Pregunta(1, "Easy", "Que dia es ho 1?", "lunes");
		Pregunta ppp2= new Pregunta(1, "Easy", "Que dia es ho 2?", "martes");
		preguntasEasy.addAll(Arrays.asList(ppp1, ppp2));
		
		Pregunta pppp1= new Pregunta(1, "Quick", "Que dia es ho 1?", "lunes");
		Pregunta pppp2= new Pregunta(1, "Quick", "Que dia es ho 2?", "martes");
		preguntasQuick.addAll(Arrays.asList(pppp1, pppp2));
		
	}
	
	
	
}
