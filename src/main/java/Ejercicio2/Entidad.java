package Ejercicio2;

import java.util.ArrayList;

public class Entidad {
    private ArrayList<Prestamo> prestamos;

    public Entidad() {
        this.prestamos = new ArrayList<>();
    }

    public void nuevoPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public double total() {
        double total = 0;
        for (Prestamo prestamo : prestamos) {
            total += prestamo.calcularAnual();
        }
        return total;
    }
}
