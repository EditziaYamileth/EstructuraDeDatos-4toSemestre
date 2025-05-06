package asesorias;

public class Frasco <Contenido>{
	private int id;
	private Contenido contenido;
	
	public Frasco(int id, Contenido contenido) {
		this.id = id;
		this.contenido = contenido;
	}
	public Contenido Vaciar() {
		Contenido aux = ExaminaContenido();
		contenido = null;
		return aux;
	}
	
	public Contenido ExaminaContenido() {
		return contenido;
	}
	
	
	public String toString() {
		String salida = "Contenido del frasco ["+id+"]:\n";
		if(contenido == null) return "El frasco esta vacio";
		return salida + contenido.toString() + "\n";
	}
	
	
	

}
