public abstract class Abstracta {

    protected String abstracto;

    public Abstracta(String abstracto) {
        this.abstracto = abstracto;
        System.out.println("Este es un const de clase abstracta");
    }

    abstract void abstract_method();

    public void imprimir(){
        System.out.println("Metodo normal de clase abstracta");
    }



}