public class Pila {
    /*
    Tope nos sirve para indicar en donde tenemos que insertar
    Longitud se emplea para obtener el tamaño de la pila
     */
    private Nodo tope = null;
    private int longitud = 0;

    public class Nodo{
        public int isbn;
        public String autor;
        public String titulo;
        public Nodo next = null;
        //Construtor nodo, cada parameto se separa por coma
        public Nodo(int isbn, String autor, String titulo) {
            this.isbn = isbn;
            this.autor = autor;
            this.titulo = titulo;
        }
    }

    public boolean isEmptyStack(){
        return tope == null;
    }
    public int length(){
        return longitud;
    }

    public void apilar(int isbn, String autor, String titulo){
        Nodo nodoPush = new Nodo(isbn, autor, titulo);
        nodoPush.next = tope;
        tope = nodoPush;
        longitud++; // Cada vez que se agreaga un elemento se incrementa la longitud
    }

    public void desapilar(){
        if(tope!=null){
            Nodo nodoPop = tope;
            tope = tope.next;
            nodoPop = null;
            longitud--;// Cada vez que se elimina un elemento se decrementa la longitud
        }

    }

    public void obtenerTope(){
        if(!isEmptyStack()){
            Nodo nodoCima = tope;
            System.out.println("El libro actual es: [" + nodoCima.isbn + ", " + nodoCima.autor + ", " + nodoCima.titulo + "]");
        }else {
            System.out.println("No hay");
        }
    }

    /*
    Realizar un metodo destructor que elimite todos los elementos de una pila
    * */
    public void destructor(){
        while (!isEmptyStack()){
            desapilar();
        }
    }

    /*
    Realizar un método desapilarN, en el cuál se desapilan un número N de elementos de una pila
    * */
    public void desapilarN(int cantidad){
        if(!isEmptyStack()){
            if(length() >= cantidad){
                for (int contador=0; contador <cantidad; contador++){
                    desapilar();
                }
            }
        }else {
            System.out.println("La pila no tiene el numero de libros para eliminar");
        }
    }

}
