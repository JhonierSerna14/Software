package Ejercicio2;

public class Nominal extends Prestamo {
    public Nominal(double valor, double tasaMensual) {
        super(valor, tasaMensual);
    }

    @Override
    double calcularAnual() {
        return this.getValor() * this.getTasaMensual() * 12;
    }
}
