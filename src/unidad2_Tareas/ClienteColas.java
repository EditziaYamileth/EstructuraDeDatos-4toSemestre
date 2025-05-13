package unidad2_Tareas;
import asesorias.Cola;

public class ClienteColas {
	private  Cola<Cliente> colaPreferente =  new Cola<>();
	private  Cola <Cliente> colaNormal = new Cola<>();

	public void llegarCliente(String prioridad, String nombre) {
		Cliente cliente;
		if(prioridad.equalsIgnoreCase("preferente")) {
			 cliente = new ClientePreferente(nombre);
			colaPreferente.Meter(cliente);
			
		} else {
			 cliente = new ClienteNormal(nombre);
				colaNormal.Meter(cliente);
			
		}
	

	}
	
	public void atenderCliente() {
		if(!colaPreferente.estaVacia()) {
			System.out.println("Atendiendo a cola preferente " +colaPreferente.getInicio()+"\n");
			colaPreferente.Sacar();
			return;
		} else if(!colaNormal.estaVacia()) {
			System.out.println("Atendiendo a cola normal " +colaNormal.getInicio()+"\n");
			colaNormal.Sacar();
			return;
		} 
		System.out.println("NO HAY CLIENTES POR ATENDER");
	}
	
	public void estadoColas() {
		System.out.println("Clientes de la cola preferente: ");
		System.out.println(colaPreferente);
		System.out.println("Clientes de la cola normal:");
		System.out.println(colaNormal);
	}

}
