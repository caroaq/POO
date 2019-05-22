package co.com.beans;

import java.util.ArrayList;

public class Estudiante extends Persona {
	private String idE;
	private String direccion;
	private ArrayList<Materia> materias = new ArrayList<Materia>();
	
	public Estudiante() {
		materias = new ArrayList(); 
		Materia Espa�ol = new Materia();
		Espa�ol.setCodigo("002");
		materias.add(Espa�ol);
		
	}
	
	public Estudiante(String idE) {
		this.idE=idE;
	}
	
	public String getIdEs() {
		return idE;
	}
	
	public void setIdEs(String id) {
		this.idE=id;
	}
	
	public ArrayList<Materia> getListaMaterias() {
		return materias;
	}
	public void setListaMaterias(ArrayList<Materia> lista) {
		this.materias=lista;
	}

}
