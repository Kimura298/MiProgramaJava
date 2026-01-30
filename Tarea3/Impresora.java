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


    public int addToner(int cantidad) {
        if (this.nivelToner + cantidad < 0 || this.nivelToner + cantidad > 100) {
            this.nivelToner = -1;
        }
        return this.nivelToner + cantidad;
    }

    //   public void addToner (int cantidad){
    //        if (nivelToner < 0 || nivelToner > 100) {
    //            this.nivelToner = -1;
    //        } else {
    //            setNivelToner(cantidad);
    //        }
    //    }


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

    public void setNivelToner(int nivelToner) {
        this.nivelToner = nivelToner;
    }


}







