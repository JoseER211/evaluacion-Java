package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022  Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while),
//  después muestra ese número por consola.
public class ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Este programa permite ingresar un número y comprobar si es menor o igual que 0.");

        Integer num;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el número.");
            num = input.nextInt();

            if (num >= 0) {
                System.out.println("El número " + num + " es mayor o igual que 0.");
            }

        }
        while (num < 0);
    }
}
