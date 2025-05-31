package unidad4;
class Nodo {
    int valor;
    Nodo izq, der;

    Nodo(int valor) {
        this.valor = valor;
        izq = der = null;
    }
}

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.izq = insertarRec(raiz.izq, valor);
        else if (valor > raiz.valor)
            raiz.der = insertarRec(raiz.der, valor);
        return raiz;
    }

    public void mostrar() {
        mostrarRec(raiz);
    }

    private void mostrarRec(Nodo raiz) {
        if (raiz != null) {
            mostrarRec(raiz.izq);
            System.out.print(raiz.valor + " ");
            mostrarRec(raiz.der);
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public boolean buscarBool(int valor) {
        return buscarRec(raiz, valor) != null;
    }

    public Nodo buscarNodo(int valor) {
        return buscarRec(raiz, valor);
    }

    private Nodo buscarRec(Nodo nodo, int valor) {
        if (nodo == null || nodo.valor == valor)
            return nodo;
        if (valor < nodo.valor)
            return buscarRec(nodo.izq, valor);
        else
            return buscarRec(nodo.der, valor);
    }

    public Nodo buscarPadre(int valor) {
        return buscarPadreRec(raiz, null, valor);
    }

    private Nodo buscarPadreRec(Nodo actual, Nodo padre, int valor) {
        if (actual == null)
            return null;
        if (actual.valor == valor)
            return padre;
        if (valor < actual.valor)
            return buscarPadreRec(actual.izq, actual, valor);
        else
            return buscarPadreRec(actual.der, actual, valor);
    }

    public Nodo mayorDeLosMenores(Nodo nodo) {
        nodo = nodo.izq;
        while (nodo != null && nodo.der != null) {
            nodo = nodo.der;
        }
        return nodo;
    }

    public Nodo menorDeLosMayores(Nodo nodo) {
        nodo = nodo.der;
        while (nodo != null && nodo.izq != null) {
            nodo = nodo.izq;
        }
        return nodo;
    }

    public int nivelNodo(int valor) {
        return nivelRec(raiz, valor, 0);
    }

    private int nivelRec(Nodo nodo, int valor, int nivel) {
        if (nodo == null)
            return -1;
        if (nodo.valor == valor)
            return nivel;
        if (valor < nodo.valor)
            return nivelRec(nodo.izq, valor, nivel + 1);
        else
            return nivelRec(nodo.der, valor, nivel + 1);
    }

    public int gradoNodo(Nodo nodo) {
        if (nodo == null) return -1;  // O 0, según lo que quieras devolver si no existe
        int grado = 0;
        if (nodo.izq != null) grado++;
        if (nodo.der != null) grado++;
        return grado;
    }

    public int gradoArbol(Nodo nodo) {
        if (nodo == null)
            return 0;
        int gradoIzq = gradoArbol(nodo.izq);
        int gradoDer = gradoArbol(nodo.der);
        int gradoActual = gradoNodo(nodo);
        return Math.max(gradoActual, Math.max(gradoIzq, gradoDer));
    }

    public int totalNodos(Nodo nodo) {
        if (nodo == null)
            return 0;
        return 1 + totalNodos(nodo.izq) + totalNodos(nodo.der);
    }

    public int descendientesDirectos(Nodo nodo) {
        int count = 0;
        if (nodo.izq != null) count++;
        if (nodo.der != null) count++;
        return count;
    }
}