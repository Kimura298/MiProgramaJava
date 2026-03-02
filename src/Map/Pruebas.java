package Map;
// Haciendo mapas usando objetos~
import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    static class Stats {
        private int nivelPJ;
        private int dadoDanyo;
        private int Vida;

        public Stats(int nivelPJ, int vida, int dadoDanyo) {
            this.nivelPJ = nivelPJ;
            Vida = vida;
            this.dadoDanyo = dadoDanyo;
        }

        @Override
        public String toString() {
            return "Nivel: " + nivelPJ +
                    ", Vida: " + Vida +
                    ", Dado Daño: d" + dadoDanyo;
        }

    }
    static void main() {
        Stats pj1 = new Stats(4, 45, 8);
        Stats pj2 = new Stats(2, 20, 12);

        Map<String, Stats> combatePJS = new HashMap<>();
        combatePJS.put("Guerrero", pj1);
        combatePJS.put("Mago", pj2);

        Map<String, Integer> combateNPCS = new HashMap<>();

        combateNPCS.put("Orco", 30);

        combateNPCS.put("Orco", 15); // le cambia la vida

        System.out.println("Le queda de vida al enemigo: " + combateNPCS.get("Orco")); // me da la vida actual
        System.out.println("Mago " + combatePJS.get("Mago")); // me da el contenido de todo el objeto (usando toString obv)

    }


}
