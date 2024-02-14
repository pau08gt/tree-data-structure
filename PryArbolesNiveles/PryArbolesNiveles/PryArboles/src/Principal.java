public class Principal {
    public static void main(String[] args) {
        Arbol a1=new Arbol();
        a1.insertar(new Computador(100,"IBM","i7 14700",16,"rtx3050","256gb"));
        a1.insertar(new Computador(25,"HP","i5 14400",16,"rtx4060","256gb"));
        a1.insertar(new Computador(200,"IBM","i3 12100",32,"rtx3080","256gb"));
        a1.insertar(new Computador(280,"HP","r5 5600x",16,"gtx1660","256gb"));
        a1.insertar(new Computador(400,"IBM","r9 7900",32,"rtx4070super","256gb"));
        a1.insertar(new Computador(10,"HP","r3 3200g",16,"rtx3050","256gb"));
        a1.insertar(new Computador(5,"IBM","i9 14900k",64,"rtx3090","500gb"));
        a1.insertar(new Computador(1,"HP","i5 14100F",16,"rtx3050","256gb"));
        a1.insertar(new Computador(1,"HP","i5 14100F",16,"rtx3050","256gb"));
        a1.insertar(new Computador(250,"HP","i5 14100F",16,"rtx3050","256gb"));
        System.out.println(a1.inOrden());
        System.out.println("Recorrido x Niveles");

        for(NodoArbol x:a1.recorridoNiveles()){
            System.out.println(x.getCpu().toString());
        }

        System.out.println("La sumatorio total del arbol es "+a1.sumar());

    }


}
