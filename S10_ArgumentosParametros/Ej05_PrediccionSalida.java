/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 05: Predicción de salida
 * Enunciado: programa con 3 llamadas; salida predicha en comentario y luego la real
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Arrays;

public class Ej05_PrediccionSalida {

    static void modificar(int n, int[] arr) {
        n = n + 10;          
        arr[0] = arr[0] + 10; 
        System.out.println("  dentro: n = " + n + ", arr = " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int numero = 1;
        int[] lista = {1, 2, 3};

        for (int i = 1; i <= 3; i++) {
            System.out.println("Llamada " + i + ":");
            modificar(numero, lista);
            System.out.println("  fuera:  numero = " + numero + ", lista = " + Arrays.toString(lista));
        }

    }
}
