/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: 1000 lanzamientos de dos dados con Random; mostrar conteo y porcentaje
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Random rnd = new Random();
        final int LANZAMIENTOS = 1000;
        int cuentaSiete = 0;

        for (int i = 0; i < LANZAMIENTOS; i++) {
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                cuentaSiete++;
            }
        }

        double porcentaje = cuentaSiete * 100.0 / LANZAMIENTOS;
        System.out.println("Lanzamientos: " + LANZAMIENTOS);
        System.out.println("Veces que sumaron 7: " + cuentaSiete);
        System.out.printf("Porcentaje: %.2f%% (teórico: 16.67%%)%n", porcentaje);
    }
}
