package ACT5_INTERFACES_POLIMORFISMO;

public class Bienes {
    protected String descripcion;
    protected double precio;

    public Bienes(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }


    @Override
    public String toString() {
        return descripcion + " | Precio base: " + precio;
    }
}
