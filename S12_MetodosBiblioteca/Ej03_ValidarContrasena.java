/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: mínimo 8 caracteres, al menos una mayúscula y un dígito
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

import java.util.Scanner;

public class Ej03_ValidarContrasena {

    static boolean esValida(String clave) {
        if (clave.length() < 8) {
            return false;
        }
        boolean hayMayuscula = false;
        boolean hayDigito = false;
        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                hayMayuscula = true;
            }
            if (Character.isDigit(c)) {
                hayDigito = true;
            }
        }
        return hayMayuscula && hayDigito;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String clave = sc.nextLine();
        System.out.println(esValida(clave) ? "Contraseña válida" : "Contraseña NO válida");
        sc.close();
    }
}
