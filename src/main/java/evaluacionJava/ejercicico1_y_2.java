package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */

// TODO: 13/02/2022   Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
//  Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
// TODO: 13/02/2022  Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
public class ejercicico1_y_2 {

    public static void main(String[] args) {

        System.out.println("Este programa permite declarar 2 variables y verificar cual es mayor, menor o si son iguales.");

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el dato.");
        Integer x = input.nextInt();

        System.out.println("Ingresa el dato.");
        Integer y = input.nextInt();


        if (x > y) {
            System.out.println("Mayor: " + x + " Menor: " + y);
        } else if (y > x) {
            System.out.println("Mayor: " + y + " Menor: " + x);
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}



