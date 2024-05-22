package E.D.TRABAJO;

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TiendaChuches {
//
//	public static void main(String[] args) {
//        ArrayList<Chuchería> inventario = new ArrayList<>();
//        inventario.add(new Chuchería("Gominolas", 50));
//        inventario.add(new Chuchería("Chocolatinas", 30));
//        inventario.add(new Chuchería("Piruletas", 20));
//
//        Scanner ent = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n--- Tienda de Chuches ---");
//            System.out.println("1. Agregar chuches");
//            System.out.println("2. Eliminar chuches");
//            System.out.println("3. Actualizar cantidad de chuches");
//            System.out.println("4. Vender chuches");
//            System.out.println("5. Salir");
//            System.out.print("Elige una opción: ");
//            int opcion = ent.nextInt();
//
//            if (opcion == 5) {
//                System.out.println("¡Hasta luego!");
//                break;
//            }
//
//            System.out.print("Ingresa el nombre de la chuche: ");
//            String nombre = ent.next();
//
//            for (Chuchería chuche : inventario) {
//                if (chuche.getNombre().equalsIgnoreCase(nombre)) {
//                    switch (opcion) {
//                        case 1:
//                            System.out.print("Cantidad a agregar: ");
//                            int cantidadAgregar = ent.nextInt();
//                            chuche.agregarChuches(cantidadAgregar);
//                            break;
//                        case 2:
//                            System.out.print("Cantidad a eliminar: ");
//                            int cantidadEliminar = ent.nextInt();
//                            chuche.eliminarChuches(cantidadEliminar);
//                            break;
//                        case 3:
//                            System.out.print("Nueva cantidad: ");
//                            int nuevaCantidad = ent.nextInt();
//                            chuche.actualizarChuches(nuevaCantidad);
//                            break;
//                        case 4:
//                            System.out.print("Cantidad a vender: ");
//                            int cantidadVender = ent.nextInt();
//                            chuche.venderChuches(cantidadVender);
//                            break;
//                        default:
//                            System.out.println("Opción inválida.");
//                    }
//                    break;
//                }
//            }
//        }
//    }
//	
//	public void agregarChuches(String NombreChuche, double Precio, int Cantidad) {
//        Chuchería.add(new Chuchería(NombreChuche, Precio, Cantidad));
//    }
//
//    public void eliminarChuches(String NombreChuche) {
//        for (int i = 0; i < candies.size(); i++) {
//            if (candies.get(i).getName().equals(NombreChuche)) {
//                candies.remove(i);
//                break;
//            }
//        }
//    }
//
//    public void actualizarChuches(String candyName, double newPrice, int newQuantity) {
//        for (Candy candy : candies) {
//            if (candy.getName().equals(candyName)) {
//                candy.setPrice(newPrice);
//                candy.setQuantity(newQuantity);
//                break;
//            }
//        }
//    }
//
//    public boolean venderChuches(String candyName, int quantityToSell) {
//        for (Candy candy : candies) {
//            if (candy.getName().equals(candyName) && candy.getQuantity() >= quantityToSell) {
//                candy.setQuantity(candy.getQuantity() - quantityToSell);
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
