package co.com.beans;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private String telefono;
	
	public Persona() {
		
	}
	
	public Persona (String nombre, String apellidos, int edad, String telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.telefono=telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos (String ape) {
		this.apellidos=ape;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String tel) {
		this.telefono=tel;
	}

}
