package EVA3_8_CUSTOM_EXCEPTIONS;

public class EVA3_8_CUSTOM_EXCEPTIONS {

	public EVA3_8_CUSTOM_EXCEPTIONS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Persona P1 = new Persona();
		P1.setName("Juan");
		P1.setApellido("Lechuga");
		try {
			P1.setEdad(-10);
		}catch(DatoIncorrectoCheckedEx e) {
			System.out.println(e.getMessage());
		}*/
	}

}

class Persona{
	private String name;
	private String apellido;
	private int edad;
	
	public Persona() {
		name = "julian";
		apellido = " Ortiz";
		edad = 0 ;
	}
	
	public Persona(String name, String apellido, int edad) {
		super();
		this.name = name;
		this.apellido = apellido;
		//setEdad(edad);
	}

	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
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
	/*public void setEdad(int edad) throw DatoIncorrectoCheckedEx {
		if (edad < 0 )
			//throw new DatoIncorrectoException();	//Unchecked
			throw new DatoIncorrectoCheckedEx();//Checked
			this.edad = edad;
	}*/
}

class DatoIncorrectoException extends RuntimeException {
	public DatoIncorrectoException() {
	super("Dato Incorrecto!! EL valor introducido no puede usarsse");

	}
}

class DatoIncorrectoCheckedEx extends Exception{	
	public DatoIncorrectoCheckedEx() {
	super("Dato Incorrecto");
	}
}