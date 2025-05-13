package unidad2_Tareas;
import unidad1.Lista;
public class problema1 {
	public static void main(String[] args) {
		Lista <Soldado> lista = new Lista<>();
		Soldado soldado = new Soldado();
		for(int i=0; i<50; i++) {
			soldado = new Soldado(generarNumeroSoldado(),generarEdad());
			lista.InsertarFinal(soldado);
		}
		System.out.println("CONTENIDO DE LA LISTA:");
		System.out.println(lista);
		do {
			lista.Borrar(generarMision());
		}while(lista.length() != 1);
		System.out.println("EL SOLDADO QUE DEBE DE IR A LA MISION ES:");
		System.out.println(lista);
		
	}
	
	public static int generarEdad() {
		int n = (int) (Math.random() * (35 - 18 + 1));
		return n+ 18;
	}
	public static int generarMision() {
		int n = (int) (Math.random() *50)+1;
		return n;
	}
	
	public static int generarNumeroSoldado() {
		int n = (int) (Math.random() *1000)+1;
		return n;
	}
	
}
