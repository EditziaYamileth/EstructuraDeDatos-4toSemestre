package asesorias;

public class AppFrasco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Frasco simples:\n ");
		Frasco<Galleta> misGalletas;
		Frasco<Nuez> misNueces;
		
		Galleta galleta = new Galleta("ARCOIRIS", 0, 15);
		Nuez nuez = new Nuez(0,8);
		
		misGalletas = new Frasco<Galleta>(0,galleta);
		misNueces = new Frasco<Nuez>(0,nuez);
		
		System.out.println(misGalletas);
		System.out.println(misNueces);
		
		System.out.println("Frasco Recursivo");
		Frasco<Galleta> segundoFrasco = new Frasco<Galleta>(1,galleta);
		Frasco <Frasco <Galleta>> frascoRecursivo = new Frasco<Frasco<Galleta>>(2,segundoFrasco);
		System.out.println(frascoRecursivo);
		

	}

}
