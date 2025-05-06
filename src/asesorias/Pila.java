package asesorias;

public class Pila  <Dato>{
	private Nodo<Dato>inicio;
	public Pila() { inicio = null;}
	public Pila(Pila<Dato>pila) { inicio = pila.getInicio();}
	
	public void Meter(Dato dato) {
		Nodo<Dato> nuevo = new Nodo<Dato>(dato);
		nuevo.setSig(inicio);
		inicio = nuevo;
	}
	
	public Dato Tope() {
			if(inicio == null) return null;
		return inicio.getDato();
	}
	
	public Dato Sacar() {
		if(inicio == null) return null;
		Nodo<Dato> aux = inicio;
		inicio = aux.getSig();
		return aux.getDato();
	}
	
	public boolean estaVacia() {
		return inicio == null;
	}
	
	public Nodo<Dato> getInicio(){return inicio;}
	
	public String toString() {
		String salida = "Contenido de la pila:\n";
		if(inicio == null) return salida +"La pila esta vacia";
		Nodo<Dato> act = inicio;
		for( int i =0; act != null; i++) {
			salida+="["+i+"]";
			if(act.getDato() == null) salida += "Nodo vacio";
			else salida += act.getDato().toString();
			salida+="\n";
			act = act.getSig();
		}
		return salida;
	}
	

}
