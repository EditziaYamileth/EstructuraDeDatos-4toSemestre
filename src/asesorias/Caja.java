package asesorias;

public class Caja <Contenido>{
	private int id;
	private Contenido contenido[];
	
	public Caja(int id, Contenido contenido []) {
		this.id = id;
		this.contenido = contenido;
	}

	
	public String toString() {
		String salida = "Contenido de la caja ["+id+"]:\n";
		if(contenido == null) return salida + "La caja esta vacia";
		for(int i=0;i<contenido.length;i++) {
			salida +="["+i+"] ";
			if(contenido[i] == null) salida +="posicion vacia";
			else salida +="["+i+"]: "+contenido[i]+"\n";
			
		}
		return salida;
		
	}
	
	
	
	
	
	

}
