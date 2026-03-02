import java.lang.Comparable;
import java.util.Arrays;

public class act4 {
    static void main() {
        // Rectangulo r = new Rectangulo();
        // Imprimir área y perímetro

        // 10 rectangulos usando array para luego ordenarlos
        Rectangulo[] array = new Rectangulo[10];
        array[0] = new Rectangulo(2, 3);   // área 6
        array[1] = new Rectangulo(1, 5);   // área 5
        array[2] = new Rectangulo(4, 2);   // área 8
        array[3] = new Rectangulo(3, 3);   // área 9
        array[4] = new Rectangulo(5, 1);   // área 5
        array[5] = new Rectangulo(2, 4);   // área 8
        array[6] = new Rectangulo(3, 2);   // área 6
        array[7] = new Rectangulo(4, 3);   // área 12
        array[8] = new Rectangulo(1, 1);   // área 1
        array[9] = new Rectangulo(2, 2);   // área 4

        Arrays.sort(array);

        // Imprimir después de ordenar
        System.out.println("\nDespués de ordenar:");
        for (Rectangulo r : array) {
            System.out.println(r);
        }
        //System.out.println("Área: " + r.getArea());
        //System.out.println("Perímetro: " + r.getPerimeter());

        // Redimensionar por factor 2
        // r.redimensionar(2);

        // Volver a imprimir
        //System.out.println("Área redimensionada: " + r.getArea());
        //System.out.println("Perímetro redimensionado: " + r.getPerimeter());
    }
}

abstract class Forma {
    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;

    }

    public int getNumLados() {
        return numLados;
    }

    abstract double getArea();

    abstract double getPerimeter();

}

 class Rectangulo extends Forma implements Comparable<Rectangulo> {


    private double ancho;
    private double alto;

     public Rectangulo(double ancho, double alto) {
         super(4);
         this.ancho = ancho;
         this.alto = alto;
     }


     @Override
     double getArea() {
         return ancho * alto;
     }

     @Override
     double getPerimeter() {return 2 * (ancho + alto);}


     //@Override
     //public void redimensionar(int x) {
       //  ancho = ancho * x;
       //  alto = alto * x;
     //}
     @Override
     public String toString() {
         return "Rectángulo [ancho=" + ancho + ", alto=" + alto + ", área=" + getArea() + "]";
     }

     @Override
     public int compareTo(Rectangulo otro) {
         // Comparamos por área
         return Double.compare(this.getArea(), otro.getArea());
         //  if (this.getArea() > otro.getArea()) return 1;
         //         else if (this.getArea() < otro.getArea()) return -1;
         //         else return 0;
     }


 }

 class Triangulo extends Forma {
     private double ancho;
     private double alto;

     public Triangulo(int numLados) {
         super(3);
         this.ancho = ancho;
         this.alto = alto;
     }

     @Override
     double getArea() {return (ancho * alto) / 2;}

     @Override
     double getPerimeter() {return ancho
             + 2 * Math.sqrt(Math.pow(ancho / 2, 2)
             + Math.pow(alto, 2));}
 }

