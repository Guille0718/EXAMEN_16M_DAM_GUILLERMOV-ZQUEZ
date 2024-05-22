package E.D;

import java.util.Scanner;

public class Examen1 {
	
	public static void main(String[] args){
		
        Scanner teclado = new Scanner(System.in);	
        boolean primo=true;
        int num;
        String respuesta, s, S;	
        
        do {
            System.out.println ("Introduce número: ");
            num = teclado.nextInt();
            for(int i = 2; i < num; i++){
                if(num % i==0){
                    primo = false;
                }
            }
            
            if (num <= 1) {
                primo = false;
            }
            
            if(primo==true){
                System.out.println (num + " es primo");
            }
            else{
                System.out.println (num + " no es primo");
            }
            System.out.println ("Quieres intoducir otro número? s/n: ");
            respuesta=teclado.next();						
        }while(respuesta.equals("s") || respuesta.equals("S"));
    } 

}
