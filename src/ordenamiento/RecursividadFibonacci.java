package ordenamiento;

import java.util.Scanner;

public class RecursividadFibonacci {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		System.out.println("Ingrese un numero");
		num = scanner.nextInt();
		System.out.println(metodoRecursivo(num));
		

	}
	
	public static int metodoRecursivo(int num){
		if(num <= 1) {
			return num;
		}
		
		return metodoRecursivo(num-1) + metodoRecursivo(num-2);
	}

}
