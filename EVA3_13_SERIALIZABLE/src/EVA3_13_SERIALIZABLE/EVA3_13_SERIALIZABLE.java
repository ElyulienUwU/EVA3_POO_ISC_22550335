package EVA3_13_SERIALIZABLE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EVA3_13_SERIALIZABLE {

	public EVA3_13_SERIALIZABLE() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona P1 = new Persona("Julian","Ortiz",19);
		//Guardar el objeto en archivo
		try {
			String ruta = "C:\\archivos\\archivosObjetos.per";
			guardarObj(P1, ruta);
			Persona resu = leerObj(ruta);
			System.out.println("Nombre: " + resu.getNombre());
			System.out.println("Apellido: " + resu.getApellido());
			System.out.println("Edad: " + resu.getEdad());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//leer el objeto desde un archivo
 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void guardarObj(Persona perso, String ruta) throws IOException {
		FileOutputStream foStream = new FileOutputStream(ruta);
		ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
		ooStream.writeObject(perso);
		ooStream.close();
	}
	
	public static Persona leerObj(String ruta) throws IOException, ClassNotFoundException {
		Persona perso = null;
		FileInputStream fiStream = new FileInputStream(ruta);
		ObjectInputStream oiStream = new ObjectInputStream(fiStream);
		perso =(Persona) oiStream.readObject();
		return perso;
	}
}

class Persona implements Serializable{
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {
		nombre = "NONE";
		apellido = "NONE";
		edad = 0;
	}
	
	public Persona(String nombre, String apellido, int edad){
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

