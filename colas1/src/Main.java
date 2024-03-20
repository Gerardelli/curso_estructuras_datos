

public class Main {
    public static void main(String[] args) {
        //
        ColaPedidos cola = new ColaPedidos();

        cola.agregarCola(1,"Julian");
        cola.agregarCola(2,"Alice");
        cola.agregarCola(3,"Perla");
        cola.agregarCola(4,"Carlos");

        cola.obtener();

        cola.eliminar();

        cola.obtener();
        cola.obtenerSiguiente();


    }
}