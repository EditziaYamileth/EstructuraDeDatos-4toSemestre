package unidad2_Tareas;

public class Soldado implements Comparable <Soldado>{
	private int NoSoldado;
	private int Edad;
	
	public Soldado(int noSoldado, int edad) {
		NoSoldado = noSoldado;
		Edad = edad;
	}
	public Soldado() {
	}
	
	public int getNoSoldado() {
		return NoSoldado;
	}
	public void setNoSoldado(int noSoldado) {
		NoSoldado = noSoldado;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	@Override
	public int compareTo(Soldado soldado) {
		// TODO Auto-generated method stu
		if(NoSoldado > soldado.getNoSoldado()) return 1;
		else if(NoSoldado < soldado.getNoSoldado()){
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Soldado ["+NoSoldado+"] Edad: "+ Edad;
	}
	
	
	

}
