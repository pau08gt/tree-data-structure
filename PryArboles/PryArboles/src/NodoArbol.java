public class NodoArbol {
    private Computador cpu;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(Computador cpu) {
        this.cpu = cpu;
        izquierdo=derecho=null;
    }

    public NodoArbol(Computador cpu, NodoArbol izquierdo, NodoArbol derecho) {
        this.cpu = cpu;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Computador getCpu() {
        return cpu;
    }

    public void setCpu(Computador cpu) {
        this.cpu = cpu;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
}
