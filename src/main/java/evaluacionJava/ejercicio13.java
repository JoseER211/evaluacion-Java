package evaluacionJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Jose David Echavarria Ruiz.
 */
// TODO: 13/02/2022 Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
public class ejercicio13 {
    public static void main(String[] args) {

        //Forma separada.
        LocalTime hora = LocalTime.now();
        System.out.println("Hora: " + hora);

        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha: " + fecha);

        System.out.println();
        //forma conjunta.
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Fecha y hora: " + fechaHora);

    }
}
