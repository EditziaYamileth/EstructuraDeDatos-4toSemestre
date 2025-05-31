package unidad4;

public class mainArbol {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        int[] valores = {
        	    50, 30, 70, 20, 3333, 60, 80,
        	    10, 25, 35, 45, 55, 65, 75, 85,
        	    5, 15, 22, 27, 32, 37, 42, 47
        };

        for (int val : valores) {
            arbol.insertar(val);
        }

        arbol.mostrar();
        System.out.println();

        Nodo nodo40 = arbol.buscarNodo(40);
        if (nodo40 != null) {
            System.out.println("Grado del nodo 40: " + arbol.gradoNodo(nodo40));
            System.out.println("Buscar 40 (bool): " + arbol.buscarBool(40));
            System.out.println("Nivel del nodo 40: " + arbol.nivelNodo(40));
            System.out.println("Grado del nodo 40: " + arbol.gradoNodo(nodo40));
            Nodo padre40 = arbol.buscarPadre(40);
            System.out.println("Padre de 40: " + (padre40 != null ? padre40.valor : "null"));
        } else {
            System.out.println("Nodo 40 no encontrado, no se puede calcular el grado.");
        }

        System.out.println("Mayor de los menores de 50: " + arbol.mayorDeLosMenores(arbol.raiz).valor);
        System.out.println("Menor de los mayores de 50: " + arbol.menorDeLosMayores(arbol.raiz).valor);
        System.out.println("Grado del árbol: " + arbol.gradoArbol(arbol.raiz));
        System.out.println("Total de nodos: " + arbol.totalNodos(arbol.raiz));
        System.out.println("Descendientes directos de 50: " + arbol.descendientesDirectos(arbol.raiz));
    }
}