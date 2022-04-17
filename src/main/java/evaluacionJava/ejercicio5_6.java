package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022  Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
// TODO: 13/02/2022   Realiza el ejercicio anterior usando un ciclo for.
public class ejercicio5_6 {

    public static void main(String[] args) {


        System.out.println("Este programa muestra los números pares e impares del 1 al 100." + "\n");

        System.out.println("Cuál ciclo desea usar?");
        System.out.println("1. ciclo while" + "\n" + "2. ciclor for");

        Scanner input = new Scanner(System.in);
        Integer option = input.nextInt();

        switch (option) {

            case 1:
                cicloWhile();
                break;
            case 2:
                cicloFor();
                break;
            default:
                System.out.println("Dígito incorrecto.");
                break;
        }
    }

    public static void cicloFor() {
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println("número par: " + i);
            } else {
                System.out.println("número impar: " + i);
            }
        }
    }

    public static void cicloWhile() {
        int i = 0;
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println("número par: " + i);
            } else {
                System.out.println("número impar: " + i);
            }

            i++;
        }
    }
}
