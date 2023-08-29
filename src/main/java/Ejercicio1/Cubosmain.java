package Ejercicio1;

public class Cubosmain {
    public static void main(String[] args) {
        // Crear un cubo rígido
        Cubo cubo1 = new CuboRigido(10, 2000);
        System.out.println("--Se crea cubo rígido -- DEBE SER Lado 10 cm. Precio $2380");
        System.out.println(cubo1);
        // Crear un cubo flexible
        Cubo cubo2 = new CuboFlexible(10, 2000, 20);
        System.out.println("--Se crea cubo flexible -- DEBE SER Lado 10 cm. Precio $2475.2");
        System.out.println(cubo2);
        // Se trata de empacar dos cubos en un empaque estrecho
        Empaque empaque1 = new Empaque(5, 5, 100);
        boolean cabeCubo1Empaque1 = cubo1.cabe(empaque1);
        if (cabeCubo1Empaque1) {
            cubo1.setEmpaque(empaque1);
        }
        boolean cubo1Empacado = cubo1.estaEmpacado();
        System.out.println("--Empaque estrecho con cubo rígido -- DEBE SER false - false");
        System.out.println(cabeCubo1Empaque1 + " - " + cubo1Empacado);
        boolean cabeCubo2Empaque1 = cubo2.cabe(empaque1);
        if (cabeCubo2Empaque1) {
            cubo2.setEmpaque(empaque1);
        }
        boolean cubo2Empacado = cubo2.estaEmpacado();
        System.out.println("--Empaque estrecho con cubo flexible -- DEBE SER true - true");
        System.out.println(cabeCubo2Empaque1 + " - " + cubo2Empacado);

    }
}
