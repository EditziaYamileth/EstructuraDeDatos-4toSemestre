package unidad2_Tareas;

public class Alumno {
	private int matricula;
	private String nombre;
	private char sexo;
	private int calificacion;
	private int edad;
	
	public Alumno(int matricula, String nombre, char sexo, int calificacion, int edad) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.sexo = sexo;
		this.calificacion = calificacion;
		this.edad = edad;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*public String toString() {
		String salida;
		
	}*/
	
	
	

}
