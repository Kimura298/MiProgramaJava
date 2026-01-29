package Polimorfismo.ACT4Tar3UD5;

public class Rectangulo extends Forma{
    private int longitud;
    private int ancho;

    public Rectangulo(int longitud, int ancho) {
        super("Rectángulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double Area() {
        return longitud * ancho;
    }

}
