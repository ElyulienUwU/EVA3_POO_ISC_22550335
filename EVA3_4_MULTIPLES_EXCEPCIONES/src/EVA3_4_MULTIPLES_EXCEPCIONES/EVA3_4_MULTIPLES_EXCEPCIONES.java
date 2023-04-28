package EVA3_4_MULTIPLES_EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {

	public EVA3_4_MULTIPLES_EXCEPCIONES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
	do {
		try{
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el valor de X (numero entero): ");
		x = input.nextInt();
		System.out.println("Introduce el valor de y (numero entero): ");
		y = input.nextInt();
		int resu = x / y;
		System.out.println("Resultado de " + x + "/" + y + " : " + resu);
		break;
		}catch(ArithmeticException u) {
			System.out.println("No se puede dividir entre cero");
		}catch(InputMismatchException u) {
			System.out.println("Captura en formato incorrecto, no se puede convertir en un numero");
		}
		}while(true);
		System.out.println("Programa terminado exitosamente");
	}
}

