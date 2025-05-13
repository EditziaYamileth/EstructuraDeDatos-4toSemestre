package unidad2_Tareas;
import asesorias.Pila;
import asesorias.Leer;

public class Problema6 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pila <Character> pila = new Pila<>();
			String caracteres;
			caracteres = Leer.dato();
			IngresarChar(caracteres, pila);
			
		}
		
		public static void IngresarChar(String caracteres, Pila<Character> pila) {
			for(int i=0; i<caracteres.length(); i++) {
				switch(caracteres.charAt(i)) {
				case '(':
					pila.Meter(caracteres.charAt(i));
					break;
				case ')':
					pila.Sacar();
					break;
				case '{':
					pila.Meter(caracteres.charAt(i));
					break;
				case '}':
					pila.Sacar();
					break;
				case '[':
					pila.Meter(caracteres.charAt(i));
					break;
				case ']':
					pila.Sacar();
					break;
				default:
					System.out.println("EXPRESION INVALIDA");
					return;
					}
				}
			
			if(!pila.estaVacia()) {
				System.out.println("Los parentesis no estan balanceados");
				
			}else {
				System.out.println("Parentesis balanceados");
			}
		}
}
