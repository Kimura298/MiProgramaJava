package arraylist_ej;
import java.util.Scanner;

public class mainContacto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos el teléfono móvil con un número de ejemplo
        TelefonoMovil miTelefono = new TelefonoMovil("123456789");

        boolean salir = false;

        printMenu(); // mostramos el menú inicial

        while (!salir) {
            System.out.print("\nElige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 0:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                case 1: // imprimir contactos
                    miTelefono.printContacts();
                    break;

                case 2: // agregar nuevo contacto
                    System.out.print("Nombre del contacto: ");
                    String nombreNuevo = sc.nextLine();
                    System.out.print("Número de teléfono: ");
                    String numeroNuevo = sc.nextLine();

                    Contacto cNuevo = new Contacto(nombreNuevo, numeroNuevo);
                    if (miTelefono.addNewContact(cNuevo)) {
                        System.out.println("Contacto agregado con éxito.");
                    } else {
                        System.out.println("Error: el contacto ya existe.");
                    }
                    break;

                case 3: // actualizar contacto existente
                    System.out.print("Nombre del contacto a actualizar: ");
                    String nombreAntiguo = sc.nextLine();
                    Contacto contactoAntiguo = miTelefono.findContact(nombreAntiguo);

                    if (contactoAntiguo != null) {
                        System.out.print("Nuevo nombre: ");
                        String nombreNuevo2 = sc.nextLine();
                        System.out.print("Nuevo número de teléfono: ");
                        String numeroNuevo2 = sc.nextLine();

                        Contacto contactoNuevo = new Contacto(nombreNuevo2, numeroNuevo2);

                        if (miTelefono.updateContact(contactoAntiguo, contactoNuevo)) {
                            System.out.println("Contacto actualizado con éxito.");
                        } else {
                            System.out.println("Error: no se pudo actualizar el contacto.");
                        }
                    } else {
                        System.out.println("El contacto no existe.");
                    }
                    break;

                case 4: // eliminar contacto
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    Contacto contactoEliminar = miTelefono.findContact(nombreEliminar);

                    if (contactoEliminar != null) {
                        miTelefono.removeContact(contactoEliminar);
                    } else {
                        System.out.println("El contacto no existe.");
                    }
                    break;

                case 5: // buscar contacto
                    System.out.print("Nombre del contacto a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    Contacto contactoBuscar = miTelefono.findContact(nombreBuscar);

                    if (contactoBuscar != null) {
                        System.out.println("Contacto encontrado:");
                        System.out.println("Nombre: " + contactoBuscar.getName());
                        System.out.println("Número: " + contactoBuscar.getPhonenumber());
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;

                case 6: // volver a imprimir opciones
                    printMenu();
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    public static void printMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Agregar nuevo contacto");
        System.out.println("3 - Actualizar contacto existente");
        System.out.println("4 - Eliminar contacto");
        System.out.println("5 - Buscar contacto por nombre");
        System.out.println("6 - Volver a imprimir este menú");
    }
}
