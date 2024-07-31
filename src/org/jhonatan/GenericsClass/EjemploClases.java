package org.jhonatan.GenericsClass;

public class EjemploClases {
    public static void main(String[] args) {
        System.out.println("=================EJEMPLOS CON CLASES GENERICAS=================");
        ejemploCamionAnimales();
        ejemploCamionMaquinaria();
        ejemploCamnionAuto();
    }

    public static void ejemploCamionAnimales() {
        System.out.println("=========TRANSPORTE DE ANIMALES=========");
        Camion<Animal> transporteCaballos = new Camion<>(5);
        // agregamos objetos
        transporteCaballos.add(new Animal("Perigrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("TopoCalma", "Caballo"));
        transporteCaballos.add(new Animal("LongoToma", "Caballo"));

        for (Animal animal : transporteCaballos) {
            System.out.println("- " + animal.getNombre() + ", Tipo " + animal.getTipo());
        }

    }

    public static void ejemploCamionMaquinaria() {

        System.out.println("=========TRASPORTE DE CAMIONES=========");
        Camion<Maquinaria> trasporteMaquinaria = new Camion<>(3);

        trasporteMaquinaria.add(new Maquinaria("Buldozer"));
        trasporteMaquinaria.add(new Maquinaria("Grua Orquilla"));
        trasporteMaquinaria.add(new Maquinaria("Perfovadora"));

        for (Maquinaria maquinaria : trasporteMaquinaria) {
            System.out.println("- " + maquinaria.getTipo());
        }
    }

    public static void ejemploCamnionAuto() {
        System.out.println("========TRASPORTE DE AUTOMOVILES========");
        Camion<Auto> transporteAutoMoviles = new Camion<>(5);

        transporteAutoMoviles.add(new Auto("Ferrari"));
        transporteAutoMoviles.add(new Auto("Lamborguine"));
        transporteAutoMoviles.add(new Auto("Maclaren"));
        transporteAutoMoviles.add(new Auto("Pagani"));
        transporteAutoMoviles.add(new Auto("Audi"));

        for (Auto auto : transporteAutoMoviles) {
            System.out.println("- " + auto.getMarca());
        }
    }
}
