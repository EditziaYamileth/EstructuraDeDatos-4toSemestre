package unidad2_Tareas;
import asesorias.Pila;
import asesorias.Nodo;
public class Problema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Pila <Integer> pilaA = new Pila<>();
		Pila <Integer> pilaB = new Pila<>();
		Pila <Integer> pilaAux = new Pila<>();
		int [] vector =  {0,1,2,3,4,5};
		
		for(int i=0; i<vector.length; i++) {
			pilaB.Meter(vector[i]);
			
		}
		pilaA.Meter(5);
		pilaA.Meter(5);
		
		
		System.out.println("1. "+pilaA);
		System.out.println("2. "+pilaB);
		
		Integer elementA, elementB;
		boolean bool;
		
		do{
			bool = false;
			elementA = pilaA.Sacar();
			while(!pilaB.estaVacia() && bool == false) {
				pilaAux.Meter(pilaB.Tope());
				elementB = pilaB.Sacar();
				if(elementB.compareTo(elementA) == 0 ) {
					bool = true;
				}
			}
			while(!pilaAux.estaVacia()) {
				pilaB.Meter(pilaAux.Sacar());
			}
		}while(!pilaA.estaVacia() && bool == true);
		
		if(bool == true) {
			System.out.println("correcto");
		}else {System.out.println("no");}
	
		
		
	}

}
