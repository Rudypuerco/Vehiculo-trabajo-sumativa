import java.util.Scanner; // importa la clase del scanner de la libreria de java para mantener los datos del usuario

public class Vehiculo {   // llamado a la clase como vehiculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // llamado de las variables 
        String marca;
        String modelo;
        int cilindrada;
        String tipoCombustible;
        int capacidad;

        // pedir al usuario que isnerte los datos
        System.out.println("Ingrese la marca:"); 
        marca = sc.nextLine();

        System.out.println("Ingrese el modelo:");
        modelo = sc.nextLine();

        System.out.println("Ingrese la cilindrada:");
        cilindrada = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el tipo de combustible:");
        tipoCombustible = sc.nextLine();

        System.out.println("Ingrese la capacidad:");
        capacidad = sc.nextInt();
        
        // muestra en consola los resultados
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // cierre del programa
        sc.close();
    }
}