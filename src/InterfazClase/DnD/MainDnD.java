package InterfazClase.DnD;

public class MainDnD {
    static void main() {
        // crear objeto personaje
        Clase pj1 = new Clase("Rodolfo", "Semielfo", 21, "PALADIN");



        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║            📜 HOJA DE PERSONAJE 📜          ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.printf ("║ Nombre : %-33s ║%n", pj1.getNombre());
        System.out.printf ("║ Raza   : %-33s ║%n", pj1.getRaza());
        System.out.printf ("║ Edad   : %-33d ║%n", pj1.getEdad());
        System.out.printf ("║ Clase  : %-33s ║%n", pj1.getNomClase());
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ ⚔ Ataque Único : " + pj1.getAtaqUnico() + "            ║");
        System.out.println("║ ✨ Rasgo Único  : " + pj1.getRasgoUnico() + "              ║");
        System.out.println("╚════════════════════════════════════════════╝");

        //llamamos al metodo ataque
        System.out.println("Ejecutando acción de tu personaje...");
        pj1.attack();

    }
}