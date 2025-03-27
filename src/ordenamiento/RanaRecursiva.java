package ordenamiento;

import java.util.Scanner;

public class RanaRecursiva {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundosMin = 0;
    	
    	System.out.println("Ingresar cuantos metros por segundos puede saltar la rana:");
        int saltoMetros = scanner.nextInt();
        
        System.out.println("Ingresar cuántos metros debe recorrer la rana hasta su hogar:");
        int hogarMetros = scanner.nextInt();
        
        int resultado = RanaRecursivaMetodo(saltoMetros, hogarMetros, segundosMin);
        System.out.println("La rana ocupa " + resultado + " segundos");
		

	}
	
	
	public static int RanaRecursivaMetodo(int saltoMetros, int hogarMetros, int segundosMin) {
	    	
	        if (hogarMetros <= 0) {
	            return segundosMin;
	        } else {
	        	segundosMin++;
	            return RanaRecursivaMetodo(saltoMetros, hogarMetros-saltoMetros, segundosMin);
	        }
    }

}
