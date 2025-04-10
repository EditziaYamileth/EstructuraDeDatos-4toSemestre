package unidad2;

import java.util.Scanner;

public class RecursividadFactorial {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Factorial
		int num;
		System.out.println("Ingrese un numero: ");
		num = scanner.nextInt();
		
		
		System.out.print(num+"! = ");
		System.out.println(metodoRecursivo(num));
		
		

	}
	
	public static int metodoRecursivo(int num) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static int metodoRecursivo(int num){
		if(num==0) {
			System.out.println();
			return 1;
		}
		if(num == 1) {
			System.out.print(num);
		
		}
		else {
			System.out.print(num + " * ");
		}
		
		return num * metodoRecursivo(num - 1);

		
	}*/

}
