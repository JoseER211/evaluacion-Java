package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */

// TODO: 13/02/2022  Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
//  Usa la constante PI y el método pow de Math.

public class ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Este programa permite calcular el área de un círculo.");

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo.");
        Double radio = input.nextDouble();

        Double elevado = Math.pow(radio, 2);

        Double resultado = Math.PI * elevado;

        System.out.println("El área del círculo es: " + resultado);

    }
}
