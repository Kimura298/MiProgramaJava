package Polimorfismo.ACT4Tar3UD5;

public class Cilindro extends Forma {

    private double radio;
    private int altura;

    public Cilindro(double radio, int altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double Area() {
        return 2 * Math.PI * radio * (radio + altura);
    }


}
