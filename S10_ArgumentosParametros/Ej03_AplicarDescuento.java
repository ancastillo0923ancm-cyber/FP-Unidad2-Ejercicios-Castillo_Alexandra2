/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 03: Aplicar descuento
 * Enunciado: aplicarDescuento(double[] precios, double pct) modifica el arreglo; imprimir antes y después
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Arrays;

public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * (1 - pct / 100.0);
        }
    }

    public static void main(String[] args) {
        double[] precios = {100.0, 250.5, 80.0, 19.99};
        double descuento = 10; 

        System.out.println("Antes:   " + Arrays.toString(precios));
        aplicarDescuento(precios, descuento);
        System.out.println("Después (" + descuento + "% de descuento): " + Arrays.toString(precios));
    }
}
