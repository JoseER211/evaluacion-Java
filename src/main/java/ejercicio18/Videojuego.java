package ejercicio18;

/**
 * @author Jose David Echavarria Ruiz.
 */
public class Videojuego implements Entregable {

    /**
     * Propiedades de videojuego.
     */
    private final static Integer horasEstimadasJuego = 100;
    public final static Integer mayor = 1;
    public final static Integer menor = -1;
    public final static Integer igual = 0;
    private String titulo;
    private Integer horasEstimadas;
    private Boolean entregado;
    private String genero;
    private String compania;

    /**
     * Constructores de videojuego.
     */
    public Videojuego() {
        this("", horasEstimadasJuego, "", "");
    }

    public Videojuego(String titulo, String compania) {
        this(titulo, horasEstimadasJuego, "", compania);
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompania() {
        return compania;
    }

    public void setcompania(String compania) {
        this.compania = compania;
    }

    /**
     * Verifica la entrega del videojuego.
     */
    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public Boolean isEntregado() {
        if (entregado) {
            return true;
        }
        return false;
    }

    /**
     * Calcula si el videojuego es mayor, menor o igual en cuanto a las horas estimadas.
     *
     * @param horas parámetro que recibe las horas estimadas.
     * @return el estado del videojuego.
     */
    public Integer compareTo(Object horas) {

        Integer estado = menor;

        Videojuego ref = (Videojuego) horas;
        if (horasEstimadas > ref.getHorasEstimadas()) {
            estado = mayor;
        } else if (horasEstimadas == ref.getHorasEstimadas()) {
            estado = igual;
        }
        return estado;
    }

    public String toString() {
        return "Informacion del videojuego con mayor número de horas estimadas: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tHoras estimadas: " + horasEstimadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tcompañia: " + compania;
    }
}