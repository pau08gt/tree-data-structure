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
        }else{//derecho
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


}
