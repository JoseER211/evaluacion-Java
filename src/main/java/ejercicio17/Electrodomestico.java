package ejercicio17;

/**
 * @author Jose David Echavarria Ruiz.
 */
public class Electrodomestico {

    /**
     * Propiedades de electrodomestico.
     */
    protected final static String colorProducto = "blanco";
    protected final static Character consumoEnergeticoProducto = 'F';
    protected final static Double precioBaseProducto = 100.0;
    protected final static Double pesoProducto = 5.0;
    protected Double precioBase;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    /**
     * Constructores de electrodoméstico.
     */
    public Electrodomestico() {
        this(precioBaseProducto, pesoProducto, consumoEnergeticoProducto, colorProducto);
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this(precioBase, peso, consumoEnergeticoProducto, colorProducto);
    }

    public Electrodomestico(Double precioBase, Double peso, Character consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        verificarConsumoEnergetico(consumoEnergetico);
        verificarColor(color);
    }

    /**
     * Verifica el color del electrodoméstico y su disponibilidad.
     *
     * @param color parámetro que recibe el color del electrodoméstico.
     */
    private void verificarColor(String color) {

        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        Boolean disponible = false;

        for (int i = 0; i < colores.length && !disponible; i++) {

            if (colores[i].equals(color)) {
                disponible = true;
            }
        }

        if (disponible) {
            this.color = color;
        } else {
            this.color = colorProducto;
        }
    }

    /**
     * Verifica el consumo energético del electrodoméstico.
     *
     * @param consumoEnergetico parámetro que recibe el consumo energético del electrodoméstico.
     */
    public void verificarConsumoEnergetico(Character consumoEnergetico) {

        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = consumoEnergeticoProducto;
        }

    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    /**
     * Calcula el precio final del electroméstico según el precio base + el plus.
     *
     * @return el precio base + el plus del electrodoméstico.
     */
    public Double precioFinal() {
        Double plus = 0.0;
        switch (consumoEnergetico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }

        if (peso >= 0 && peso < 19) {
            plus += 10;
        } else if (peso >= 20 && peso < 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precioBase + plus;
    }
}