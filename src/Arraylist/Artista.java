package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Artista {

    private String nombre;
    private String nacionalidad;

    public Artista(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }


}

class Obra {
    private String nombreObra;
    private String tipo;
    private double precio;
    private int anyoRe;
    private Artista autor;

    public Obra(String nombreObra, String tipo, double precio, int anyoRe, Artista autor) {
        this.nombreObra = nombreObra;
        this.tipo = tipo;
        this.precio = precio;
        this.anyoRe = anyoRe;
        this.autor = autor;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAnyoRe() {
        return anyoRe;
    }

    public Artista getAutor() {
        return autor;
    }
}

class Main {
    static ArrayList<Artista> artistas = new ArrayList<>();
    static ArrayList<Obra> obras = new ArrayList<>();
    public static void main(String[] args) {

        Artista leonardo = new Artista("Leonardo Da Vinci", "italiano");
        artistas.add(leonardo);
        Obra LaGioconda = new Obra("La Gioconda", "óleo sobre madera", 450000000, 1500, leonardo);
        obras.add(LaGioconda);

        // Salvator Mundi, óleo sobre madera, 450000000, 1500, Leonardo da Vinci
        //La Gioconda, óleo sobre madera, 870000000, 1503, Leonardo da Vinci
        //El pensador, escultura, 11000000, 1904, Auguste Rodin
        //El sueño, óleo sobre lienzo, 155000000, 1932, Pablo Picasso
        //El Guernica, óleo sobre lienzo, 2000000000, 1937, Pablo Picasso

        //Añadir obra
        //2. Añadir artista
        //3. Buscar obra por nombre
        //4. Buscar obras por artista
        //5. Eliminar obra
        //6. Encontrar obra más barata
        //7. Encontrar obra más moderna
        //8. Salir

        menu();
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;



        System.out.println(
                "    //1. Añadir obra\n" +
                "    //2. Añadir artista\n" +
                "    //3. Buscar obra por nombre\n" +
                "    //4. Buscar obras por artista\n" +
                "    //5. Eliminar obra\n" +
                "    //6. Encontrar obra más barata\n" +
                "    //7. Encontrar obra más moderna\n" +
                "    //8. Salir\n" +
                "    ");

        int opcion = sc.nextInt();
        while(!salir){
        switch (opcion) {
            case 1:
                System.out.println("Añade una obra");
                System.out.print("Nombre de la Arraylist.Obra: ");
                String nombreObra = sc.nextLine();
                System.out.print("Tipo de la obra: ");
                String tipo = sc.nextLine();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                System.out.print("Año de realización: ");
                int anyoRe = sc.nextInt();
                sc.nextLine(); // limpiar buffer
                System.out.print("Nombre del artista: ");
                String nombreArtista = sc.nextLine();

                Artista artistaEncontrado = null;

                for (Artista a : artistas) {
                    if (a.getNombre().equalsIgnoreCase(nombreArtista)) {
                        artistaEncontrado = a;
                        break;
                    }
                }

                if (artistaEncontrado == null) {
                    System.out.println("El artista no existe. Créalo primero.");
                } else {
                    Obra nuevaObra = new Obra(nombreObra, tipo, precio, anyoRe, artistaEncontrado);
                    obras.add(nuevaObra);
                    System.out.println("Arraylist.Obra añadida correctamente.");
                }
                break;

            case 2:
                System.out.println("Añadir artista");
                System.out.print("Nombre del Arraylist.Artista: ");
                String nomArtista = sc.nextLine();
                System.out.print("Nacionalidad del Arraylist.Artista: ");
                String nacionalidad = sc.nextLine();

                artistaEncontrado = null;

                for (Artista a : artistas) {
                    if (a.getNombre().equalsIgnoreCase(nomArtista)) {
                        System.out.println("El artista YA existe.");
                        artistaEncontrado = a;
                        break;
                    }
                }

                if (artistaEncontrado == null) {
                    Artista nuevoArtista = new Artista(nomArtista, nacionalidad);
                    artistas.add(nuevoArtista);
                    System.out.println("Arraylist.Artista añadida correctamente.");
                }
                break;

                //3. Buscar obra por nombre
            case 3:
                sc.nextLine();

                System.out.println("Introduce el nombre de la obra a buscar: ");
                String nomObra = sc.nextLine();

                boolean encontrada = false;

                for (Obra s : obras) {
                    if (s.getNombreObra().equalsIgnoreCase(nomObra)) {
                        System.out.println("Arraylist.Obra encontrada:");
                        System.out.println("Nombre: " + s.getNombreObra());
                        System.out.println("Tipo: " + s.getTipo());
                        System.out.println("Precio: " + s.getPrecio());
                        System.out.println("Año: " + s.getAnyoRe());
                        encontrada = true;
                        break;
                    }
                }

                if (!encontrada) {
                    System.out.println("No se encontró ninguna obra con ese nombre.");
                }

                break;

            case 4:
                sc.nextLine();

                System.out.println("Buscar obras por artista");

                System.out.print("Nombre del Arraylist.Artista: ");
                String Artistanom = sc.nextLine();

                artistaEncontrado = null;

                for (Artista a : artistas) {
                    if (a.getNombre().equalsIgnoreCase(Artistanom)) {
                        artistaEncontrado = a;
                        break;
                    }
                }

                if (artistaEncontrado == null) {
                    System.out.println("El artista no existe.");
                } else {

                    boolean hayObras = false;

                    for (Obra o : obras) {
                        if (o.getAutor() == artistaEncontrado) {
                            System.out.println("Arraylist.Obra: " + o.getNombreObra());
                            hayObras = true;
                        }
                    }

                    if (!hayObras) {
                        System.out.println("Este artista no tiene obras registradas.");
                    }
                }

                break;

            case 5:
                sc.nextLine();

                System.out.print("Introduce el nombre de la obra a eliminar: ");
                String eliminarNom = sc.nextLine();

                boolean eliminada = false;

                for (int i = 0; i < obras.size(); i++) {
                    if (obras.get(i).getNombreObra().equalsIgnoreCase(eliminarNom)) {
                        obras.remove(i);
                        eliminada = true;
                        System.out.println("Arraylist.Obra eliminada correctamente.");
                        break;
                    }
                }

                if (!eliminada) {
                    System.out.println("No se encontró la obra.");
                }

                break;


            case 6:

                if (obras.isEmpty()) {
                    System.out.println("No hay obras registradas.");
                    break;
                }

                Obra masBarata = obras.get(0);

                for (Obra o : obras) {
                    if (o.getPrecio() < masBarata.getPrecio()) {
                        masBarata = o;
                    }
                }

                System.out.println("Arraylist.Obra más barata:");
                System.out.println(masBarata.getNombreObra() + " - " + masBarata.getPrecio());

                break;

            case 7:

                if (obras.isEmpty()) {
                    System.out.println("No hay obras registradas.");
                    break;
                }

                Obra masModerna = obras.get(0);

                for (Obra o : obras) {
                    if (o.getAnyoRe() > masModerna.getAnyoRe()) {
                        masModerna = o;
                    }
                }

                System.out.println("Arraylist.Obra más moderna:");
                System.out.println(masModerna.getNombreObra() + " - Año: " + masModerna.getAnyoRe());

                break;

            case 8:
                salir = true;
            }
        }
    }
}

