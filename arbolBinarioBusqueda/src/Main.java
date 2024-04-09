public class Main {
    public static void main(String[] args) {
        ArbolBinario abb = new ArbolBinario();
        abb.insertar(10);
        abb.insertar(5);
        abb.insertar(11);
        abb.insertar(2);

        abb.inOrden(abb.raiz);
        System.out.println();
        abb.prePorden(abb.raiz);
        System.out.println();

        abb.eliminar(2);

        Nodo buscado = abb.buscar(5);

        if (buscado == null) {
            System.out.println("No se encontro");
        }else {
            System.out.println("Si lo encontre y es este: " + buscado.valor);
        }

        System.out.println("El numero de hojas es: " + abb.contarHojas());
        System.out.println("El numero de nodos es: " + abb.contarNodos());

        System.out.println(abb.valorMinimo(abb.raiz));
    }
}