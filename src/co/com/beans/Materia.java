package co.com.beans;

public class Materia {
	
	private String codigoM;
	private String nombreM;
	private String intHora;
	
	public Materia () {
		
	}
	
	public Materia(String codigoM, String nombreM, String intHora) {
		this.codigoM=codigoM;
		this.nombreM=nombreM;
		this.intHora=intHora;
	}
	
	public String getCodigo() {
		return codigoM;
	}

	public void setCodigo(String cod) {
		this.codigoM=cod;
	}
	public String getNombre() {
		return nombreM;
	}

	public void setNombre(String nom) {
		this.nombreM=nom;
	}
	
	public String getIntHora() {
		return intHora;
	}

	public void setIntHora(String intHora) {
		this.intHora=intHora;
	}
}
