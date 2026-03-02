package InterfazClase.DnD;


public class Clerigo extends Clase implements Healer {

    public Clerigo(String nombre, String raza, int edad) {
        super(nombre, raza, edad, "Clerigo");
        this.ataqUnico = "\u001B[35mMartillo Sagrado\u001B[0m";
        this.rasgoUnico = "\u001B[34mAura Divina\u001B[0m";
    }

    @Override
    public void attack() {
        System.out.println("Ataque con " + ataqUnico);
    }

    @Override
    public void use() {
        System.out.println("\nTu personaje usa su " + rasgoUnico);
    }

    //Interfaz
    @Override
    public void curar() {
        System.out.println("\u001B[32mClérigo cura a sus aliados con Palabra de Curación\u001B[0m");
    }
}
