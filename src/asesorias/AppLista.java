package asesorias;

public class AppLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista <Integer> lista = new Lista<>();
		lista.Meter(1);
		lista.Meter(3);
		lista.Meter(2);
		lista.Meter(1);
		lista.Sacar(3);
		System.out.println(lista);


	}

}
