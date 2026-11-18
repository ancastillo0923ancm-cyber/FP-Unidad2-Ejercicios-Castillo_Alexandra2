/*
 * Sesión: S11 - Ámbito de variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: tabla línea | variables vivas | valor en un comentario
 * Autor: Castillo Alexandra
 * Fecha: 18/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0;               

    static void incrementar() {            
        int paso = 2;                      
        contador += paso;                  
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {
        incrementar();                     
        incrementar();                     
        int copia = contador;              
        System.out.println("copia = " + copia);
    }

    /*
     * TRAZA (número de línea de este archivo | variables vivas | valor)
     * 11 | contador                 | contador = 0 (se crea al cargar la clase)
     * 20 | contador                 | llamada a incrementar()
     * 14 | contador, paso           | paso = 2, contador = 0
     * 15 | contador, paso           | contador = 2
     * 16 | contador, paso           | imprime "contador = 2"; al salir, paso muere
     * 21 | contador                 | segunda llamada a incrementar()
     * 14 | contador, paso           | paso = 2 (nueva variable), contador = 2
     * 15 | contador, paso           | contador = 4
     * 16 | contador, paso           | imprime "contador = 4"; al salir, paso muere
     * 22 | contador, copia          | copia = 4
     * 23 | contador, copia          | imprime "copia = 4"
     * Conclusión: 'contador' (static) conserva su valor entre llamadas;
     * 'paso' (local) se crea y destruye en cada llamada.
     */
}
