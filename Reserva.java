package Examen_ManuelGarrido;
//Manuel Garrido Correas 1ro J DAw

import java.util.ArrayList;

public class Reserva {
    private double precioTotal;
    private int noches;

    double calcularPrecio(int noches){
        return this.precioTotal+=noches;
    }

    public Reserva(Habitacion hab, int noches){
        this.noches = noches;
    }
}
