package Examen_ManuelGarrido;
//Manuel Garrido Correas 1ro J DAw


public class Simple extends Habitacion{

    public Simple(boolean vistas, boolean minibar, boolean ocupada, double precioNoche, int numHabitacion) {
        super(vistas, minibar, ocupada, precioNoche, numHabitacion);
        this.vistas = vistas;
        this.minibar = minibar;
        this.ocupada = false;
        this.precioNoche = precioNoche;
        this.numHabitacion = numHabitacion;
    }

    @Override
    public boolean reservar(int noches) {
        return false;
    }

    @Override
    public boolean cancelar() {
        return false;
    }

    @Override
    public String toString() {
        return " --Simple{" +
                "vistas=" + vistas +
                ", minibar=" + minibar +
                ", ocupada=" + ocupada +
                ", precioNoche=" + precioNoche +
                ", numHabitacion=" + numHabitacion +
                '}';
    }
}
