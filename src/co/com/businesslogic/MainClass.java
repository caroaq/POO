package co.com.businesslogic;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.com.beans.Estudiante;
import co.com.beans.Grupo;
import co.com.beans.Materia;
import co.com.beans.Profesor;

public class MainClass {

	public static void main(String[] args) {
		//Ejercicio 22/05/2019
		// TODO Auto-generated method stub
		
		//Se instancia el estudiante y se crea un estudiante llenando los datos 
		Estudiante Carolina = new Estudiante();
		Carolina.setIdEs("1001745056 ");
		Carolina.setNombre("Carolina ");
		Carolina.setApellidos("Arias ");
		Carolina.setEdad(18);
		Carolina.setTelefono(" 3008185329");
		
		Estudiante Mariana = new Estudiante();
		Mariana.setIdEs("1000644347");
		Mariana.setNombre("Mariana");
		Mariana.setApellidos("Estrada");
		Mariana.setEdad(18);
		Mariana.setTelefono(" 56354353 ");
		
		//Se muestra la información del estudiante 
		JOptionPane.showMessageDialog(null, Carolina.getIdEs()+Carolina.getNombre()+Carolina.getApellidos()+
				Carolina.getEdad()+Carolina.getTelefono());
		
		//Crear lista de estudiantes 
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		//Agregamos estudiantes a la lista 
		estudiantes.add(Carolina);
		estudiantes.add(Mariana);
		
		Grupo Once = new Grupo();
		Once.setCodigoG("10909");
		Once.setNombreG("Once");
		Once.setCantAlu(35);
		Once.setListaestudiante(estudiantes);
		JOptionPane.showMessageDialog(null, "Grupo once ");
		JOptionPane.showMessageDialog(null, Once.getListaEstudiante().get(0).getNombre()+Once.getListaEstudiante().get(0).getApellidos());
		JOptionPane.showMessageDialog(null, Once.getListaEstudiante().get(1).getNombre()+Once.getListaEstudiante().get(1).getApellidos());
		
		//Agregar profesor 
		Profesor Juan = new Profesor();
		Juan.setIdPro("109938973 ");
		Juan.setNombre("Juan ");
		Juan.setApellidos("Quintero ");
		Juan.setEdad(20);
		Juan.setTelefono(" 12102154 ");
		Juan.setGrupo("Once ");
		
		JOptionPane.showMessageDialog(null, "Profesor: " + Juan.getIdPro()+Juan.getNombre()+Juan.getApellidos()+
				Juan.getEdad()+Juan.getTelefono()+Juan.getGrupo());
		
		//Ingresar materias al sistema
		Materia Español = new Materia();
		Español.setCodigo("12 ");
		Español.setNombre("Español ");
		Español.setIntHora(" 4 horas semanales ");
		
		Materia etica = new Materia();
		etica.setCodigo("111 ");
		etica.setNombre("Etica ");
		etica.setIntHora("2 horas semanales ");
		
		Materia sociales = new Materia();
		sociales.setCodigo("222 ");
		sociales.setNombre("Sociales ");
		sociales.setIntHora("4 horas semanales ");
		
		
		//Agregar Materias a la lista de materias 
		ArrayList<Materia> materias = new ArrayList<Materia>();
		materias.add(Español);
		materias.add(etica);
		materias.add(sociales);
		
		
		Estudiante estudiante = new Estudiante();
		estudiante.setListaMaterias(materias);
		JOptionPane.showMessageDialog(null, "Materias " );
		JOptionPane.showMessageDialog(null, Español.getCodigo()+Español.getNombre()+Español.getIntHora());
		JOptionPane.showMessageDialog(null,	etica.getCodigo()+etica.getNombre()+etica.getIntHora());
		JOptionPane.showMessageDialog(null,	sociales.getCodigo()+sociales.getNombre()+sociales.getIntHora());
		
		
		JOptionPane.showMessageDialog(null,"Ejemplo for loop");
		for (int i = 0; i < estudiantes.size(); i++) {
			JOptionPane.showMessageDialog(null,estudiantes.get(i).getNombre());
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo Advance For Loop");
		for (Materia temp : materias) {
			JOptionPane.showMessageDialog(null, temp.getNombre());
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo Iterator");
		Iterator<Estudiante> estudiantesIterator = estudiantes.iterator(); 
		while (estudiantesIterator.hasNext()) {
			JOptionPane.showMessageDialog(null, estudiantesIterator.next().getNombre());
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo While Loop");
		int i = 0;
		while (i < materias.size()) {
			JOptionPane.showMessageDialog(null, materias.get(i).getNombre()+materias.get(i).getIntHora());
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "Ejemplo collection stream()");
		estudiantes.forEach((temp) ->{
			JOptionPane.showMessageDialog(null, temp.getNombre()+temp.getApellidos());
		});
	}
	

}
