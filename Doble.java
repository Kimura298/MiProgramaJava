package Examen_ManuelGarrido;
//Manuel Garrido Correas 1ro J DAw

public class Doble extends Habitacion{

    public Doble(boolean vistas, boolean minibar, boolean ocupada, double precioNoche, int numHabitacion) {
        super(vistas, minibar, ocupada, precioNoche, numHabitacion);
        this.vistas = vistas;
        this.minibar = minibar;
        this.ocupada = false;
        this.precioNoche = precioNoche;
        this.numHabitacion = numHabitacion;
        if (vistas){
            this.precioNoche = precioNoche + 5.0;
        }
    }

    @Override
    public boolean reservar(int noches) {
        if (!ocupada){
            return ocupada = true;
        }
        return false;
    }

    @Override
    public boolean cancelar() {
        if (ocupada){
            return ocupada = false;
        }
        return false;
    }

    @Override
    public String toString() {
        return " --Doble{" +
                "vistas=" + vistas +
                ", minibar=" + minibar +
                ", ocupada=" + ocupada +
                ", precioNoche=" + precioNoche +
                ", numHabitacion=" + numHabitacion +
                '}';
    }
}
