package asesorias;

import java.util.Arrays;

public class AppFrasco1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frasco <Galleta []> misGalletas;
		Frasco <Nuez[]> misNueces;
		
		Galleta galletas [] = new Galleta [5];
		Nuez nueces [] = new Nuez [5];
		
		for(int i=0;i<5; i++) {
			Galleta galleta = new Galleta("ARCOIRIS", i, 6);
			Nuez nuez = new Nuez(i,5);
			galletas[i] = galleta;
			nueces[i] = nuez;
		}
		
		misGalletas = new Frasco<Galleta[]>(0,galletas);
		misNueces = new Frasco<Nuez[]>(0,nueces);
		
		//Mostrar dir de memoria de los arreglos
		System.out.println(misGalletas);
		System.out.println(misNueces);
		
		
		//Mostrar contenido de los arreglos
		//galletas[0] = misGalletas.ExaminaContenido();
		
		nueces = misNueces.ExaminaContenido();
		System.out.println();
		
		//Forma facil de imprimir los arreglos
		System.out.println(Arrays.toString(galletas));
		System.out.println(Arrays.toString(nueces));
	}

}
