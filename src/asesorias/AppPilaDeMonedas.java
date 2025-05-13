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
		
		Moneda monedaMenor;

		
		while(!pila.estaVacia()) {
			monedaMenor = new Moneda(null, 0, "");
			monedaMenor = pila.Tope();
			while(!pila.estaVacia()) {
				 if(monedaMenor.compareTo(pila.Tope()) ==  1) {
					 monedaMenor = pila.Tope();	 
				 } 
					 pilaAux.Meter(pila.Sacar());		 
			}
			
			while(!pilaAux.estaVacia()) {
				if(pilaAux.Tope().getId() != monedaMenor.getId()) {
					pila.Meter(pilaAux.Tope());
				} 
				pilaAux.Sacar();
			}
		
		colaAux.Meter(monedaMenor);
			
		}	
		System.out.println("COLA ORDENADA: ");
		System.out.println(colaAux);
	}
	
	
	public static int generarMoneda() {
		int n = (int) (Math.random() *5);
		return n;
	}
	

}
