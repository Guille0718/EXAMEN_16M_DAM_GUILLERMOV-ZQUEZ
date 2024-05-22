package E.D.TRABAJO;

//public class PRUEBA {
//	
//	import java.util.ArrayList;
//	import java.util.Scanner;
//
//	public class CandyStore {
//	    private ArrayList<Candy> candies;
//
//	    public CandyStore() {
//	        candies = new ArrayList<>();
//	    }
//
//	    public void addCandy(String candyName, double price, int quantity) {
//	        candies.add(new Candy(candyName, price, quantity));
//	    }
//
//	    public void removeCandy(String candyName) {
//	        for (int i = 0; i < candies.size(); i++) {
//	            if (candies.get(i).getName().equals(candyName)) {
//	                candies.remove(i);
//	                break;
//	            }
//	        }
//	    }
//
//	    public void updateCandy(String candyName, double newPrice, int newQuantity) {
//	        for (Candy candy : candies) {
//	            if (candy.getName().equals(candyName)) {
//	                candy.setPrice(newPrice);
//	                candy.setQuantity(newQuantity);
//	                break;
//	            }
//	        }
//	    }
//
//	    public boolean sellCandy(String candyName, int quantityToSell) {
//	        for (Candy candy : candies) {
//	            if (candy.getName().equals(candyName) && candy.getQuantity() >= quantityToSell) {
//	                candy.setQuantity(candy.getQuantity() - quantityToSell);
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
//
//	    public static void main(String[] args) {
//	        CandyStore candyStore = new CandyStore();
//	        candyStore.addCandy("Gumballs", 50, 100);
//	        candyStore.addCandy("Chocolates", 30, 50);
//	        candyStore.addCandy("Lollipops", 20, 75);
//
//	        Scanner scanner = new Scanner(System.in);
//
//	        while (true) {
//	            System.out.println("\n--- Candy Store ---");
//	            System.out.println("1. Add Candy");
//	            System.out.println("2. Remove Candy");
//	            System.out.println("3. Update Candy");
//	            System.out.println("4. Sell Candy");
//	            System.out.println("5. Exit");
//	            System.out.print("Choose an option: ");
//	            int option = scanner.nextInt();
//
//	            if (option == 5) {
//	                System.out.println("Goodbye!");
//	                break;
//	            }
//
//	            System.out.print("Enter the candy name: ");
//	            String candyName = scanner.next();
//
//	            switch (option) {
//	                case 1:
//	                    System.out.print("Enter the price: ");
//	                    double price = scanner.nextDouble();
//	                    System.out.print("Enter the quantity: ");
//	                    int quantity = scanner.nextInt();
//	                    candyStore.addCandy(candyName, price, quantity);
//	                    break;
//	                case 2:
//	                    candyStore.removeCandy(candyName);
//	                    break;
//	                case 3:
//	                    System.out.print("Enter the new price: ");
//	                    double newPrice = scanner.nextDouble();
//	                    System.out.print("Enter the new quantity: ");
//	                    int newQuantity = scanner.nextInt();
//	                    candyStore.updateCandy(candyName, newPrice, newQuantity);
//	                    break;
//	                case 4:
//	                    System.out.print("Enter the quantity to sell: ");
//	                    int quantityToSell = scanner.nextInt();
//	                    if (candyStore.sellCandy(candyName, quantityToSell)) {
//	                        System.out.println("Candy sold successfully.");
//	                    } else {
//	                        System.out.println("Failed to sell candy. Not enough quantity.");
//	                    }
//	                    break;
//	                default:
//	                    System.out.println("Invalid option.");
//	            }
//	        }
//	    }
//	}
//
//}
