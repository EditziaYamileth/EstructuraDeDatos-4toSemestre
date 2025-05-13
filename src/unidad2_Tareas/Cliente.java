package unidad2_Tareas;

public abstract class Cliente implements Comparable<Cliente>{
	private String nombre;

	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract int getPrioridad();
	
	public int compareTo(Cliente cliente) {
		if(getPrioridad() > cliente.getPrioridad()) {
			return 1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Cliente : "+nombre;
	}
	
	
}