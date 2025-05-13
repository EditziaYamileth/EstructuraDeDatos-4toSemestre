package asesorias;

public class Lista <Dato extends Comparable <Dato>>{
	private Nodo <Dato> inicio;
	
	public void Meter(Dato dato) {
		Nodo<Dato> ant = null, act = inicio;
		while(act!=null && Comparar(act.getDato(), dato) < 0) {
			ant = act;
			act = act.getSig();
		}
		
		Nodo <Dato> nuevo = new Nodo<Dato>(dato);
			if( ant == null) inicio = nuevo;
			else ant.setSig(nuevo);
		nuevo.setSig(act);	
	}
	
	private int Comparar(Dato primero, Dato segundo) {
		return primero.compareTo(segundo);
	}
	
	public Dato Sacar (Dato dato) {
		Nodo <Dato> ant=null, act = inicio;
			while(act !=null && Comparar(act.getDato(), dato)!=0) {
				ant = act;
				act = act.getSig();
			}
			
			if(act == null) return null;
			if(act == inicio) inicio = act.getSig();
			else if(ant != null) ant.setSig(act.getSig());
		return act.getDato();
	}
	
	public String toString() {
		String salida = " Contenido de la lista:\n";
			if( inicio == null ) return salida + "La lista esta vacia";
		Nodo<Dato> act = inicio;
			for( int i=0; act != null; i++ ) {
				salida+="["+i+"]: ";
					if( act.getDato()==null ) salida +="Nodo vacio";
					else salida += act.getDato().toString();
				salida+="\n";
				act = act.getSig();
			}
		return salida;
	}
	public Nodo<Dato> getInicio() { return inicio; }
	public void setInicio(Nodo<Dato> inicio) { this.inicio = inicio; }

}
