package EVA3_2_EXCEPTION_PROPAGATION;

public class EVA3_2_EXCEPTION_PROPAGATION {

	public EVA3_2_EXCEPTION_PROPAGATION() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicia main");
		A();
		System.out.println("Termina main");
	}
	
	public static void A() {
		System.out.println("Inicia A");
		B();
		System.out.println("Termina A");
	}
	
	public static void B() {
		System.out.println("Inicia B");
		C();
		System.out.println("Termina B");
	}
	
	public static void C() {
		System.out.println("Inicia C");
		int x = 5, y = 0;
		int resu = x / y;
		System.out.println("Resultado = " + resu);
		System.out.println("Termina C");
	}

}
