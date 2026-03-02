package ACT2_HERENCIA;

public class HourlyEmployee extends Employee{
    private double TASA = 0.05;
    private double horasTra;

    public HourlyEmployee(String nombre, String cargo) {
        super(nombre, cargo);
    }

    @Override
    void calculateWeeklyPay() {
        double tarifa = TASA * horasTra;
        System.out.println(tarifa);
    }


}
