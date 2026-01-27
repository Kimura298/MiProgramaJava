package Tarea3;

import java.util.Scanner;

public class MainEncapsulacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Impresora imp = new Impresora(50, true);

        System.out.println("Nivel de toner: " + imp.getNivelToner());

        System.out.print("Cuantas paginas quieres?: ");
        int paginasDeseadas = 0;
        paginasDeseadas = sc.nextInt();

        System.out.print("Añade toner: ");
        int cantidadTo = 0;
        cantidadTo = sc.nextInt();
        imp.setNivelToner(cantidadTo);

        /**
         * Imprime las paginas solicitadas por Scanner
         * @param paginasDeseadas paginas que deseas imprimir;
         * @param hojas devuelve el numero de hojas recibidas, el numero se divide por
         * 2 si se trata de una impresora-doble-cara
         * @param getNumPagImp() obtiene el calculo final: paginas deseadas > hojas (si: doble cara, hojas / 2)
         * imprime Total de paginas empresas
         */

        int hojas = imp.imprimirPaginas(paginasDeseadas);
        System.out.println("Paginas solicitadas: " + paginasDeseadas);
        System.out.println("Toner añadido: " + imp.getNivelToner());
        System.out.println("Hojas usadas: " + hojas);
        System.out.println("Total de paginas impresas: " + imp.getNumPagImp());
    }
}
