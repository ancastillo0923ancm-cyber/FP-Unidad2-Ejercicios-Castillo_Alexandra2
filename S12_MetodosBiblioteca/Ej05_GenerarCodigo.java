/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Código de 6 caracteres
 * Enunciado: 3 letras aleatorias y 3 dígitos aleatorios
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    static String generarCodigo() {
        Random rnd = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            codigo.append((char) ('A' + rnd.nextInt(26))); // letra mayúscula
        }
        for (int i = 0; i < 3; i++) {
            codigo.append(rnd.nextInt(10));                // dígito 0-9
        }
        return codigo.toString();
    }

    public static void main(String[] args) {
        System.out.println("Código generado: " + generarCodigo());
    }
}
