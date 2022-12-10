package Reportes;
import java.util.*;
import DTO.Alumnos;

public class AlumnosReporte {
	public static Collection <Alumnos> generarLista()
	{
		Vector<Alumnos> lista = new Vector<Alumnos>();
		lista.add(new Alumnos(1,"Medrano","Harold","POO"));
		lista.add(new Alumnos(2,"Huaman","Edilson","Base de datos"));
		lista.add(new Alumnos(3,"Sanabria","Marcelo","POO"));
		lista.add(new Alumnos(4,"Huaman","Jean","Cálculo"));
		lista.add(new Alumnos(5,"Roque","Sammir","Marketin"));
		lista.add(new Alumnos(6,"Lujan","Adriano","Redes y comunicaciones"));
		return lista;
	}
}
