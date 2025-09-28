public class Pila<T> {
    private Nodo<T> cima;
    private int tamaño;

    public Pila() {
        cima = null;
        tamaño = 0;
    }

    public void push(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    public T pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        T valor = cima.valor;
        cima = cima.siguiente;
        tamaño--;
        return valor;
    }

    public T peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return cima.valor;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public int tamaño() {
        return tamaño;
    }
}
