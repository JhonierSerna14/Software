package Ejercicio1;

public record Empaque(double largo, double ancho, double alto) {
    public double volumen() {
        return largo * ancho * alto;
    }

}
