package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022 Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual
//  es la longitud de esta frase, adicionalmente cuantas vocales tiene de a,e,i,o,u.

public class ejercicio11 {

    public static void main(String[] args) {

        System.out.println("Este programa permite saber la longitud de una frase y cuántas vocales contiene.");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la frase.");
        String frase = input.nextLine().toLowerCase();

        Integer vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' ||
                    frase.charAt(i) == 'u') {
                vocales++;
            }
        }
        System.out.println("La frase tiene " + frase.length() + " espacios.");
        System.out.println("La frase tiene " + vocales + " vocales.");

    }
}
