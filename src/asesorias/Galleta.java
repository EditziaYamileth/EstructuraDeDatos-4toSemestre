package asesorias;

public class Galleta { 
	String marca;
	int id;
	int peso;
	
	public Galleta(String marca, int id, int peso) {
		this.marca = marca;
		this.id = id;
		this.peso = peso;
	}
	
	public String Comer() {
		return "Comiendo galleta...yum!";
	}
	
	public String toString() {
		return "Galleta ["+id+"]: marca: "+marca+" Peso: "+peso+" G";	
	}
}
