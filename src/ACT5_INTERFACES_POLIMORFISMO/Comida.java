package ACT5_INTERFACES_POLIMORFISMO;

public class Comida extends Bienes implements Imponible{

    private double calorias;
    private static final double TASA = 0.06;

    public Comida(String descripcion, double precio) {
        super(descripcion, precio);
        this.calorias = calorias;
    }



    @Override
    public double calcularImpuesto() {
        return precio * TASA;
    }

    public double precioFinal() {
        return precio + calcularImpuesto();
    }

    @Override
    public String toString() {
        return "Comida: " + descripcion +
                " | Base: " + precio +
                " | Impuesto (6%): " + calcularImpuesto() +
                " | Total: " + precioFinal();
    }
}
