package unidad2_Tareas;
import asesorias.Leer;
public class ClienteColaApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteColas colas = new ClienteColas();
		System.out.println("NUMERO DE CLIENTES QUE INGRESARA: ");
		int n = Leer.datoInt();
		String propiedad, nombre;

		
		for(int i=0;i<n;i++) {
			System.out.print("["+(i+1)+"] ");
			System.out.println("Ingrese el nombre: ");
			nombre = Leer.dato();
			System.out.println("Ingrese la propiedad, preferente o normal: ");
			propiedad = Leer.dato();
			colas.llegarCliente(propiedad, nombre);	
		}
		System.out.println();
		colas.estadoColas();
		colas.atenderCliente();
		colas.estadoColas();
		colas.atenderCliente();
		colas.estadoColas();
	}

}
