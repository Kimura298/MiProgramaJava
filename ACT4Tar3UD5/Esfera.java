package Polimorfismo.ACT4Tar3UD5;

public class Esfera extends Forma {

    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }



    @Override
    public double Area() {
        return 4 * Math.PI * radio * radio;
    }
}
