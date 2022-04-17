package evaluacionJava;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022  Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
public class ejercicio12 {
    public static void main(String[] args) {

        System.out.println("Este programa recibe dos palabras y verifica si son iguales o diferentes.");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra.");
        String frase = input.nextLine();

        System.out.println("Ingresa la segunda palabra.");
        String cadena = input.nextLine();

        if (Objects.equals(frase, cadena)) {
            System.out.println("Las palabras son iguales.");

        } else {
            System.out.println("Las palabras son diferentes" + "\n" + frase + "\n" + cadena);
        }
    }
}
