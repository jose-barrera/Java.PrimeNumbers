package com.jlbc.primos;

public class Main {

    /**
     * Esta función comprueba si un número entero entre 0 y 100
     * es un número primo, devolviendo "ES PRIMO" en caso afirmativo
     * o "NO ES PRIMO" en caso negativo; si el número está fuera
     * del rango de 0 a 100, la función devuelve "ERROR".
     * 
     * @param   numero  Cualquier valor entero.
     * 
     * @return  string  Texto que indica cualquier de los resultados
     *                  posibles: es número primo, no lo es, o es error.
     * 
     */
    static String verificarSiEsNumeroPrimo(int numero) {

        // Declaramos la variable "resultado" y asumimos
        // desde el principio que vamos a obtener un error.
        String resultado = "ERROR";

        // Verificamos que la condición del ejemplo se cumpla,
        // que sea un valor entre 0 y 100 inclusive. En caso de
        // no cumplirse, la variable resultado ya tiene lo que
        // se debe devolver.
        if (numero >= 0 & numero <= 100) {

            // Asumimos que el número no es primo.
            resultado = "NO ES PRIMO";

            // Verificamos que el número sea mayor que 1, ya que
            // el 0 y el 1 no son números primos por definición.
            // En caso de no cumplirse la condición, la variable
            // resultado ya tiene lo que se debe devolver.
            if (numero > 1) {

                // Asumimos que el número puede ser primo.
                boolean puedeSerPrimo = true;

                // El primer divisor posible es 2.
                int divisor = 2;

                // El ciclo continua mientras pueda ser primo
                // y el divisor sea menor que el número que se
                // está verificando. Usamos un ciclo pre-prueba
                // ya que uan vez que confirmamos que es divisible
                // por un divisor, no es necesario checar los 
                // divisores restantes.
                while (divisor < numero & puedeSerPrimo) {

                    // Si el módulo es distinto de cero, todavía
                    // es posible que sea primo.
                    puedeSerPrimo = numero % divisor != 0;
                    divisor++;
                }

                // Si al final pudo ser primo, entonces es primo.
                if (puedeSerPrimo) {
                    resultado = "ES PRIMO";
                }
            }
        }

        // Resultado de la función
        return resultado;
    }
    
    /**
     * Función principal del programa.
     * 
     * @param   args    Arreglo de argumentos.
     * 
     */
    public static void main(String[] args) {

        // Ciclo de -10 a 110 para verificar si son números primos.
        for (int numero = -10; numero <= 110; numero++)
        {
            // Imprimimos el resultado de la función.
            System.out.println(numero + " : " + verificarSiEsNumeroPrimo(numero));
        }
    }    
}
