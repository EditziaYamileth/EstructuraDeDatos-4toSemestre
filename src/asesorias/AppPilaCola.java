package asesorias;

public class AppPilaCola {

	public static void main(String[] args) {
		char cadena [] = {'H','O','L','A',' ','M','U','N','D','O'};
		System.out.println("PASAR UNA PILA A OTRA: ");
		Pila <Character> pila = new Pila<>();
		for(int i=0; i<cadena.length;i++) {
			pila.Meter(cadena[i]);
		}
		System.out.println(pila);
		System.out.println("PILA ORDENADA: ");
		Pila <Character> pilaOrdenada = new Pila<>();
		for(int i=0; i<cadena.length; i++) {
			pilaOrdenada.Meter(pila.Sacar());
		}
		System.out.println(pilaOrdenada);
		System.out.println("INVERTIR LA CADENA CON UNA COLA: ");
		Cola<Character> cola = new Cola<>();
		for(int i=0; i<cadena.length;i++) {
			pila.Meter(cadena[i]);
		}
		for(int i=0; i<cadena.length;i++) {
			cola.Meter(pila.Sacar());
		}
		System.out.println(cola);
	}

}
