package EVA3_6_FINALLY;

public class EVA3_6_FINALLY {

	public EVA3_6_FINALLY() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 1;
		try {
			int resu = x / y;
		}catch(ArithmeticException o) {
			System.out.println(o.getMessage());
		}finally {
			System.out.println("SIEMPRE ME EJECUTOOOOOO!!!");
		}
	}

}
