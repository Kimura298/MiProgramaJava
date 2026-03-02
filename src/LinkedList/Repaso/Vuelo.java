import java.util.LinkedList;
import java.util.Scanner;

class Vuelo {
    private int numero;
    private String origen;
    private String destino;
    private int dia;
    private String clase;

    public Vuelo(int numero, String origen, String destino, int dia, String clase) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.clase = clase;
    }

    public int getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Vuelo " +
                "numero = " + numero +
                ", origen = '" + origen + '\'' +
                ", destino = '" + destino + '\'' +
                ", dia = " + dia +
                ", clase = '" + clase + '\'';
    }
}

class GestorVuelos {
    private LinkedList<Vuelo> vuelos;

    public GestorVuelos() {
        vuelos = new LinkedList<>();
    }

    // Añadir vuelo
    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        System.out.println("Vuelo añadido: " + vuelo);
    }

    // Buscar vuelo por número
    public Vuelo findVuelo(int numero) {
        for (Vuelo v : vuelos) {
            if (v.getNumero() == numero) {
                return v;
            }
        }
        return null;
    }

    public Vuelo findVueloPorOrigen(String origen) {
        for (Vuelo v : vuelos) {
            if (v.getOrigen().equalsIgnoreCase(origen)) {
                return v;
            }
        }
        return null;
    }

    // Eliminar vuelo por número
    public void removeVuelo(int numero) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getNumero() == numero) {
                System.out.println("Vuelo eliminado: " + vuelos.get(i));
                vuelos.remove(i);
                return;
            }
        }
        System.out.println("Vuelo no encontrado.");
    }

    // Mostrar todos los vuelos
    public void mostrarVuelos() {
        if (vuelos.isEmpty()) {
            System.out.println("No hay vuelos programados.");
        } else {
            System.out.println("Lista de vuelos:");
            for (Vuelo v : vuelos) {
                System.out.println(v);
            }
        }
    }
}

    public void menu(GestorVuelos gestor) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println();
            System.out.println("""
                    ╔═════════════════════════════════╗
                    ║VUELOS DEL AEROPUERTO DE VALENCIA║
                    ║ ==============================  ║
                    ║ 0 - Salir                       ║
                    ║ 1 - Imprimir todos los vuelos   ║
                    ║ 2 - Buscar un vuelo por número  ║
                    ║ 3 - Buscar vuelo por clave      ║
                    ║ 4 - Añadir vuelo nuevo          ║
                    ║ 5 - Borrar vuelo por número     ║
                    ╚═════════════════════════════════╝
                    """);

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    quit = true;
                    break;

                case 1:
                    gestor.mostrarVuelos();
                    break;

                case 2:
                    System.out.print("Introduce número del vuelo que deseas buscar: ");
                    int buscar = scanner.nextInt();
                    Vuelo encontrado = gestor.findVuelo(buscar);
                    if (encontrado != null) {
                        System.out.println("Vuelo encontrado: " + encontrado);
                    } else {
                        System.out.println("El vuelo no existe.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce origen del vuelo que deseas buscar: ");
                    String origenBuscar = scanner.nextLine();
                    Vuelo encontradoOrigen = gestor.findVueloPorOrigen(origenBuscar);

                    if (encontradoOrigen != null) {
                        System.out.println("Vuelo encontrado: " + encontradoOrigen);
                    } else {
                        System.out.println("No hay vuelos con ese origen.");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa numero: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingresa origen: ");
                    String origen = scanner.nextLine();

                    System.out.print("Ingresa destino: ");
                    String destino = scanner.nextLine();

                    System.out.print("Ingresa dia: ");
                    int dia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingresa clase: ");
                    String clase = scanner.nextLine();

                    gestor.addVuelo(new Vuelo(numero, origen, destino, dia, clase));
                    break;

                case 5:
                    System.out.print("Introduce número de vuelo a eliminar: ");
                    int eliminar = scanner.nextInt();
                    gestor.removeVuelo(eliminar);
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public void main(String[] args) {
        GestorVuelos gestor = new GestorVuelos();

        // vuelo inicial para probar
        gestor.addVuelo(new Vuelo(202301, "Valencia", "Menorca", 1508, "turista"));
        gestor.addVuelo(new Vuelo(202302, "Valencia", "Tenerife", 2008, "turista"));
        gestor.addVuelo(new Vuelo(202303, "París", "Valencia", 1508, "primera"));
        gestor.addVuelo(new Vuelo(202304, "Atenas", "Valencia", 2008, "primera"));



        menu(gestor);
    }
