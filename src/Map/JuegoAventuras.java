package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JuegoAventuras {
    private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public JuegoAventuras() {
        Ubicacion ubicacion0 = new Ubicacion(0, "Clase", "Estás sentado en la clase de programación");
        ubicaciones.put(0, ubicacion0);
        Ubicacion ubicacion1 = new Ubicacion(1, "Montaña", "Estás en la cima de una montaña");
        ubicaciones.put(1, ubicacion1);
        Ubicacion ubicacion2 = new Ubicacion(2, "Playa", "Estás bañándote en la playa");
        ubicaciones.put(2, ubicacion2);
        Ubicacion ubicacion3 = new Ubicacion(3, "Edificio", "Estás dentro de un edificio muy alto");
        ubicaciones.put(3, ubicacion3);
        Ubicacion ubicacion4 = new Ubicacion(4, "Puente", "Estás de pie en un puente");
        ubicaciones.put(4, ubicacion4);
        Ubicacion ubicacion5 = new Ubicacion(5, "Bosque", "Estás en un bosque");
        ubicaciones.put(5, ubicacion5);


        ubicacion1.addExit("N", 5);
        ubicacion1.addExit("S", 4);
        ubicacion1.addExit("E", 3);
        ubicacion1.addExit("O", 2);

        ubicacion2.addExit("N", 5);

        ubicacion3.addExit("O", 1);

        ubicacion4.addExit("N", 1);
        ubicacion4.addExit("O", 2);


        ubicacion5.addExit("S", 1);
        ubicacion5.addExit("O", 2);

        ubicacion1.addExit("Q",0);
        ubicacion2.addExit("Q",0);
        ubicacion3.addExit("Q",0);
        ubicacion4.addExit("Q",0);
        ubicacion5.addExit("Q",0);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ubicacionActual = 1;
        String direccion = "";

        while (!direccion.equals("Q")) {
            JuegoAventuras juego = new JuegoAventuras();
            System.out.print("Puedes salir por: ");
            // buscar salidas
            Map<String, Integer> salidas = ubicaciones.get(ubicacionActual).getExits();
            // obtener el nombre de los lugares en ese momento aparte de la
            // inicial de direccion donde se ubican

            //imprime Q N S E O

            for (String exit : salidas.keySet()) {
                int destino = salidas.get(exit);
                System.out.print(exit + " " + ubicaciones.get(destino).getNombre() + " ");
            }
            System.out.println();

            System.out.println();
            //para salir del bucle jeje
            System.out.print("INPUT: ");
            direccion = sc.nextLine().toUpperCase();

            if (direccion.equals("Q")) {
                break;
            }

            //pa despues de meter una direccion que meta a esto
            if (salidas.containsKey(direccion)) {
                // y de aqui saque la direccion
                ubicacionActual = salidas.get(direccion);
                System.out.println("OUTPUT: " + ubicaciones.get(ubicacionActual).getDescripcion());

            } else {
                System.out.println("No puedes ir en esa dirección!!!");
            }
        }

}
class Ubicacion {
    private int id;
    private String nombre;
    private String descripcion;
    private Map<String,Integer> exits;

    public Ubicacion(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        exits = new HashMap<>();
    }


    public void addExit (String direccion, int idUbicacion){
        exits.put(direccion, idUbicacion);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }
}
}