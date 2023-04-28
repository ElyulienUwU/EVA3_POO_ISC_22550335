package EVA3_5_CAPTURAR_DATOS;

import java.util.InputMismatchException;
import java.util.Scanner;
public class EVA3_5_CAPTURAR_DATOS {

	public EVA3_5_CAPTURAR_DATOS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
	do {
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un valor (numero entero): ");
		valor = input.nextInt();
		break;
		}catch(InputMismatchException e) {
			System.out.println("el valor es erroneo, Porfavor Introduzca un numero entero");
		}
	}while(true);
	System.out.println("El valor capturado es: " + valor);
	}

}
