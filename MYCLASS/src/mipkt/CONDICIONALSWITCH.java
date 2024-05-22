package mipkt;

public class CONDICIONALSWITCH {

	public static void main(String[] arg) {

		int mes = 2;

		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;

		default:
			System.out.println("No existe el mes" + mes);

		}// fin del switch

		String dia = "jueves";

		switch (dia) {

		case "lunes":
			System.out.println("Laborable");
			break;
		case "martes":
			System.out.println("Laborable");
			break;
		case "miercoles":
			System.out.println("Laborable");
			break;
		case "jueves":
			System.out.println("Laborable");
			break;
		case "viernes":
			System.out.println("Laborable");
			break;
		case "sabado":
			System.out.println("No laborable");
			break;
		case "domingo":
			System.out.println("No laborable");

		default:
			System.out.println("Dia no computable");

		}// fin del switch

//	 int nota=7;

//	 switch(nota) {
//	 case 0: System.out.println("Suspenso");// case 0,1,2,3,4: System.out.println("Suspenso");otra manera de hacerlo
//	    break;
//	 case 1: System.out.println("Suspenso");
//	    break;
//	 case 2: System.out.println("Suspenso");
//	    break;
//	 case 3: System.out.println("Suspenso");
//	    break;
//	 case 4: System.out.println("Suspendo");
//	    break;
//	 case 5: System.out.println("Aprobado");
//	    break;
//	 case 6: System.out.println("Bien");
//	    break;
//	 case 7: System.out.println("Notable");//case 7,8: syso("Notable");
//	    break;
//	 case 8: System.out.println("Notable");
//	    break;
//	 case 9: System.out.println("Sobresaliente");//case 9,10: syso("Sobresaliente");
//	    break;
//	 case 10: System.out.println("Sobresaliente");

//	 default:System.out.println("Nota no computable");

//	 }//fin del switch

		int nota = 10;

		if (nota >= 0 && nota < 5) {
			System.out.println("Suspenso");
		} else if (nota == 5) {
			System.out.println("Aprobado");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 8 && nota < 9) {
			System.out.println("Notable");
		} else if (nota == 10) {
			System.out.println("Sobresaliente");
		} // fin del switch

	}// fin main
}// fin clase
