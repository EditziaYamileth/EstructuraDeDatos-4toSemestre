package asesorias;

public class Nodo <Dato>{
	private Dato dato;
	private Nodo < Dato > sig;
	
	public Nodo(Dato dato) {
		this.dato = dato;
		this.sig = null;
	}
	
	public Dato getDato() {
		return dato;
	}
	
	public void setDato(Dato dato) {
		this.dato = dato;
	}
	public Nodo<Dato> getSig(){
		return sig;
	}
	
	public void setSig(Nodo <Dato>sig) {
		this.sig = sig;
	}

}
