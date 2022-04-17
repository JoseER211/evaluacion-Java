package ejercicio18;

/**
 * @author Jose David Echavarria Ruiz.
 */
class ejercicio18 {

    public static void main(String[] args) {

        Serie listaSeries[] = new Serie[5];
        Videojuego listaVideojuegos[] = new Videojuego[5];

        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("Hajime no ippo", "George Morikawa ");
        listaSeries[2] = new Serie("Dragon ball z", 9, "Aventura", "Akira Toriyama");
        listaSeries[3] = new Serie("My Hero Academia", 5, "Shonen", "Kohei Horikoshi");
        listaSeries[4] = new Serie("Shingeki no Kyojin", 5, "Shonen", "Hajime Isayama");

        listaVideojuegos[0] = new Videojuego();
        listaVideojuegos[1] = new Videojuego("Lost ark", 2000, "mmoarpg", "Smilegate RPG");
        listaVideojuegos[2] = new Videojuego("Genshin impact", "Mihoyo");
        listaVideojuegos[3] = new Videojuego("Kingdom hearts 2", 40, "rol", "Square Enix");
        listaVideojuegos[4] = new Videojuego("Left 4 dead", 3000, "Shooter", "Valve");

        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        Integer entregados = 0;

        /**
         * Identifica las series y los videojuegos entregados.
         */
        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i].isEntregado()) {
                entregados += 1;
                listaSeries[i].devolver();
            }

            if (listaVideojuegos[i].isEntregado()) {
                entregados += 1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("\n" + "Hay " + entregados + " artículos entregados");

        /**
         * Identifica la serie con mayor número de temporadas y el videojuegos con mayor númereo de horas estimadas.
         */
        Serie serieMayor = listaSeries[0];
        Videojuego videojuegoMayor = listaVideojuegos[0];

        for (int i = 1; i < listaSeries.length; i++) {
            if (listaSeries[i].compareTo(serieMayor) == Serie.mayor) {
                serieMayor = listaSeries[i];
            }
            if (listaVideojuegos[i].compareTo(videojuegoMayor) == Videojuego.mayor) {
                videojuegoMayor = listaVideojuegos[i];
            }
        }

        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}
