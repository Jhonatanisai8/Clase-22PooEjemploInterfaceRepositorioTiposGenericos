package org.jhonatan.GenericsClass;

import java.util.ArrayList;
import java.util.List;

public class Camion {
    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(Object object) {
        // si el tamaño de la lista es menor a la cantidad maxima
        if (this.objetos.size() <= max) {
            this.objetos.add(object);
        } else {
            throw new RuntimeException("No hay mas espacio en el camion: ");
        }
    }

}
