package mipkt;

public class EJERCICIO4 {

	public static void main(String[] arg) {

		int a = 2, b = 3, c = 4, d = 5;

		int aux = b;

		b = c;
		c = a;
		a = d;
		d = aux;

		System.out.println("a:" + a + "b:" + b + "c:" + c + "d:" + d);

	}

}
