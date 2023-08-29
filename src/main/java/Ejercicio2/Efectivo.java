package Ejercicio2;

public class Efectivo extends Prestamo {
    public Efectivo(double valor, double tasaMensual) {
        super(valor, tasaMensual);
    }

    @Override
    double calcularAnual() {
        return this.getValor() * ((Math.pow(1 + this.getTasaMensual(), 12)) - 1);
    }
}
