package unidad2_Tareas;
import asesorias.Cola;
import asesorias.Pila;
public class problema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola <Integer> cola = new Cola<>();
		Pila <Integer> pila = new Pila<>();
		
		//int [] vector = {1,2,3,4,5};
		for(int i=0; i<5;i++) {
			cola.Meter(i);
		}
		System.out.println(cola);
	
		Invertir(cola);
		System.out.println(cola);

	}
	
	public static Cola<Integer> Invertir(Cola<Integer> cola) {
		Pila <Integer> pila = new Pila<>();
		for(int i=0; i<5; i++) {
			pila.Meter(cola.Sacar());
		}
		for(int i=0; i<5; i++) {
			cola.Meter(pila.Sacar());
		} 
		return cola;
		
	}

}
