package ejercicio17;

/**
 * @author Jose David Echavarria Ruiz.
 */
public class Lavadora extends Electrodomestico {

    /**
     * propiedades de lavadora.
     */
    private final static Integer cargaProducto = 5;
    private Integer carga;

    /**
     * Constructores de lavadora.
     */
    public Lavadora() {
        this(precioBaseProducto, pesoProducto, consumoEnergeticoProducto, colorProducto, cargaProducto);
    }

    public Lavadora(Double precioBase, Double peso) {
        this(precioBase, peso, consumoEnergeticoProducto, colorProducto, cargaProducto);
    }

    public Lavadora(Double precioBase, Double peso, Character consumoEnergetico, String color, Integer carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    /**
     * Calcula el plus de la lavadora según la carga.
     * @return el plus de la lavadora.
     */
    public Double precioFinal() {

        Double plus = super.precioFinal();

        if (carga > 30) {
            plus += 50;
        }
        return plus;
    }
}
