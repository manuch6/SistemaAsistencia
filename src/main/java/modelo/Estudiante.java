package modelo;

import java.util.ArrayList;
import modelo.Asignatura;

public class Estudiante extends Perfil {
	private String carrera;
	private ArrayList<Asignatura> estudiantes = new ArrayList<Asignatura>();
}