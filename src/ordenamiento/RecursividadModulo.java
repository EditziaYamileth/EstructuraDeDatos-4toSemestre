package ordenamiento;

import java.util.Scanner;

public class RecursividadModulo {
static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
			//Modulo
			int num1,num2;
			System.out.println("Ingrese un numero: ");
			num1 = scanner.nextInt();
			
			System.out.println("Ingrese otro numero: ");
			num2 = scanner.nextInt();
			int contador =0;
			
			System.out.println(metodoModulo1(num1, num2, contador));
			
			
		}
		
		public static int metodoModulo1(int num1,int num2, int contador){
			if(num1==0) {
				return 0;
			}
			if (num2 < num1 ) {
				return contador;	
			}
				return (metodoModulo2(num1,num2 - num1, contador+=1));
			
		}
		
		public static int metodoModulo2(int num1, int num2, int contador) {
			return (metodoModulo1(num1,num2,contador));
			
		}

}

		
	
	
	


