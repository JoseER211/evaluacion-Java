package ejercicio18;

/**
 * @author Jose David Echavarria Ruiz.
 */
public class Serie implements Entregable {

    /**
     * Propiedades de serie.
     */
    private final static Integer numeroTemporadasSerie = 3;
    public final static Integer mayor = 1;
    public final static Integer menor = -1;
    public final static Integer igual = 0;
    private String titulo;
    private Integer numeroTemporadas;
    private Boolean entregado;
    private String genero;
    private String creador;

    /**
     * Constructores de serie.
     */
    public Serie() {
        this("", numeroTemporadasSerie, "", "");
    }

    public Serie(String titulo, String creador) {
        this(titulo, numeroTemporadasSerie, "", creador);
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getnumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setnumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcreador() {
        return creador;
    }

    public void setcreador(String creador) {
        this.creador = creador;
    }

    /**
     * Verifica la entrega de la serie.
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
     * Calcula si la serie es mayor, menor o igual en cuanto al número de temporadas.
     *
     * @param temporadas parámetro que recibe el númerop de temporadas.
     * @return el estado de la serie.
     */
    public Integer compareTo(Object temporadas) {

        Integer estado = menor;

        Serie ref = (Serie) temporadas;
        if (numeroTemporadas > ref.getnumeroTemporadas()) {
            estado = mayor;
        } else if (numeroTemporadas == ref.getnumeroTemporadas()) {
            estado = igual;
        }
        return estado;
    }

    public String toString() {
        return "Informacion de la Serie con mayor número de temporadas: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tNumero de temporadas: " + numeroTemporadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tCreador: " + creador;
    }
}