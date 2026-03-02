package Actividad7;

import java.lang.Comparable;
import java.util.Arrays;

public class act7 {
    static void main(String[] args) {
        Estudiante[] array = new Estudiante[5];

        array[0] = new Estudiante("Jose Carlos", 13, 1.63);   // área 6
        array[1] = new Estudiante("Jose Juan", 15, 1.78);   // área 5
        array[2] = new Estudiante("Jose Maria", 12, 1.59);   // área 8
        array[3] = new Estudiante("Jose Luis", 13, 1.70);   // área 9
        array[4] = new Estudiante("Jose Miguel", 11, 160);   // área 5

        Arrays.sort(array);

        // Imprimir después de ordenar
        System.out.println("\nDespués de ordenar:");
        for (Estudiante r : array) {
            System.out.println(r);
        }

    }
    // Crea una clase Estudiante con atributos nombre, edad y altura. Queremos ordenar por edad y por
    //altura a los estudiantes. Utilizando Comparable y el método compareTo debemos comparar los
    //estudiantes y ordenarlos por altura primero (de mayor a menor) y si la altura coincide por edad.
    //Por pantalla debe mostrarse la lista de estudiantes sin ordenar, y ordenado. Ejemplo:
    //Estudiantes sin ordenar:
    //1. Patri - Altura: 170 - Edad: 12
    //2. Manuel - Altura: 173 - Edad: 43
    //3. Javier - Altura: 189 - Edad: 72
    //4. Alicia - Altura: 168 - Edad: 52
    //5. Alberto - Altura: 189 - Edad: 35

    public static class Estudiante implements Comparable<Estudiante> {
        private String nombre;
        private int edad;
        private double altura;

        public Estudiante(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Estudiante{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", altura=" + altura +
                    '}';
        }

        @Override
        public int compareTo(Estudiante otro) {
            if (this.getEdad() > otro.getEdad()) return 1;
            else if (this.getEdad() < otro.getEdad()) return -1;
            else return 0;

        }
    }
}
