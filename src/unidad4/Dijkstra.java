package unidad4;
import java.util.Arrays;

public class Dijkstra {
    private int numVertices;
    private int[][] grafo;

    public Dijkstra(int numVertices) {
        this.numVertices = numVertices;
        grafo = new int[numVertices][numVertices];
    }

    public void agregarArista(int origen, int destino, int peso) {
        grafo[origen][destino] = peso;
    }

    public void dijkstra(int origen) {
        int[] distancias = new int[numVertices];
        boolean[] visitados = new boolean[numVertices];

        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origen] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int u = minimoDistancia(distancias, visitados);
            visitados[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visitados[v] && grafo[u][v] != 0 &&
                    distancias[u] != Integer.MAX_VALUE &&
                    distancias[u] + grafo[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + grafo[u][v];
                }
            }
        }

        imprimirResultado(distancias, origen);
    }

    private int minimoDistancia(int[] distancias, boolean[] visitados) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < numVertices; v++) {
            if (!visitados[v] && distancias[v] <= min) {
                min = distancias[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    private void imprimirResultado(int[] distancias, int origen) {
        System.out.println("Distancias más cortas desde el nodo " + origen + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("A nodo " + i + " = " + (distancias[i] == Integer.MAX_VALUE ? "∞" : distancias[i]));
        }
    }
}
