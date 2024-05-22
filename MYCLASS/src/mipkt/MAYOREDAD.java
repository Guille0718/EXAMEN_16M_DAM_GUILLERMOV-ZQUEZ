package mipkt;

public class MAYOREDAD {

	public static void main(String[] arg) {

		// Declaracion de la fecha de nacimiento
		int diaNac = 0, mesNac = 0, anioNac = 0;
		// Declaracion de la fecha actual
		int diaAct = 27, mesAct = 9, anioAct = 2023;
		// Declaracion de la constante para la mayoria de edad
		final int ANIOMAYOR = 18;

//		if(anioAct - anioNac >= ANIOMAYOR) {
//		System.out.println("Es mayor de edad 1");			

//	}else if( (anioAct - anioNac == ANIOMAYOR) && (mesNac < mesAct) ) { //el "==" se utiliza para hacer comparaciones
//	    System.out.println("Es mayor de edad 2");

//	}else if((anioAct - anioNac == ANIOMAYOR) && (mesAct == mesNac) && (diaNac <= diaAct)) {
//		System.out.println("Es mayor de edad 3");

//		}else {
//		System.out.println("Es menor de edad");	
//		
//		
//	 }

		if ((anioAct - anioNac > ANIOMAYOR) || ((anioAct - anioNac == ANIOMAYOR) && (mesNac < mesAct))
				|| ((anioAct - anioNac == ANIOMAYOR) && (mesAct == mesNac) && (diaNac <= diaAct))) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		} // MANERA "DIFICIL" Y MÁS CORTA PERO CUALQUIERA DE LAS DOS ES VALIDA

	}

}
