package co.com.beans;

import java.util.ArrayList;

public class Grupo {
	private String codigoG;
	private String nombreG;
	private int cantAlu;
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	
	public  Grupo() {
		estudiantes = new ArrayList();
		Estudiante Carolina = new Estudiante();
		Carolina.setIdEs("1001745056");
		estudiantes.add(Carolina);
		codigoG = "100";
	}
	
	public ArrayList<Estudiante> getListaEstudiante() {
		return estudiantes;
	}
	
	public void setListaestudiante(ArrayList<Estudiante> lista) {
		this.estudiantes = lista;		
	}
	
	public String setCodigoG() {
		return codigoG;
	}
	
	public void setCodigoG(String cod) {
		this.codigoG=cod;
	}
	
	public String getNombreG() {
		return nombreG;
	}
	
	public void setNombreG(String nom) {
		this.nombreG=nom;
	}
	
	public int getCantAlu() {
		return cantAlu;
	}
	
	public void setCantAlu(int canAlu) {
		this.cantAlu=canAlu;
	}
}
