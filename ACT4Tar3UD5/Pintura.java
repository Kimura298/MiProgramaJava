package Polimorfismo.ACT4Tar3UD5;

public class Pintura {


    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPinturaReq(Forma forma) {
        return forma.Area()/ cobertura;
    }
}
