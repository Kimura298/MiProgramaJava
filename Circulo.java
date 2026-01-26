package Herencias;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        if (radio < 0){
            this.radio = 0;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }


}
