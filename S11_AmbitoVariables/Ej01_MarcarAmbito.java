/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: indicar en un comentario si cada variable es local, de bloque o static
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

public class Ej01_MarcarAmbito {

    static int total = 0;                 // static (de clase)
    static final double IVA = 0.15;       // static (de clase, constante)

    static int sumarHasta(int limite) {   // (local al método)
        int suma = 0;                     // local (al método)
        for (int i = 1; i <= limite; i++) { // 'i': de bloque (solo en el for)
            int doble = i * 2;            // de bloque (se crea en cada vuelta)
            suma += doble;
        }
        total += suma;                    // modifica la variable static
        return suma;
    }

    public static void main(String[] args) {
        int base = 100;                   // local (al método main)
        if (base > 50) {
            double recargo = base * IVA;  // de bloque (solo dentro del if)
            System.out.println("Recargo: " + recargo);
        }
        int resultado = sumarHasta(4);    // local (al método main)
        System.out.println("Resultado: " + resultado);
        System.out.println("Total static: " + total);
    }
}
