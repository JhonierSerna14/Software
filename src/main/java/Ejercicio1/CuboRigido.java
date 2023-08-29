package Ejercicio1;

public class CuboRigido extends Cubo {
    public CuboRigido(double lado, double valorFabricacion) {
        super(lado, valorFabricacion);
    }

    @Override
    boolean cabe(Empaque empaque) {
        return empaque.alto() > this.getLado() && empaque.ancho() > this.getLado() && empaque.largo() > this.getLado();
    }
}
