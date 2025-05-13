package asesorias;

public class Cola <Dato>{
	private Nodo <Dato> inicio;
	private Nodo <Dato> fin;
	
	public Cola() {inicio = null;}
	//public Cola(Cola<Dato> cola) {inicio = cola.getInicio();}
	
	public void Meter(Dato dato) {
		Nodo<Dato> nuevo = new Nodo<Dato>(dato);
		 if(inicio ==null) inicio = nuevo;
		 else fin.setSig(nuevo);
		fin = nuevo;
	}
	
	public Dato Sacar(){
		if (inicio == null) return null;
		if(inicio == fin) fin = null;
		Nodo <Dato> aux = inicio;
		inicio = aux.getSig();//?
		return aux.getDato();
	}
	
	public Dato Frente() {
		if(inicio == null) {return null;}
		return inicio.getDato();
	}
	
	public Dato Fin() {
		if(inicio == null){return null;}
		return fin.getDato();
	} 
	
	public boolean estaVacia() {
		return inicio == null;
	}
	
	public Dato getInicio(){return inicio.getDato();}
	public Nodo<Dato> getFin(){return fin;}
	
	public String toString() {
		String salida = "";
		if(inicio == null) return salida + "No hay clientes esperando \n";
		Nodo <Dato> act = inicio;
		for(int i = 0; act!=null;i++) {
			salida+="["+i+"]: ";
			if(act.getDato()== null) {return salida += "Nodo vacio";}
			else salida += act.getDato().toString();
			salida+="\n";
			act = act.getSig();
		}
		return salida;
	}	
}
