package Polimorfismo.ACT4Tar3UD5;

public class Forma {

    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double Area (){
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
