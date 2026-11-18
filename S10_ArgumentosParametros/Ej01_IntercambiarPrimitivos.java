/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 01: Intercambiar primitivos
 * Enunciado: método intercambiar(int a, int b); ¿funciona? ¿por qué?
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        System.out.println("Antes:   x = " + x + ", y = " + y);
        intercambiar(x, y);
        System.out.println("Después: x = " + x + ", y = " + y);
    }
}
