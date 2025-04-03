package ordenamiento;

import java.util.Scanner;

public class RecursividadPotMultiplo2 {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		
		metodoRecursivo(n,0);
		System.out.println(50*50*65);
		
		
		

	}
	
	public static void metodoRecursivo(int n, int exponente) {
		if(n==0) return;
		exponente = Math.getExponent(n);
		if(Math.pow(2, exponente) - n == 0) {
			
			System.out.print("2**"+exponente+" ");
			
			return;
		}
		System.out.print("2**"+exponente +"+");
		metodoRecursivo( (int) (n - Math.pow(2, exponente)), exponente);
	}

}
