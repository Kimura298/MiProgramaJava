package ACT5_INTERFACES_POLIMORFISMO;

public class Juguete extends Bienes implements Imponible{

    private static final double TASA = 0.06;
    public Juguete(String descripcion, double precio) {
        super(descripcion, precio);
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
        return "Juguete: " +
                descripcion + '\'' +
                " | Base: " + precio +
                " | Impuesto (6%): " + calcularImpuesto() +
                " | Total: " + precioFinal();
    }
}
