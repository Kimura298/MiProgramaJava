import java.util.Scanner;

public class JuegoRol {

    public  class Personaje {

        public enum clase {
            PICARO,
            EXPLORADOR,
            GUERRERO,
            BARBARO,
            PALADIN,
            CLERIGO,
            MAGO
        }

        protected String nombre;
        protected int nivel;
        protected String[] mochila;
        protected int vida;
        private Habilidad habClase;


        public Personaje(String nombre, int nivel, String[] mochila, int vida, Habilidad habClase) {
            this.nombre = nombre;
            this.nivel = nivel;
            this.mochila = mochila;
            this.vida = vida;
            this.habClase = habClase;

        }

        public String getNombre() { return nombre; }
        public int getNivel() { return nivel; }
        public int getVida() { return vida; }
        public String[] getMochila() { return mochila; }
        public Habilidad getHabClase() {return habClase;}
    }

    public class Habilidad {
        private String rasgoUnico;
        private String ataqUnico;
        private Personaje.clase tipo;

        public Habilidad(Personaje.clase tipo) {
            this.tipo = tipo;
            switch (tipo) {
                case PICARO -> {
                    this.ataqUnico = "\u001B[31mAtaque furtivo\u001B[0m";
                    this.rasgoUnico = "\u001B[37mSigilo\u001B[0m";
                }
                case GUERRERO -> {
                    this.ataqUnico = "\u001B[33mAtaque normal\u001B[0m";
                    this.rasgoUnico = "\u001B[93mFuerza bruta\u001B[0m";
                }
                case EXPLORADOR -> {
                    this.ataqUnico = "\u001B[32mAtaque normal\u001B[0m";
                    this.rasgoUnico = "\u001B[36mMarca del Cazador\u001B[0m";
                }
                case PALADIN -> {
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

        public void use() {
            System.out.println("\nTu personaje usa su " + rasgoUnico);
        }

        public String getRasgoUnico() { return rasgoUnico; }
        public String getAtaqUnico() { return ataqUnico; }
        public Personaje.clase getTipo() { return tipo; }
    }

    public class RollDice {
        public int tirarDado() {
            return (int)(Math.random() * 20) + 1;
        }
    }


    public void main() {

        Habilidad picaro = new Habilidad(Personaje.clase.PICARO);
        Personaje kim = new Personaje("Kimisnotadndplayer", 5, new String[]{"Espada"}, 100, picaro);
        Personaje enemy = new Personaje("Enemigo", 4, new String[]{"Espada"}, 25, picaro);

        //kim.getHabClase().attack();
        //kim.getHabClase().use();

        RollDice dado = new RollDice();
        System.out.println("Has sacado un " + dado.tirarDado());
        int resultado = dado.tirarDado();
        if (resultado < 10){
            System.out.println("Pifia");
        } else if (resultado > 20){
            System.out.println("Acierto! Realizas" + "meter aqui lo de los daños" + "de daño!");
        }



     }

     public void menuCombate (){
         boolean quit = false;
         Scanner sc = new Scanner(System.in);


         while (quit){
             System.out.println("""
                    ╔═════════════════════════════════╗
                    ║     INTRODUCE TU ACCIÓN         ║
                    ║ ==============================  ║
                    ║ 0 - Salir                       ║
                    ║ 1 - Ataque                      ║
                    ║ 2 - Habilidad Unica             ║                
                    ╚═════════════════════════════════╝
                    """);
             int opcion = sc.nextInt();

             switch (opcion){
             case 1:

             
             }
         }

     }
}