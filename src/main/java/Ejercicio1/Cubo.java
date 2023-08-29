package Ejercicio1;

public abstract class Cubo {
    private double lado;
    private double valorFabricacion;
    private static double IVA = 0.19;
    private Empaque empaque;

    public double getLado() {
        return lado;
    }

    public void setEmpaque(Empaque empaque) {
        this.empaque = empaque;
    }

    public Cubo(double lado, double valorFabricacion) {
        this.lado = lado;
        this.valorFabricacion = valorFabricacion;
    }

    public double precio() {
        return this.valorFabricacion + (this.valorFabricacion * this.IVA);
    }

    public boolean estaEmpacado() {
        if (this.empaque != null) {
            return true;
        } else {
            return false;
        }
    }

    public double volumen() {
        return Math.pow(this.lado, 3);
    }

    abstract boolean cabe(Empaque empaque);

    public String toString() {
        return "Lado: " + this.lado + ", Precio: " + this.precio();
    }
}
