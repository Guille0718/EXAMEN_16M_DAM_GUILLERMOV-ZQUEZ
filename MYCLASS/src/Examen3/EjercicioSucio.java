package Examen3;

public class EjercicioSucio {
	
//public static void main(String[] arg) {
//		
//		Zoo[]InformeAnimales = new Zoo[] {
//				
//			new Zoo(101, "Oso", "Tierra", "Carne", 4),
//			new Zoo(102, "Leon", "Tierra", "Carne", 4),
//			new Zoo(103, "Girafa", "Tierra", "Pienso", 6),
//			new Zoo(104, "Halcon", "Aire", "Carne", 1),
//			new Zoo(105, "Aguila", "Aire", "Carne", 1),
//			new Zoo(106, "Guacamayo", "Aire", "Carne", 1),
//			new Zoo(107, "Foca", "Agua", "Pescado", 5),
//			new Zoo(108, "Morsa", "Agua", "Pescado", 7)	
//			
//		};
//		
//		
//		public static void ListadoHabitat(Zoo[] ListadoHabitat) {
//			
//			
//			
//		}
//		
//		
//
//		
//		
//		
//		
//		
//
//		class Animal {
//		    private int id;
//		    private String raza;
//		    private String habitat;
//		    private String food;
//		    private double foodKgPerDay;
//
//		    public Animal(int id, String raza, String habitat, String food, double foodKgPerDay) {
//		        this.id = id;
//		        this.raza = raza;
//		        this.habitat = habitat;
//		        this.food = food;
//		        this.foodKgPerDay = foodKgPerDay;
//		    }
//
//		    // getters y setters
//		}
//
//		public class ZooManager {
//		    private List<Animal> animals;
//
//		    public ZooManager() {
//		        animals = new ArrayList<>();
//		    }
//
//		    public void addAnimal(Animal animal) {
//		        animals.add(animal);
//		    }
//
//		    public void generarInforme() {
//		        // Agrupar animales por hábitat
//		        Map<String, List<Animal>> animalsByHabitat = new HashMap<>();
//		        for (Animal animal : animals) {
//		            if (!animalsByHabitat.containsKey(animal.getHabitat())) {
//		                animalsByHabitat.put(animal.getHabitat(), new ArrayList<>());
//		            }
//		            animalsByHabitat.get(animal.getHabitat()).add(animal);
//		        }
//
//		        // Calcular los kg de cada comida necesaria para cada semana
//		        Map<String, Double> foodWeeklyNeeds = new HashMap<>();
//		        foodWeeklyNeeds.put("carne", 0);
//		        foodWeeklyNeeds.put("pescado", 0);
//		        foodWeeklyNeeds.put("pienso", 0);
//		        for (Animal animal : animals) {
//		            foodWeeklyNeeds.put(animal.getFood(), foodWeeklyNeeds.get(animal.getFood()) + (animal.getFoodKgPerDay() * 7));
//		        }
//
//		        // Calcular los costes de mantenimiento diario de cada tipo de jaula
//		        double terrestrialCagesCost = 15 * animalsByHabitat.get("tierra").size();
//		        double birdCagesCost = 20 * animalsByHabitat.get("aire").size();
//		        double aquaticEnclosuresCost = 45 * animalsByHabitat.get("mar").size();
//
//		        // Imprimir el informe
//		        System.out.println("Informe de zoológico:");
//		        System.out.println("Animales agrupados por hábitat:");
//		        for (Map.Entry<String, List<Animal>> entry : animalsByHabitat.entrySet()) {
//		            System.out.println(entry.getKey() + ":");
//		            for (Animal animal : entry.getValue()) {
//		                System.out.println("- " + animal.getRaza());
//		            }
//		        }
//		        System.out.println("Necesidades semanales de comida:");
//		        for (Map.Entry<String, Double> entry : foodWeeklyNeeds.entrySet()) {
//		            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " kg");
//		        }
//		        System.out.println("Costes de mantenimiento diario:");
//		        System.out.println("Cajas terrestres: " + terrestrialCagesCost + " €");
//		        System.out.println("Jaulas de aves: " + birdCagesCost + " €");
//		        System.out.println("Estanques: " + aquaticEnclosuresCost + " €");
//		    }
//		}
//		
//	}
//
//public class Main {
//    public static void main(String[] args) {
//        ZooManager zooManager = new ZooManager();
//
//        // Agregar animales al zoológico
//        zooManager.addAnimal(new Animal(1, "León", "tierra", "carne", 10));
//        zooManager.addAnimal(new Animal(2, "Tigre", "tierra", "carne", 8));
//        zooManager.addAnimal(new Animal(3, "Pingüino", "mar", "pescado", 2));
//        zooManager.addAnimal(new Animal(4, "Águila", "aire", "pienso", 1));
//        zooManager.addAnimal(new Animal(5, "Elefante", "tierra", "pienso", 150));
//        zooManager.addAnimal(new Animal(6, "Foca", "mar", "pescado", 10));
//        zooManager.addAnimal(new Animal(7, "Cacatúa", "aire", "pienso", 0.5));
//        zooManager.addAnimal(new Animal(8, "Tortuga marina", "mar", "pescado", 5));
//
//        // Generar el informe
//        zooManager.generarInforme();
//    }
//}
//
}
