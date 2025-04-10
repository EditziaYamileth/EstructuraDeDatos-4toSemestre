package ordenamiento;

import java.util.Scanner;

public class RecursividadArreglo {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		/*Busca un elemento en un arreglo*/
		
		int [] arreglo = {0};
		System.out.println("Ingrese el numero que desea buscar: ");
		int num = scanner.nextInt();
		
		boolean bool = (metodoArreglo(arreglo,num,arreglo.length-1));
		if(bool) {
			System.out.println(num + " se encuentra en el arreglo");
		}
		else {
			System.out.println(num + " NO se encuentra en el arreglo");
		}
		
		

	}
	
	
	public static boolean metodoArreglo(int [] arreglo, int num, int length) {
		if(length < 0) {
			return false; 
			
		}
		
		else if(arreglo[length] == num) {
			return true;
		}
		
		return metodoArreglo(arreglo, num, length-1);
	}
	
	
	/*public static boolean metodoArreglo(int [] arreglo, int num, int y) {
		
		if(y < 0 ){
			return false;
		}
		if(arreglo[y] == num) {
			return true;
		}
			return metodoArreglo(arreglo,num,y-1);
	}
	*/
	

}
