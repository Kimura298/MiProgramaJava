package Tarea3;

public class Impresora {

    private int nivelToner;
    private int numPagImp;
    private boolean ImpDobleCara;

    public Impresora(int nivelToner, boolean ImpDobleCara) {
        if (nivelToner < 0 || nivelToner > 100) {
            this.nivelToner = -1;
        } else {
            this.nivelToner = nivelToner;
        }
        this.ImpDobleCara = ImpDobleCara;
        this.numPagImp = 0;
    }


    public int imprimirPaginas(int paginas) {
        // imprime paginas, divide la cantidad de paginas si es de doble cara
        if (ImpDobleCara) {
            paginas = (paginas / 2) + (paginas % 2); //redondeo
        }
        numPagImp += paginas;
        return paginas;
    }

    public int getNumPagImp() {
        return numPagImp;
    }

    public int getNivelToner() {
        return nivelToner;
    }
}
