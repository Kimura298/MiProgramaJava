package Examen_ManuelGarrido;
//Manuel Garrido Correas 1ro J DAw

public class Cliente {

    private String dni;
    private String nombre;

    public Cliente(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
