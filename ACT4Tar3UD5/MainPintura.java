package Polimorfismo.ACT4Tar3UD5;

public class MainPintura {
    static void main() {


        Pintura pintura = new Pintura(250);

        Forma rectangulo = new Rectangulo(35, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        System.out.println(rectangulo +
                " necesita " + pintura.calcularPinturaReq(rectangulo) + " litros de pintura");

        System.out.println(esfera +
                " necesita " + pintura.calcularPinturaReq(esfera) + " litros de pintura");

        System.out.println(cilindro +
                " necesita " + pintura.calcularPinturaReq(cilindro) + " litros de pintura");
        /**
         * El polimorfismo ocurre al usar referencias de tipo Forma que apuntan a distintos objetos
         * (Rectangulo, Esfera, Cilindro), y llamar al método area().
         * Cada objeto ejecuta su propia versión del método a la hora de ejecutar el programa.
         */
    }
}
