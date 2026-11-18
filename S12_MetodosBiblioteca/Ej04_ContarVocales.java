/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: contar vocales en un String, mayúsculas y minúsculas, con String y Character
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej04_ContarVocales {

    static int contarVocales(String texto) {
        int cuenta = 0;
        String vocales = "aeiou";
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i)); // cuenta A y a por igual
            if (vocales.indexOf(c) != -1) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();
        System.out.println("Vocales encontradas: " + contarVocales(texto));
        sc.close();
    }
}
