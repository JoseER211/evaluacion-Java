package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022  Del texto, La sonrisa sera la mejor arma contra la tristeza Reemplaza todas las a del String anterior por una e,
//  adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.

public class ejercicio9 {

    public static void main(String[] args) {

        String frase = "La sonrisa sera la mejor arma contra la tristeza. ";

        Scanner fraseConsola = new Scanner(System.in);
        System.out.println("Ingrese la frase a concatenar.");
        String concatenacion = fraseConsola.nextLine();

        System.out.println(frase.replace("a", "e") + concatenacion);
    }
}
