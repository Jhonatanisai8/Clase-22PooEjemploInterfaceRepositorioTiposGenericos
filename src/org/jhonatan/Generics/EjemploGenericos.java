package org.jhonatan.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public class EjemploGenericos {
    public static void main(String[] args) {
        System.out.println("EJEMPLOS CON TIPOS GENERICOS");

        /* Creamos una lista de clientes */
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Gusman"));

        Cliente andres = clientes.iterator().next();

        /* Creamos arreglos */
        Cliente[] clientesArreglo = { new Cliente("Ana", "Martinez"),
                new Cliente("Juan", "Arevalo"),
                new Cliente("David", "Paz") };

        Integer[] enterosArreglo = { 1, 2, 34, 5, 6, 7, 8 };

        /* LLamamos al metodo estatico de esta misma clase */
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        /* mostramos */
        System.out.println("Lista de clientes: \n");
        clientesLista.forEach(System.out::println);

        System.out.println("Lista de enteros\n");
        enterosLista.forEach(System.out::println);
        System.out.println();

        /* Porvando el segundo metodo */
        List<String> nombresLista = fromArrayToList(new String[] { "Luci", "Pedro", "Alberto", "Juan" },
                enterosArreglo);
        System.out.println("Lista de nombres: ");
        nombresLista.forEach(System.out::println);

    }

    /* metodos para convertir un arreglo a lista */

    /* indicamos con el <T> que es de tipo generico */
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    /* uno itera e imprimi, el otro convierte */
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G g : x) {
            System.out.println(g);
        }
        return Arrays.asList(c);
    }
}
