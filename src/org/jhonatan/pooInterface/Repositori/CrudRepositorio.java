package org.jhonatan.pooInterface.Repositori;

import java.util.List;

// clase generica <T>
public interface CrudRepositorio<T> {
    List<T> listar();

    T porId(Integer id);

    void crear(T cliente);

    void editar(T cliente);

    void eliminar(Integer id);

}
