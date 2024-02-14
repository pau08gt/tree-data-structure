import java.util.LinkedList;
import java.util.Queue;

public class Arbol {

    private NodoArbol raiz;

    public Arbol(){
        raiz=null;
    }


    private void insertar(NodoArbol actual,Computador cpu){
        //criterio datos mayor derecha, datos menores izquierda

        if(cpu.getCodigo()<actual.getCpu().getCodigo()){
            if(actual.getIzquierdo()==null)
                actual.setIzquierdo(new NodoArbol(cpu));
            else
                insertar(actual.getIzquierdo(),cpu);
        }else{//derecho >=
            if(actual.getDerecho()==null)
                actual.setDerecho(new NodoArbol(cpu));
            else
                insertar(actual.getDerecho(),cpu);
        }

    }


    public void insertar(Computador cpu){
        if(raiz==null){
            raiz=new NodoArbol(cpu);
        }else{
            insertar(raiz,cpu);
        }

    }

    private String inOrden(NodoArbol actual){
        if(actual!=null){
            return inOrden(actual.getIzquierdo())+
                   actual.getCpu().toString()+
                   inOrden(actual.getDerecho());
        }
        return "";
    }

    public String inOrden(){
        if(raiz==null)
            return "Arbol vacio";
        return inOrden(raiz);
    }

    private int sumar(NodoArbol actual){
        if(actual!=null)
            return actual.getCpu().getCodigo()+
                    sumar(actual.getIzquierdo())+
                    sumar(actual.getDerecho());
        return 0;
    }

    public int sumar(){
        return sumar(raiz);
    }



    public Queue<NodoArbol> recorridoNiveles(){
        Queue<NodoArbol> c1=new LinkedList();
        Queue<NodoArbol> c2=new LinkedList();
        NodoArbol aux=null;
        c1.add(raiz);

        while(!c1.isEmpty()){
            aux=c1.poll();
            if(aux.getIzquierdo()!=null)
                c1.add(aux.getIzquierdo());
            if(aux.getDerecho()!=null)
                c1.add(aux.getDerecho());
            c2.add(aux);
        }
        return c2;
    }


}
