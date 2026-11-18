/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 02: Intercambiar en un arreglo
 * Enunciado: método intercambiar(int[] v, int i, int j); explicar por qué ahora sí funciona
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public static void main(String[] args) {
        int[] datos = {10, 20, 30, 40};
        System.out.println("Antes:   " + Arrays.toString(datos));
        intercambiar(datos, 0, 3);
        System.out.println("Después: " + Arrays.toString(datos));
    }
}
