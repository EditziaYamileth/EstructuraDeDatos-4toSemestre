package unidad4;

public class MainDijkstra {
    public static void main(String[] args) {
        int numVertices = 6;
        Dijkstra dijkstra = new Dijkstra(numVertices);

        // Grafo dirigido con pesos
        dijkstra.agregarArista(0, 1, 7);
        dijkstra.agregarArista(0, 2, 9);
        dijkstra.agregarArista(0, 5, 14);
        dijkstra.agregarArista(1, 2, 10);
        dijkstra.agregarArista(1, 3, 15);
        dijkstra.agregarArista(2, 3, 11);
        dijkstra.agregarArista(2, 5, 2);
        dijkstra.agregarArista(3, 4, 6);
        dijkstra.agregarArista(4, 5, 9);

        dijkstra.dijkstra(0); // Calcula desde nodo 0
    }
}
