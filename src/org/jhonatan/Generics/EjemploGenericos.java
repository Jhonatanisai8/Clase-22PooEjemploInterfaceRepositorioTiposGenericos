package org.jhonatan.Generics;

import java.util.ArrayList;
import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public class EjemploGenericos {
    public static void main(String[] args) {
        System.out.println("EJEMPLOS CON TIPOS GENERICOS");

        /* Creamos una lista de clientes */
        List <Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Gusman"));

        Cliente  andres =  clientes.iterator().next();       

    }

}
