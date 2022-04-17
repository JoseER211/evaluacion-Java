package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 14/02/2022 Crear un programa que pida un numero por teclado y que imprima por pantalla los numeros desde el numero introducido hasta 1000 con saldos de 2 en 2.
public class ejercicio14 {
    public static void main(String[] args) {

        System.out.println("Este programa permite ingresar un número y mostrar los números siguientes con saltos de 2 en 2 hasta 1000.");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el número.");
        Integer num = input.nextInt();

        System.out.println(num);

        while (num < 1000) {
            if (num == 999) {
                break;
            } else {
                num = num + 2;
                System.out.println(num);
            }
        }
    }
}
