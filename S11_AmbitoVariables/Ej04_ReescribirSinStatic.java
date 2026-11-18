/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 04: Reescribir sin static
 * Enunciado: versión original comentada y nueva con parámetros y return
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

public class Ej04_ReescribirSinStatic {

    /*  VERSIÓN ORIGINAL (con variable static) 
    static int acumulado = 0;

    static void sumar(int valor) {
        acumulado += valor;
    }

    public static void main(String[] args) {
        sumar(5);
        sumar(7);
        System.out.println("Acumulado: " + acumulado);
    }
    */

    //  VERSIÓN NUEVA: sin static, usa parámetros y return 
    static int sumar(int acumulado, int valor) {
        return acumulado + valor;
    }

    public static void main(String[] args) {
        int acumulado = 0;                    
        acumulado = sumar(acumulado, 5);
        acumulado = sumar(acumulado, 7);
        System.out.println("Acumulado: " + acumulado);
    }
}
