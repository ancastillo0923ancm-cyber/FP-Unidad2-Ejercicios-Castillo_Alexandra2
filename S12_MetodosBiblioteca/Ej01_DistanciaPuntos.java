/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: calcular la distancia usando Math.sqrt y Math.pow
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej01_DistanciaPuntos {

    static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: "); double x1 = sc.nextDouble();
        System.out.print("y1: "); double y1 = sc.nextDouble();
        System.out.print("x2: "); double x2 = sc.nextDouble();
        System.out.print("y2: "); double y2 = sc.nextDouble();

        System.out.printf("Distancia entre (%.1f, %.1f) y (%.1f, %.1f) = %.2f%n",
                x1, y1, x2, y2, distancia(x1, y1, x2, y2));
        sc.close();
    }
}
