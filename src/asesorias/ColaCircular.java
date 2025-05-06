package asesorias;

public class ColaCircular <Dato>{
	private Nodo<Dato> inicio;
	private Nodo<Dato> fin;
	
	public ColaCircular() {inicio = null;}
	public ColaCircular(ColaCircular<Dato> colaCircular) {inicio = colaCircular.getInicio();}
	
	public void Meter(Dato dato) {
		Nodo<Dato> nuevo = new Nodo<>(dato);
		if(inicio == null) {inicio = nuevo;}
		else fin.setSig(nuevo);
		fin = nuevo;
		nuevo.setSig(inicio);
	}
	
	public Dato Sacar() {
		if(inicio == null) {return null;}
		if(inicio == fin) fin = null; //?
		Nodo<Dato> aux = inicio; //?
		inicio = aux.getSig();
		//fin = inicio no es necesario
		return aux.getDato();
		
	}

	public Dato Frente() {
			if( inicio==null ) return null;
		return inicio.getDato();
	}

	public Dato Fin() {
			if( fin==null ) return null;
		return fin.getDato();
	}
	
	public Nodo<Dato> getInicio(){ return inicio; };
	
	public Nodo<Dato> getFin(){ return fin; };
	
	public boolean estaVacia() {
		return inicio==null;
	}
	
	public String toString() {
		String salida="Contenido de la cola circular:\n";
			if( inicio == null ) return salida + "La cola circular esta vacia";
		Nodo<Dato> act = inicio;
		for( int i=0; act != fin; i++ ) {
			salida+="["+i+"]: ";
			if( act.getDato()==null ) salida +="Nodo vacio";
			else salida += act.getDato().toString();
			salida+="\n";
			act = act.getSig();
		}
		
	//CONCATENAR EL ULTIMO:
		if( act.getDato()==null ) salida +="Nodo vacio";
		else salida += act.getDato().toString();
		
		return salida;
	}

}
	


