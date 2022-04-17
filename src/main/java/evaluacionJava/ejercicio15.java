package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 14/02/2022  Hacer un programa que muestre el siguiente menú de opciones
// GESTION CINEMATOGRAFICA
//1-NUEVO ACTOR
//2-BUSCAR ACTOR
//3-ELIMINAR ACTOR
//4-MODIFICAR ACTOR
//5-VER TODOS LOS ACTORES
//6- VER PELICULAS DE LOS ACTORES
//7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
//8-SALIR
//EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR
//MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE OPCION INCORRECTO.
// MOSTRAR EL MENU NUEVAMENTE.PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.

public class ejercicio15 {

    public static void main(String[] args) {

        Integer opcion = 0;

        while (opcion != 8) {
            System.out.println("\n" + "GESTIÓN CINEMATOGRAFICA" + "\n");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            Scanner input = new Scanner(System.in);
            System.out.println("\n" + "Ingresa el número correspondiente a la opción deseada.");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("1-NUEVO ACTOR");
                    break;
                case 2:
                    System.out.println("2-BUSCAR ACTOR");
                    break;
                case 3:
                    System.out.println("3-ELIMINAR ACTOR");
                    break;
                case 4:
                    System.out.println("4-MODIFICAR ACTOR");
                    break;
                case 5:
                    System.out.println("5-VER TODOS LOS ACTORES");
                    break;
                case 6:
                    System.out.println("6-VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    System.out.println("-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    System.out.println("Usted ha salido del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }
}

