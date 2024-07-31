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
        Camion transporteCaballos = new Camion(5);
        // agregamos objetos
        transporteCaballos.add(new Animal("Perigrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("TopoCalma", "Caballo"));
        transporteCaballos.add(new Animal("LongoToma", "Caballo"));


        for (Object object : transporteCaballos) {
            // casteamos
            Animal animal = (Animal) object;
            System.out.println("- " + animal.getNombre() + ", Tipo " + animal.getTipo());
        }

    }

    public static void ejemploCamionMaquinaria() {

        System.out.println("=========TRASPORTE DE CAMIONES=========");
        Camion trasporteMaquinaria = new Camion(3);

        trasporteMaquinaria.add(new Maquinaria("Buldozer"));
        trasporteMaquinaria.add(new Maquinaria("Grua Orquilla"));
        trasporteMaquinaria.add(new Maquinaria("Perfovadora"));

        for (Object object : trasporteMaquinaria) {
            // casteamos
            Maquinaria maquinaria = (Maquinaria) object;
            System.out.println("- " + maquinaria.getTipo());
        }
    }

    public static void ejemploCamnionAuto() {
        System.out.println("========TRASPORTE DE AUTOMOVILES========");
        Camion transporteAutoMoviles = new Camion(5);

        transporteAutoMoviles.add(new Auto("Ferrari"));
        transporteAutoMoviles.add(new Auto("Lamborguine"));
        transporteAutoMoviles.add(new Auto("Maclaren"));
        transporteAutoMoviles.add(new Auto("Pagani"));
        transporteAutoMoviles.add(new Auto("Audi"));

        for (Object object : transporteAutoMoviles) {
            Auto auto = (Auto) object;
            System.out.println("- " + auto.getMarca());
        }
    }
}
