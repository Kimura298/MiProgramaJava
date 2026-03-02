package ACT5_INTERFACES_POLIMORFISMO;

public class Libro extends Bienes{

    public Libro(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "Libro: " + descripcion +
                " | Precio final: " + precio;
    }


}
