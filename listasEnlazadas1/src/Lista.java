public class Lista {

    private Nodo head = null;
    private int length = 0;

    public class Nodo{
        public int data;
        public Nodo next = null;

        public Nodo(int data) {
            this.data = data;
        }
    }

    public boolean isEmptyList() {
        return head == null;
    }

    public void contar() {
        System.out.println(length);
    }

    public void mostrarNodos() {
        Nodo current = head;
        int contador = 0;
        while (current != null){
            System.out.println("El elemento del nodo " + (contador + 1) + " es: " + current.data);
            current = current.next;
            contador++;
        }
    }

    public void insertarAlInicio(int valor) {
        Nodo nodo = new Nodo(valor);
        nodo.next = head;
        head = nodo;
        length++;
    }

    public void insertarAlFinal(int valor) {
        Nodo nodo = new Nodo(valor);
        if (isEmptyList()) {
            head = nodo;
        } else {
            Nodo puntero = head;
            while (puntero.next != null){
                puntero = puntero.next;
            }
            puntero.next = nodo;
        }
        length++;
    }

    public void insertarEnPosicion(int posicion, int valor) {
        Nodo nodo = new Nodo(valor);
        if (head == null) {
            head = nodo;
        } else {
            Nodo puntero = head;
            int contador = 0;
            while (contador < (posicion-1) && puntero.next != null){
                puntero = puntero.next;
                contador++;
            }
            nodo.next = puntero.next;
            puntero.next = nodo;
        }
        length++;
    }

    public int obtenerNodo(int posicion) {
        if (isEmptyList()) {
            return 0;
        } else {
            Nodo puntero = head;
            int contador = 0;
            while (contador < posicion && puntero.next != null){
                puntero = puntero.next;
                contador++;
            }
            if (contador != posicion){
                return 0;
            }else {
                return puntero.data;
            }
        }
    }

    public void eliminarAlInicio() {
        if (!isEmptyList()) {
            Nodo first = head;
            head = head.next;
            first.next = null;
            length--;
        }
    }

    public void eliminarAlFinal() {
        if (!isEmptyList()) {
            if (head.next == null) {
                head = null;
                length--;
            } else {
                Nodo puntero = head;
                while (puntero.next.next != null){
                    puntero = puntero.next;
                }
                puntero.next = null;
                length--;
            }
        }

    }

    public void eliminarNodo(int posicion) {
        if (head != null) {
            Nodo puntero;
            if (posicion == 0) {
                puntero = head;
                head = head.next;
                puntero.next = null;
                length--;
            } else if (posicion < length) {
                puntero = head;
                int contador = 0;
                while (contador < (posicion - 1)){
                    puntero = puntero.next;
                    contador++;
                }

                Nodo temp = puntero.next;
                puntero.next = temp.next;
                temp.next = null;
                length--;
            }
        }

    }
}
