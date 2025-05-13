package unidad2_Tareas;
import asesorias.Pila;
public class problema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila <Integer> pila = new Pila<>();
		int [] vector  = {1,2,3,4,5};
		for(int i=0; i<vector.length; i++) {
			pila.Meter(vector[i]);
		}
		System.out.println(pila);
		Reemplazar(pila, 3, 6);
		System.out.println(pila);
		

	}
	
	public static void Reemplazar(Pila <Integer> pila, Integer nuevo, Integer viejo) {
		Pila <Integer> pilaAux = new Pila<>();
		if(pila.estaVacia()) {
			 System.out.println("NO HAY ELEMENTOS EN  LA LISTA");
		}else {
			while(!pila.estaVacia()) {
				if(pila.Tope().compareTo(viejo) == 0) {
					pila.Sacar();
					pila.Meter(nuevo);
					break;
				} 
				pilaAux.Meter(pila.Sacar());
			}
			if(pila.estaVacia()) {
				System.out.println("NO SE ENCONTRO EL ELEMENTO");
			}
			while(!pilaAux.estaVacia()) {
					pila.Meter(pilaAux.Sacar());
					}	
				
			}
		}
			
		
	}


