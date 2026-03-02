package InterfazClase.DnD;

public class Paladin extends Clase implements Healer {
    public Paladin(String nombre, String raza, int edad) {
        super(nombre, raza, edad, "Paladin");
        this.ataqUnico = "\u001B[35mCastigo Divino\u001B[0m";
        this.rasgoUnico = "\u001B[34mAura Sagrada\u001B[0m";
    }

    @Override
    public void attack() {
        System.out.println("Ataque con " + ataqUnico);
    }

    @Override
    public void use() {
        System.out.println("\nTu personaje usa su " + rasgoUnico);
    }

    @Override
    public void curar() {
        System.out.println("Usa Lay on Hands");
    }
}
