package asesorias;
import java.util.Scanner;

public class AppPilaDeMonedas {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int vector[] = {1,2,5,10,20};
		
		Pila <Moneda> pila = new Pila<>();
		Moneda moneda;
		for(int i = 0;  i<n; i++) {
			moneda = new Moneda(i, vector[generarMoneda()], "peso");
			pila.Meter(moneda);
		}
		
		System.out.println("PILA DESORDENADA:");
		System.out.println(pila);
		Pila <Moneda> pilaAux = new Pila<>();
		Cola <Moneda> colaAux =  new Cola<>();
		
		Moneda monedaMayor;

		
		while(!pila.estaVacia()) {
			monedaMayor = new Moneda(null, 0, "");
			while(!pila.estaVacia()) {
				 if(monedaMayor.compareTo(pila.Tope()) ==  -1) {
					 monedaMayor = pila.Tope();	 
				 } 
					 pilaAux.Meter(pila.Sacar());		 
			}
			
			while(!pilaAux.estaVacia()) {
				if(monedaMayor.compareTo(pilaAux.Tope()) == 1 || pilaAux.Tope().getId() != monedaMayor.getId()) {
					pila.Meter(pilaAux.Tope());
				} 
				pilaAux.Sacar();
			}
		
		colaAux.Meter(monedaMayor);
			
		}	
		System.out.println("COLA ORDENADA: ");
		System.out.println(colaAux);
	}
	
	
	public static int generarMoneda() {
		int n = (int) (Math.random() *5);
		return n;
	}
	

}
