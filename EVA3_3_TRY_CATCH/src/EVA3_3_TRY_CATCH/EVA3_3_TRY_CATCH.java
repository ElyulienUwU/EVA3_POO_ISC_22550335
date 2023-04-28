package EVA3_3_TRY_CATCH;

public class EVA3_3_TRY_CATCH {

	public EVA3_3_TRY_CATCH() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5 , y = 0;
		try{//Seccion de codigo que potecialmente genera una excepcion
		int resu = x / y;
		System.out.println("Resultado: " + resu);
		}catch(ArithmeticException e){//se genera un objeto excepetion llamado "e" de tipo ArithmeticException
		System.out.println("Se produjo un error: " + e.getMessage());
		}
		
		System.out.println("Programa Terminado");
	}

}
