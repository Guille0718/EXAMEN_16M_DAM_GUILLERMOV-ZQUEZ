package mipkt;

public class INSTRUCCIONBREAK {

	public static void main(String[] arg) {

		// BREAK
//		for(int i=0 ; i<10 ; i++) {

//		System.out.println("Interacción: " + i);
//		if(i == 6) {
//			break;
//		}

//		}

		// CONTINUE
		System.out.println("Fin bucle");

		for (int i = 0; i < 10; i++) {

			if (i == 6) {
				continue;
			}
			System.out.println("Interaccioón: " + i);
		}
		System.out.println("Fin bucle");
	}
}
