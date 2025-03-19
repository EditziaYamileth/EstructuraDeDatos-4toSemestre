package ordenamiento;
import java.util.Scanner;
public class Calif {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese las calificaciones");
		int n = scanner.nextInt();
		int [] calificaciones = new int [n];
		
		for(int i=0; i<calificaciones.length; i++) {
			calificaciones[i] = scanner.nextInt();
		}
		
		System.out.println(metodoRecursivo(calificaciones, calificaciones.length - 1, 0));
	}
	
	public static float metodoRecursivo(int calificaciones [], int tamanio, float suma) {
			if(tamanio == -1) {
				return (suma)/calificaciones.length;
			}
			else {
				suma += calificaciones[tamanio];
				 System.out.println(suma);
				return metodoRecursivo(calificaciones, tamanio-1,suma);
				
			}
	}

}
