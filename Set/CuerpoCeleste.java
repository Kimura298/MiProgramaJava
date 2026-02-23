package Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {

    enum TipoCuerpoCeleste {ESTRELLA, PLANETA, PLANETA_ENANO,
    LUNA, COMETA, ASTEROIDE}
    private String nombre;
    private double periodoOrbital;

    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipocuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipocuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipocuerpo = tipocuerpo;
        this.satelites = new HashSet<>();
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCuerpoCeleste getTipocuerpo() {
        return tipocuerpo;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return new HashSet<>(satelites);
    }

    public boolean addSatelite (CuerpoCeleste satelite){
        return this.satelites.add(satelite);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) && tipocuerpo == that.tipocuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipocuerpo);
    }

    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", tipocuerpo=" + tipocuerpo +
                ", periodoOrbital=" + periodoOrbital +
                '}';
    }
}
