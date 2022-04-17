package evaluacionJava;

import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz
 */
// TODO: 13/02/2022  Lee un número por teclado que pida el precio de un producto (puede tener decimales)
//  y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

public class ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Este programa permite calcular el IVA de un producto.");

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto.");
        Double precio = input.nextDouble();

        final Double IVA = 0.21;

        Double calculo = precio * IVA;

        Double resultado = calculo + precio;

        System.out.println("El precio con IVA es: " + resultado);

    }
}
