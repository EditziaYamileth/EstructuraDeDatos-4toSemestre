package asesorias;

public class AppPila {
	public static void main( String args[] ) {
		Galleta galletas [] = new Galleta[5];
		for(int i=0; i<5; i++) {
			
			Galleta galleta = new Galleta("ARCOIRIS", i,12);
			galletas[i] = galleta;
		}
		
		//Pila <Galleta> pila = new Pila<Galleta> ();
		Pila <Galleta> pila =  new Pila<Galleta> ();
		for(int i=0; i<galletas.length;i++) 
			pila.Meter(galletas[i]);
		
		System.out.println(pila);
		
		
		
		
		
		
		
	}

}
