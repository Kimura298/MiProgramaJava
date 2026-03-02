package InterfazClase.DnD;

public class Personaje {
    private String nombre;
    private String raza;
    private int edad;

    public Personaje(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
}