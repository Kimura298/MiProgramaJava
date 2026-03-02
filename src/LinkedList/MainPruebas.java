package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainPruebas {
    // La principal diferencia del ArrayList y LinkedList, se conciben diferente en estructura
    // El LL tiene punteros.
    // el arraylist lo concibes como array, con su indice y celda, dinamico sin tamaño fijo
    // Es mejor para recorrer

    public static void printList(LinkedList<String> lugares) {

        Iterator<String> it = lugares.iterator();
        while (it.hasNext()) { // esto es como hacer un for literalmente, si hay un nodo despues, el bucle continua
            System.out.println("Nodo: " + it.next()); // esto apunta y te da el siguiente nodo
        }
        System.out.println("-----");
    }
    private static boolean addInOrder(LinkedList<String> lugares, String newItem) {
        ListIterator<String> it = lugares.listIterator();
        while (it.hasNext()) {
            int comparacion = it.next().compareTo(newItem);
            if (comparacion == 0) {
                //no queremos añadir porque no queremos tener duplicados
                System.out.println("el lugar " + newItem + " ya está incluido");
                return false;
            } else if (comparacion > 0) { //newItem es más pequeño
                it.previous();
                it.add(newItem);
                return true;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        LinkedList<String> lugares = new LinkedList<>();

        lugares.add("Roma");
        lugares.add("París");
        lugares.add("Amsterdam");
        lugares.add("Toronto");
        lugares.add("Miami");

        addInOrder(lugares, "España");
        printList(lugares);
    }
}
