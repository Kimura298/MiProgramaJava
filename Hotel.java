package Examen_ManuelGarrido;
//Manuel Garrido Correas 1ro J DAw
import java.util.*;

public class Hotel {
    static ArrayList<Habitacion> habitaciones = new ArrayList<>();
    static LinkedList<Reserva> reservas = new LinkedList<>();
    static Set<Cliente> clientes = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    public static Cliente buscarCli(String dni) {
        Cliente cliente = new Cliente(dni);
        for (Cliente c : clientes) {
            if (clientes.contains(cliente)) {
                System.out.println("Cliente encontrado " + dni);
                return cliente;
            }
            System.out.println("No existe");
        }
        return null;
    }

    public static boolean registrarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
                clientes.add(cliente);
                System.out.println("Cliente registrado :D" + cliente);
                return true;
        } else {
                System.out.println("El cliente ya existe! >_<");
                return false;
        }
    }

    public static Habitacion buscarHab(int numHab) {
        for (Habitacion hab : habitaciones) {
            if (habitaciones.contains(habitaciones.get(numHab))) {
                return habitaciones.get(numHab);
            }
        }
        return null;
    }

    public static boolean agregarHabitacion(Habitacion hab) {
            if (!habitaciones.contains(hab)){
                System.out.println("Añadida una habitacion" + hab);
                habitaciones.add(hab);
                return true;
            } else {
                System.out.println("Esta habitacion ya existe");
                return false;
            }
    }

    public static boolean reservarHab(String dni, int numHab, int numNoc) {
        Cliente cl = new Cliente(dni);
        if (clientes.contains(cl)) {
            System.out.println("Reserva añadida!");
            //añadir reserva
            Reserva reserva = new Reserva(habitaciones.get(numHab), numNoc);
            reservas.add(reserva);
       } else {
            System.out.println("No encontramos al cliente o la habitacion que deseas");
            return false;
        }
        return true;
    }

    public static boolean cancelarRes(int numHab) {
        reservas.remove(numHab);
        if (reservas.get(numHab) == null) {
            System.out.println("Reservada eliminada, habitacion libre");
            return true;
        }
        return false;
    }


    static class Main {
        static void menu() {
            boolean salir = false;

            System.out.println();
            System.out.println("""
                    1. Reservar Habitacion
                    2. Cancelar Reserva
                    3. Listar reservas
                    4. Listar las habitaciones disponibles
                    5. Salir
                    """);

            int res = sc.nextInt();
            while (!salir) {
                switch (res) {
                    case 1:
                        System.out.println("Introduce dni, num de la habitacion y num de noches");

                        System.out.println("Dni");
                        String dni1 = sc.next();
                        System.out.println("NumHab");
                        int numhab1 = sc.nextInt();
                        System.out.println("NumNoc");
                        int numNoc1 = sc.nextInt();
                        reservarHab(dni1, numhab1, numNoc1);
                        break;

                    case 2:
                        System.out.println("Cancelar reserva");

                        System.out.println("Que reserva deseas cancelar?");
                        int reservaCancelada = sc.nextInt();

                        cancelarRes(reservaCancelada);
                        break;

                    case 3:
                        sc.nextLine(); //limpiar buffer creo
                        // necesito iteradores
                        System.out.println("Listando reservas disponibles");
                        for (Reserva reserva : reservas) {
                            System.out.println("Reserva: " + reserva);
                        }
                        System.out.println("===========");

                        break;

                    case 4:
                        sc.nextLine(); //limpiar buffer creo
                        System.out.println("Listando habitaciones disponibles: ");
                        for (Habitacion hab : habitaciones) {
                            System.out.println("Reserva: " + hab);
                        }
                        // while (at.hasNext()) {
                        // System.out.println("Reserva: " + at.next());
                        // }
                        break;

                    case 5:
                        salir = true;
                        break;
                }
            }
        }
    }
    public static void main() {

        Cliente c1 = new Cliente("1");
        Cliente c2 = new Cliente("2");

        registrarCliente(c1);
        registrarCliente(c2);

        Simple simple1 = new Simple(true, false, false, 10.30, 1);
        Simple simple2 = new Simple(true, true, false, 15.30, 2);
        Doble doble1 = new Doble(true, true, false, 17.30, 3);
        Doble doble2 = new Doble(false, false, false, 22, 4);

        agregarHabitacion(simple1);
        agregarHabitacion(simple2);
        agregarHabitacion(doble1);
        agregarHabitacion(doble2);

        Main.menu();
    }
}