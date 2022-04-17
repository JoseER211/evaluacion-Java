package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022 Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
public class ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la frase.");
        String frase = input.nextLine();

        frase = frase.replaceAll(" ", "");

        System.out.println(frase);

    }
}
