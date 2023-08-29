package Ejercicio2;

public class Prestamosmain {
    public static void main(String[] args) {
        Efectivo e = new Efectivo(2000000, 0.015);
        Nominal n = new Nominal(2000000, 0.015);
        Entidad en = new Entidad();
        en.nuevoPrestamo(n);
        en.nuevoPrestamo(e);
        System.out.println(en.total());
    }
}
