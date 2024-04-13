package tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static boolean VerificarNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;  // Los números menores o iguales a 1 no son primos
        }

        // Verifica si el número es divisible por algún número en el rango de 2 a la raíz cuadrada del número + 1
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // El número es divisible, por lo tanto no es primo
            }
        }

        return true;  // Si no es divisible por ningún número, es primo
    }
    // Scanner para ingresar datos por teclado
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero entero positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Por favor, ingrese un numero entero positivo.");
            } else {
                if (VerificarNumeroPrimo(numero)) {
                    System.out.println(numero + " es un numero primo.");
                } else {
                    System.out.println(numero + " no es un numero primo.");
                }
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un numero entero valido.");
        }
    }

}
