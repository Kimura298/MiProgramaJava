package Herencias;

public class Cilindro extends Circulo{

    private double altura;


    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
        if (altura < 0){
            this.altura = 0;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume(){
        return altura * getArea();
    }
    public static void main(String[] args) {
        Cilindro c1 = new Cilindro(3, 5);
        Cilindro c2 = new Cilindro(2, -4); // Altura negativa -> se ajusta a 0

        System.out.println("Cilindro 1:");
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Altura: " + c1.altura);
        System.out.println("Área de la base: " + c1.getArea());
        System.out.println("Volumen: " + c1.getVolume());

        System.out.println("\nCilindro 2:");
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Altura: " + c2.altura);
        System.out.println("Área de la base: " + c2.getArea());
        System.out.println("Volumen: " + c2.getVolume());
    }
}
