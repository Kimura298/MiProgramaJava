package Examen_ManuelGarrido;
//Manuel Garrido Correas 1ro J DAw

public abstract class Habitacion implements Reservable {

    protected boolean vistas;
    protected boolean minibar;
    protected boolean ocupada;
    protected double precioNoche;
    protected int numHabitacion;


    public Habitacion(boolean vistas, boolean minibar, boolean ocupada, double precioNoche, int numHabitacion) {
            this.vistas = vistas;
            this.minibar = minibar;
            this.ocupada = false;
            this.precioNoche = precioNoche;
            this.numHabitacion = numHabitacion;
        }


    public double calcularPrecio(int noches){
            //dependiendo del numero de noches y q valga la hbaitacion tnedr´a un preciop determinado
            return noches * precioNoche;
    }



    @Override
    public String toString() {
        return " Habitacion{" +
                "vistas=" + vistas +
                ", minibar=" + minibar +
                ", ocupada=" + ocupada +
                ", precioNoche=" + precioNoche +
                ", numHabitacion=" + numHabitacion +
                '}';
    }
}

