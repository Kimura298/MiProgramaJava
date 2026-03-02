package Set;

public class Planeta extends CuerpoCeleste{


    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste satelite) {
        if (satelite.getTipocuerpo() == CuerpoCeleste.TipoCuerpoCeleste.LUNA) {
            return super.addSatelite(satelite);
        }
        return false;
    }
}
