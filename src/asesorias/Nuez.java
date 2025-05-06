package asesorias;

public class Nuez {
	int id;
	int peso;
	boolean pelada;
	
	public Nuez(int id, int peso) {
		this.id = id;
		this.peso = peso;
	}
	
	public void Pelar() {
		pelada = true;
	}
	
	public String Comer() {
		if(pelada) return "Comiendo Nuez...yum!";
		return "No se puede comer la nuez sin pelarla";
	}
	
	public String toString() {
		return "Nuez ["+id+"]: Peso: "+peso+" kg";
	}
	

}
