package ordenamiento;

import java.util.Scanner;

public class Supermercado {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingresa el numero de personas que estan en la cola 1");
        int tamc1 = sc.nextInt();
        System.out.println("Ingresa el numero de personas que estan en la cola 2");
        int tamc2 = sc.nextInt();
        
        ColaSimple<Integer> cola1 = new ColaSimple(tamc1);
        ColaSimple<Integer> cola2 = new ColaSimple(tamc2);
        
        int edad = 0;
        System.out.println("Ingresa las edades de las personas de la cola 1");
        for (int i = 0; i < tamc1; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            edad = sc.nextInt();
            cola1.push(edad);
        }
        System.out.println("Ingresa las edades de las personas de la cola 2");
        for (int i = 0; i < tamc2; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            edad = sc.nextInt();
            cola2.push(edad);
        }
        
        Quecola(cola1, cola2);
    }
    
    public static void Quecola(ColaSimple<Integer> cola1, ColaSimple<Integer> cola2) {
        while (true) {
            if (cola1.isEmpty()) {
                System.out.println("La cola a la que debe entrar es la 1");
                break;
            }
            if (cola2.isEmpty()) {
                System.out.println("La cola a la que debe entrar es la 2");
                break;
            }
            
            int edad1 = cola1.peek();
            int edad2 = cola2.peek();
            
            System.out.println("Edad del c1 " + edad1 + " Edad del c2 " + edad2);
            
            if (edad1 <= edad2) {
                System.out.println("Se retira " + edad1);
                cola1.pop();
            } else {
                System.out.println("Se retira " + edad2);
                cola2.pop();
            }
            
            System.out.println("==============");
        }
    }
}

