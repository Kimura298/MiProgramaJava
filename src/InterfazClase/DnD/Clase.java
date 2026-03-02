package InterfazClase.DnD;

public class Clase extends Personaje{
    protected String rasgoUnico;
    protected String ataqUnico;
    protected String nomClase;

    public Clase(String nombre, String raza, int edad, String nomClase) {
        super(nombre, raza, edad);
        this.rasgoUnico = rasgoUnico;
        this.ataqUnico = ataqUnico;
        this.nomClase = nomClase;
        switch (nomClase.toLowerCase()) {
            case "picaro" -> {
                this.ataqUnico = "\u001B[31mAtaque furtivo\u001B[0m";
                this.rasgoUnico = "\u001B[37mSigilo\u001B[0m";
            }
            case "guerrero" -> {
                this.ataqUnico = "\u001B[33mAtaque normal\u001B[0m";
                this.rasgoUnico = "\u001B[93mFuerza bruta\u001B[0m";
            }
            case "explorador" -> {
                this.ataqUnico = "\u001B[32mAtaque normal\u001B[0m";
                this.rasgoUnico = "\u001B[36mObservación\u001B[0m";
            }
            case "paladin" -> {
                this.ataqUnico = "\u001B[35mCastigo Divino\u001B[0m";
                this.rasgoUnico = "\u001B[34mAura Sagrada\u001B[0m";
            }
            default -> {
                this.ataqUnico = "\u001B[31mGolpe básico\u001B[0m";
                this.rasgoUnico = "\u001B[37mResistencia\u001B[0m";
            }
        }
    }
    public void attack() {
        System.out.println("Ataque con " + ataqUnico);
    }

    public void use(){
        System.out.println("\n Tu personaje usa su " + rasgoUnico);
    }

    public String getRasgoUnico() {
        return rasgoUnico;
    }

    public String getAtaqUnico() {
        return ataqUnico;
    }

    public String getNomClase() {
        return nomClase;
    }


}