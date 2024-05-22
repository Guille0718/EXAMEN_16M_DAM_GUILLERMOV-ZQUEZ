package Repaso;

public class Principal {
	
	public static void main(String[] args)  {
		
		Deportista Phelps = new Deportista("Michael Phelps", 33, "USA");
		
		Deportista Spitz = new Deportista();
		
		System.out.println(Phelps);
		System.out.println(Spitz);
		System.out.println("******************************************");
		
		Spitz.setNombre("Marco Spitz");
		
		System.out.println(Phelps);
		System.out.println(Spitz);
		
		Deportista at = new Atleta("Usain Bolt", 33, "Jamaica", "100", 9);
		
		System.out.println(at.mostrar());
	}

}
