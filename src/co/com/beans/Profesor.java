package co.com.beans;


public class Profesor extends Persona {
	private String idP;
	private String grupo;
	
	public Profesor () {
		
	}
	
	public Profesor(String idP, String grupo) {
		this.idP=idP;
		this.grupo=grupo;
	}
	
	public String getIdPro() {
		return idP;
	}
	
	public void setIdPro (String id) {
		this.idP=id;
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String grupo) {
		this.grupo=grupo;
	}
	
}
