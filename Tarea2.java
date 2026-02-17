package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Tarea2 {

    /**
     * Clase Cancion representa una canción con título y duración.
     * Usamos objetos para guardar información de cada canción.
     */
    class Cancion {
        private String titulo;
        private double duracion;

        public Cancion(String titulo, double duracion) {
            this.titulo = titulo;
            this.duracion = duracion;
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return titulo + ": " + duracion;
        }
    }

    /**
     * Clase Album representa un álbum con nombre, artista y lista de canciones.
     * - ArrayList se usa para canciones porque permite acceso rápido por índice.
     * - Permite añadir canciones y buscar por título.
     */
    class Album {
        private String nombre;
        private String artista;
        private ArrayList<Cancion> canciones;

        public Album(String nombre, String artista) {
            this.nombre = nombre;
            this.artista = artista;
            this.canciones = new ArrayList<>();
        }

        /**
         * Busca una canción por título en el álbum.
         * Devuelve null si no existe.
         */
        public Cancion findSong(String titulo) {
            for (Cancion c : canciones) {
                if (c.getTitulo().equals(titulo)) {
                    return c;
                }
            }
            return null;
        }

        /**
         * Añade una canción al álbum si no existe ya.
         */
        public boolean addSong(String tituloCan, double duraCan) {
            if (findSong(tituloCan) == null) {
                canciones.add(new Cancion(tituloCan, duraCan));
                return true;
            }
            return false;
        }

        /**
         * Añade una canción a la playlist usando la posición del álbum.
         * - LinkedList se usa para playlist porque permite moverse con iteradores y añadir/quitar fácilmente.
         */
        public boolean addToPlayList(int numPista, LinkedList<Cancion> listaRepr) {
            if (numPista >= 1 && numPista <= canciones.size()) {
                Cancion newSong = canciones.get(numPista - 1);
                listaRepr.add(newSong);
                return true;
            }
            return false;
        }

        /**
         * Añade una canción a la playlist usando el título.
         */
        public boolean addToPlayList(String titSong, LinkedList<Cancion> listaRepr) {
            Cancion nueva = findSong(titSong);
            if (nueva != null) {
                listaRepr.add(nueva);
                return true;
            }
            return false;
        }
    }

    /**
     * Método play permite "reproducir" la playlist.
     * - LinkedList: nos permite usar ListIterator para movernos adelante/atrás.
     * - ListIterator: objeto que recorre la lista, permite next() y previous().
     * - goingForward: controla la dirección para no saltarse canciones.
     */
    public static void play(LinkedList<Cancion> playlist) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Cancion> iterator = playlist.listIterator();
        boolean quit = false;
        boolean goingForward = true;

        if (playlist.isEmpty()) {
            System.out.println("No hay canciones en la playlist");
            return;
        } else {
            System.out.println("Reproduciendo " + iterator.next());
        }
        System.out.println("""
                    0 - Salir
                    1 - Siguiente canción
                    2 - Canción anterior
                    3 - Repetir canción
                    4 - Imprimir la lista de canciones en la playlist
                    5 - Volver a imprimir el menú.
                    6 - Eliminar canción actual
                    de la playlist
                    """);
        while (!quit) {


            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("Saliendo...");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward && iterator.hasNext()) {
                        iterator.next();
                    }
                    goingForward = true;

                    if (iterator.hasNext()) {
                        System.out.println("Reproduciendo " + iterator.next());
                    } else {
                        System.out.println("Fin de la playlist");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward && iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    goingForward = false;

                    if (iterator.hasPrevious()) {
                        System.out.println("Reproduciendo " + iterator.previous());
                    } else {
                        System.out.println("Inicio de la playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (iterator.hasPrevious()) {

                        Cancion actual = iterator.previous();
                        System.out.println("Reproduciendo " + actual);
                        iterator.next();
                    }
                    break;



                case 4: // imprimir prev
                    if (iterator.hasPrevious()){
                    System.out.println("Imprimiendo playlist:");
                    for (Cancion c : playlist) {
                        System.out.println(c);
                    }
                    System.out.println();}
                    break;

                case 5:
                    System.out.println("""
                    0 - Salir
                    1 - Siguiente canción
                    2 - Canción anterior
                    3 - Repetir canción
                    4 - Imprimir la lista de canciones en la playlist
                    5 - Volver a imprimir el menú.
                    6 - Eliminar canción actual
                    de la playlist
                    """);
                    break;

                case 6:
                    System.out.println("Borrando...");
                    if (iterator.hasPrevious()) {

                        Cancion actual = iterator.previous();
                        iterator.remove();
                        System.out.println("Eliminada " + actual);
                        iterator.next();
                    }
                break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    System.out.println("""
                    0 - Salir
                    1 - Siguiente canción
                    2 - Canción anterior
                    3 - Repetir canción
                    4 - Imprimir la lista de canciones en la playlist
                    5 - Volver a imprimir el menú.
                    6 - Eliminar canción actual
                    de la playlist
                    """);
                    break;

            }

        }
    }

    /**
     * Método main: punto de entrada del programa.
     * - Creamos álbumes y añadimos canciones.
     * - Creamos una LinkedList para playlist.
     * - Llamamos a play() para simular reproducción con iterador.
     */
    public static void main(String[] args) {
        Tarea2 tarea = new Tarea2();

        ArrayList<Album> albumes = new ArrayList<>();

        Album album1 = tarea.new Album("Thriller", "Michael Jackson");
        album1.addSong("Billie Jean", 4.54);
        album1.addSong("Beat It", 4.18);
        album1.addSong("Thriller", 5.57);
        album1.addSong("Smooth Criminal", 4.17);

        Album album2 = tarea.new Album("Back in Black", "AC/DC");
        album2.addSong("Hells Bells", 5.12);
        album2.addSong("Shoot to Thrill", 5.17);
        album2.addSong("Back in Black", 4.15);
        album2.addSong("You Shook Me All Night Long", 3.30);

        LinkedList<Cancion> listaRep = new LinkedList<>();
        album1.addToPlayList(1, listaRep);
        album1.addToPlayList(2, listaRep);
        album1.addToPlayList(3, listaRep);
        album2.addToPlayList("Hells Bells", listaRep);
        album2.addToPlayList("Back in Black", listaRep);


        System.out.println("Playlist inicial:");
        for (Cancion c : listaRep) {
            System.out.println(c);
        }

        play(listaRep);
    }
}
