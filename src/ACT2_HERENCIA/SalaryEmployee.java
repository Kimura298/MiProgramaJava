package ACT2_HERENCIA;

public class SalaryEmployee extends Employee{

    private double salario_semanal;
    public SalaryEmployee(String nombre, String cargo) {
        super(nombre, cargo);
    }

    public void cambiarSalSem(double salarioCambiado){
        this.salario_semanal =+ salarioCambiado;
    }
    @Override
    void calculateWeeklyPay(){
        System.out.println(salario_semanal);
    }

}
