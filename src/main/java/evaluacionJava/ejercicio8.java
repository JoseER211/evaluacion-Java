package evaluacionJava;


import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022  Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día
//  laboral o no. Usa un switch para ello.

public class ejercicio8 {
    public static void main(String[] args) {

        System.out.println("Este programa permite elegir un día de la semana y verificar si es un día laboral o no.");

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el día de la semana.");
        System.out.println("1. Lunes" + "\n" + "2. Martes" + "\n" + "3. Miércoles" + "\n" + "4. Jueves"
                + "\n" + "4. Viernes" + "\n" + "6. Sábado" + "\n" + "7. Domingo");
        System.out.println();
        Integer dia = input.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Lunes es un día laboral.");
                break;
            case 2:
                System.out.println("Martes es un día laboral.");
                break;
            case 3:
                System.out.println("Miércoles es un día laboral.");
                break;
            case 4:
                System.out.println("Jueves es un día laboral.");
                break;
            case 5:
                System.out.println("Viernes es un día laboral.");
                break;
            case 6:
                System.out.println("Sábado es un día laboral.");
                break;
            case 7:
                System.out.println("Domingo es un día laboral.");
                break;
            default:
                System.out.println("Dígito incorrecto.");
                break;
        }
    }
}
