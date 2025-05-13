package asesorias;

public class NodoLista <Dato extends Comparable <Dato>>{
	
	private final Dato dato;
	private NodoLista <Dato> sig;
	public NodoLista(Dato dato) {
		this.dato = dato;
		sig = null;
	}
	public NodoLista<Dato> getSig() { return sig; }
	public void setSig( NodoLista< Dato> sig ) { this.sig = sig; }
	public Dato getDato() { return dato; }
	

}
