package ACT5_INTERFACES_POLIMORFISMO;

public class MainImpuestos {
    static void main() {
        Comida com = new Comida("PIZZA PEPERONI", 5.9);
        Juguete jug = new Juguete("Muelle", 1);
        Libro lib = new Libro("Player's Handbook", 40.00);


        System.out.println(com);
        System.out.println(jug);
        System.out.println(lib);

        Imponible[] imponibles = new Imponible[2];
        imponibles[0] = com;
        imponibles[1] = jug;

        System.out.println();
        System.out.println(imponibles[0]);
        System.out.println(imponibles[1]);

        com.toString();


    }
}
