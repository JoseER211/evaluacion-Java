package ejercicio16;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz.
 */
class ejercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        input.useDelimiter("\n");
        input.useLocale(Locale.US);

        System.out.println("Introduce el nombre.");
        String nombre = input.next();

        System.out.println("Introduce la edad.");
        Integer edad = input.nextInt();

        System.out.println("Introduce el sexo. H(hombre) /M (mujer)");
        Character sexo = input.next().charAt(0);

        System.out.println("Introduce el peso.");
        Double peso = input.nextDouble();

        System.out.println("Introduce la altura.");
        Double altura = input.nextDouble();

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        persona1.setNombre("Sofia");
        persona1.setEdad(25);
        persona1.setSexo('M');
        persona1.setPeso(67.0);
        persona1.setAltura(1.58);

        persona2.setNombre("Miguel");
        persona2.setEdad(40);
        persona2.setSexo('H');
        persona2.setPeso(85.2);
        persona2.setAltura(1.80);

        System.out.println("\n" + "Información de la Persona 1:");
        System.out.println(persona1.toString());
        informacionPeso(persona1);
        mayoriaEdad(persona1);

        System.out.println("\n" + "Información de la Persona 2:");
        System.out.println(persona2.toString());
        informacionPeso(persona2);
        mayoriaEdad(persona2);

        System.out.println("\n" + "Información de la persona 3:");
        System.out.println(persona3.toString());
        informacionPeso(persona3);
        mayoriaEdad(persona3);
    }

    /**
     * Determina que mensaje mostrar según el imc de la persona.
     *
     * @param P parámetro que contiene el imc de la persona.
     */
    public static void informacionPeso(Persona P) {
        Integer IMC = P.calcularIMC();
        switch (IMC) {
            case Persona.pesoIdeal:
                System.out.println("La persona tiene el peso ideal.");

                break;
            case Persona.bajoPeso:
                System.out.println("La persona tiene bajo peso.");
                break;
            case Persona.sobrePeso:
                System.out.println("La persona tiene sobre peso.");
                break;
        }
    }

    /**
     * Determina que mensaje mostrar según la edad de la persona.
     *
     * @param E parámetro que contiene la edad de la persona.
     */
    public static void mayoriaEdad(Persona E) {

        if (E.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}