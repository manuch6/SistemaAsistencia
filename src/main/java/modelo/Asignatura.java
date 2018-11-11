package modelo;

import java.util.ArrayList;
import modelo.Estudiante;

public class Asignatura {
	private String nombre;
	private int participante;
	private String horario;
	public Asistencia tiene_asistencia;
	private ArrayList<Estudiante> asignaturas = new ArrayList<Estudiante>();
}