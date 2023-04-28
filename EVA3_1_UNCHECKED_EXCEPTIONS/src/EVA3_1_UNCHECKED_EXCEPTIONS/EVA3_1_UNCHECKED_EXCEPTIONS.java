package EVA3_1_UNCHECKED_EXCEPTIONS;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

	public EVA3_1_UNCHECKED_EXCEPTIONS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic exceptions: division entre cero
		System.out.println("INICIANDO EL PROGRAMA");
		System.out.println("Declarando Variables");
		int x = 5, y = 0;
		System.out.println("Intentar la division");
		int resu = x / y; //aqui se genera la excepcion
				//Si no se atiende, el programa termina
		System.out.println("Resultado: " + resu);//ya no se ejecuta
		
		//INPUTMISMATH EXCEPTION
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int nume = input.nextInt(); //si el usuario captura una cadena
				//que no puede  convertirse a numero
				//se produce la excepcion y termina el programa
		System.out.println("El numero es: " + nume);
		
		//ARRAYINDEXOUTOFBOUNDS EXCCEPTIONS
		int[] arreglo = new int[5];//arreglo con 5 posiciones
		arreglo[0] = 100;
		arreglo[1] = 200;
		arreglo[2] = 300;
		arreglo[3] = 400;
		arreglo[4] = 500;
		arreglo[5] = 600;//<--? 5 no es un indíce válido, elareglo va de 0 a 4
		
		//NULLPOINTER EXCCEPTION 
		Prueba objPrueba = null; // //el objeto no existe, es nulo
		System.out.println("El valor de x es: " + objPrueba.x);//no puedo leer la x porque el valor de x no existe
	
	}
	

}

class Prueba{
	int x = 100;
}
