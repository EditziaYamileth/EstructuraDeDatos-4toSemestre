package asesorias;

public class AppCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Galleta chokies = new Galleta("CHOKIES", 0, 5);
		Galleta polvorones = new Galleta("POLVORONES",1,8);
		Galleta arcoiris = new Galleta("ARCOIRIS",2,4);
		Galleta emperadorChocolate = new Galleta("EMPERADOR DE CHOCOLATE",3,7);
		Galleta crackets = new Galleta("CRACKETS",4,4);
		
				
		Galleta arregloGalletas [] = {chokies,polvorones,arcoiris,emperadorChocolate,crackets};
		
		Caja <Galleta> misGalletas = new Caja <Galleta>(0,arregloGalletas);
		System.out.println("CAJA SIMPLE:\n-------------------------------------------------------------");
		System.out.println(misGalletas.toString());
		System.out.println("-------------------------------------------------------------");
		
		Caja <Galleta> segunda [] = new Caja [2];
		
		segunda[0] =  new Caja <Galleta>(1,arregloGalletas);
		segunda[1] = null;
		System.out.println("Caja recursiva");
		Caja <Caja <Galleta>> principal = new Caja <Caja<Galleta>> (0,segunda);
		System.out.println(principal);
		
	}

}

/*int [] vector = new int[10];
System.out.println(vector[5]);
int []vectorr = {1,2};
System.out.println(vectorr[0]);*/

