package Ejercicio1;

public class CuboFlexible extends Cubo {

    private final int elasticidad;

    public CuboFlexible(double lado, double valorFabricacion, int elasticidad) {
        super(lado, valorFabricacion);
        this.elasticidad = elasticidad;
    }

    @Override
    boolean cabe(Empaque empaque) {
        return empaque.volumen() > this.volumen();
    }

    @Override
    public double precio() {
        if (this.elasticidad > 50) {
            return super.precio() + (super.precio() * 0.06);
        } else {
            return super.precio() + (super.precio() * 0.04);
        }
    }
}
