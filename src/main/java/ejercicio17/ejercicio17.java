package ejercicio17;

/**
 * @author Jose David Echavarria Ruiz.
 */
class ejercicio17 {

    public static void main(String[] args) {

        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Electrodomestico(200.0, 60.0, 'A', "rojo");
        listaElectrodomesticos[1] = new Lavadora(200.0, 50.0);
        listaElectrodomesticos[2] = new Television(500.0, 70.0, 'B', "negro", 42, false);
        listaElectrodomesticos[3] = new Electrodomestico();
        listaElectrodomesticos[4] = new Electrodomestico(600.0, 20.0, 'C', "gris");
        listaElectrodomesticos[5] = new Lavadora(300.0, 60.0, 'D', "blanco", 40);
        listaElectrodomesticos[6] = new Television(450.0, 30.0);
        listaElectrodomesticos[7] = new Lavadora(400.0, 100.0, 'E', "azul", 15);
        listaElectrodomesticos[8] = new Television(410.0, 50.0, 'F', "negro", 32, true);
        listaElectrodomesticos[9] = new Electrodomestico(50.0, 10.0);

        Double sumaElectrodomesticos = 0.0;
        Double sumaTelevisiones = 0.0;
        Double sumaLavadoras = 0.0;

        /**
         * Suma todos los productos dependiendo de la categoría a la que pertenecen.
         */
        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Television) {
                sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones);

    }
}
