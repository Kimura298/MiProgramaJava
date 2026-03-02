public class Subclase extends Abstracta{


    public Subclase(String abstracto) {
        super(abstracto);
    }


    @Override
    void abstract_method() {
        System.out.println("Este es un método abstracto implementado en una clase no abstracta");

    }

    static void main() {
        Subclase sb = new Subclase("algo") {
            @Override
            void abstract_method() {
                super.abstract_method();
            }

            @Override
            public void imprimir() {
                super.imprimir();
            }


        };
    }

}
