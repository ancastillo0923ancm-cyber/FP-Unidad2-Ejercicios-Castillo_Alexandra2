/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: comentar con // las líneas con error, el mensaje del compilador y la causa
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

public class Ej02_LineasNoCompilan {

    static int contador = 0;

    static void metodo() {
        int local = 5;
        System.out.println(local + contador);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int dentro = i * 2;
            System.out.println(dentro);
        }

        // System.out.println(i);
        // Error: cannot find symbol  (symbol: variable i)
        // Causa: 'i' es variable de bloque del for; no existe fuera de él.

        // System.out.println(dentro);
        // Error: cannot find symbol  (symbol: variable dentro)
        // Causa: 'dentro' se declaró dentro del bloque del for.

        // System.out.println(local);
        // Error: cannot find symbol  (symbol: variable local)
        // Causa: 'local' es local de metodo(); main no la ve.

        int x = 1;
        // int x = 2;
        // Error: variable x is already defined in method main(String[])
        // Causa: no se puede redeclarar una variable local en el mismo ámbito.

        metodo();
        System.out.println("Líneas válidas ejecutadas. x = " + x);
    }
}
