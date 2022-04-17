package ejercicio17;

/**
 * @author Jose David Echavarria Ruiz.
 */
public class Television extends Electrodomestico {

    /**
     * Propiedades de televisión.
     */
    private final static Integer resolucionProducto = 20;
    private Integer resolucion;
    private Boolean sintonizadorTDT;

    /**
     * Constructores de televisión.
     */
    public Television() {
        this(precioBaseProducto, pesoProducto, consumoEnergeticoProducto, colorProducto, resolucionProducto, false);
    }

    public Television(Double precioBase, Double peso) {
        this(precioBase, peso, consumoEnergeticoProducto, colorProducto, resolucionProducto, false);
    }

    public Television(Double precioBase, Double peso, Character consumoEnergetico, String color, Integer resolucion, Boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Calcula el plus de la televisión según la resolución y el sintonizadorTDT.
     *
     * @return el plus de la televsisión.
     */
    public Double precioFinal() {

        Double plus = super.precioFinal();

        if (resolucion > 40) {
            plus += precioBase * 0.3;
        }
        if (sintonizadorTDT) {
            plus += 50;
        }
        return plus;
    }
}
