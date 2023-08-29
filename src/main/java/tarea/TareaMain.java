package tarea;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TareaMain {
    public static void main(String[] args) {
        String directorio, palabra;
        int total = 0;
        boolean bandera = false;
        Map<String, Integer> dictionary = new HashMap<>();
        directorio = JOptionPane.showInputDialog("Ingrese la ruta");
        palabra = JOptionPane.showInputDialog("Ingrese la palabra a buscar");
        File carpeta = new File(directorio);

        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            for (File archivo : archivos) {
                String nombreArchivo = archivo.getName();
                if (archivo.isFile()) {
                    int ultimoPunto = nombreArchivo.lastIndexOf('.');
                    if (ultimoPunto != -1 && ultimoPunto < nombreArchivo.length() - 1) {
                        String extension = nombreArchivo.substring(ultimoPunto + 1);
                        if (extension.equals("txt") || extension.equals("xml") || extension.equals("json") || extension.equals("csv")) {
                            bandera = true;
                            int cantidad = contarAparicionesEnArchivo(archivo, palabra);
                            total += cantidad;
                            dictionary.put(nombreArchivo, cantidad);
                        }
                    }
                }
            }
        } else {
            System.out.println("La ruta no corresponde a un directorio válido.");
            return;
        }
        if (!bandera) {
            System.out.println("No hay ningún archivo compatible en el directorio");
            return;
        }
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            String a = entry.getKey();
            int b = entry.getValue();
            System.out.println(a + ": " + b);
        }
        System.out.println("Total: " + total);
    }

    private static int contarAparicionesEnArchivo(File archivo, String palabraBuscar) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contador += contarPalabraEnLinea(linea, palabraBuscar);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return contador;
    }

    private static int contarPalabraEnLinea(String linea, String palabraBuscar) {
        String[] linea2 = linea.split(" ");
        int contador = 0;
        for (String p : linea2) {
            p = quitarSignos(p);
            if (p.equals(palabraBuscar)) {
                contador++;
            }
        }
        return contador;
    }

    private static String quitarSignos(String linea) {
        String caracteresPuntuacion = ".,\"()";

        StringBuilder nuevaLinea = new StringBuilder();
        for (char c : linea.toCharArray()) {
            if (caracteresPuntuacion.indexOf(c) == -1) {
                nuevaLinea.append(c);
            }
        }

        return nuevaLinea.toString();
    }
}
