package DTO;

public class Alumnos {
	
	//constructor
	public Alumnos(int codigo , String apellidos , String nombres , String curso) {
		this.nombres = nombres;
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.curso = curso;
	}
	
	private String  apellidos, nombres , curso;
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
