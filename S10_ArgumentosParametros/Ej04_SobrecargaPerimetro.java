/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 04: Sobrecarga de perímetro
 * Enunciado: dos versiones de perimetro (cuadrado y rectángulo) llamadas desde main
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) {
        return 4 * lado;
    }
    static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }
    public static void main(String[] args) {
        System.out.println("Perímetro del cuadrado de lado 5: " + perimetro(5.0));
        System.out.println("Perímetro del rectángulo 4 x 6:   " + perimetro(4.0, 6.0));
    }
}
