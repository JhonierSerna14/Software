package Ejercicio2;

public abstract class Prestamo {
    private double valor;
    private double tasaMensual;

    public Prestamo(double valor, double tasaMensual) {
        this.valor = valor;
        this.tasaMensual = tasaMensual;
    }

    public double getValor() {
        return valor;
    }

    public double getTasaMensual() {
        return tasaMensual;
    }

    abstract double calcularAnual();
}
