package ejercicio16;

/**
 * @author Jose David Echavarria Ruiz.
 */
public class Persona {
    /**
     * Propiedades de persona.
     */
    private final static Character sexoPersona = 'H';
    public static final int bajoPeso = -1;
    public static final int pesoIdeal = 0;
    public static final int sobrePeso = 1;
    private String nombre;
    private Integer edad;
    private String DNI;
    private Character sexo;
    private Double peso;
    private Double altura;

    /**
     * Constructores de persona.
     */
    public Persona() {
        this("", 0, sexoPersona, 0.0, 0.0);
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this(nombre, edad, sexo, 0.0, 0.0);
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        obtenerDNI();
        this.sexo = sexo;
        verificarSexo();
    }

    /**
     * Verifica si la persona es hombre o mujer.
     */
    private void verificarSexo() {

        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoPersona;
        }
    }

    /**
     * Obtiene el DNI a través de carácteres aleatorios.
     */
    private void obtenerDNI() {
        final Integer divisor = 23;

        Integer numeroDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        Integer resta = numeroDNI - (numeroDNI / divisor * divisor);

        Character letraDNI = generaLetraDNI(resta);

        DNI = Integer.toString(numeroDNI) + letraDNI;
    }

    private Character generaLetraDNI(Integer resta) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[resta];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el IMC de la persona.
     *
     * @return el determinante del peso de la persona.
     */
    public Integer calcularIMC() {

        Double pesoActual = peso / (Math.pow(altura, 2));

        if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else if (pesoActual < 20) {
            return bajoPeso;
        } else {
            return sobrePeso;
        }
    }

    /**
     * Calcula si la persona es mayor de edad.
     *
     * @return el determinante de la mayoría de edad de la persona.
     */
    public Boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return
                "Nombre: " + nombre + "\n"
                        + "Sexo: " + sexo + "\n"
                        + "Edad: " + edad + " años\n"
                        + "DNI: " + DNI + "\n"
                        + "Peso: " + peso + " kg\n"
                        + "Altura: " + altura + " metros\n";
    }
}
