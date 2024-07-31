package org.jhonatan.pooInterface.Repositori;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T> implements OrdenablePaginableCrud<T> {

    protected List<T> dataSource;

    // constructor
    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    // @Override
    // public Cliente porId(Integer id) {
    // Cliente c = null;
    // for (Cliente cliente : dataSource) {
    // if (cliente.getId() != null && cliente.getId().equals(id)) {
    // c = cliente;
    // break;
    // }
    // }
    // return c;
    // }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    // public void editar(Cliente cliente) {
    // Cliente c = this.porId(cliente.getId());
    // c.setNombre(cliente.getNombre());
    // c.setApellido(cliente.getApellido());
    // }

    @Override
    public void eliminar(Integer id) {
        // Cliente c = ;this.porId(id)
        this.dataSource.remove(this.porId(id));
    }

    // @Override
    // public List<Cliente> listar(String campo, Direccion direccion) {
    // List<Cliente> listOOrdenada = new ArrayList<>(this.dataSource);
    // listOOrdenada.sort((a, b) -> {
    // int result = 0;
    // if (direccion == Direccion.ASC) {
    // result = ordenar(campo, a, b);
    // } else if (direccion == Direccion.DESD) {
    // result = ordenar(campo, b, a);
    // }
    // return result;

    // });
    // return listOOrdenada;
    // }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    // static int ordenar(String campo, Cliente a, Cliente b) {

    // int result = 0;
    // switch (campo) {
    // case "id":
    // result = a.getId().compareTo(b.getId());
    // break;
    // case "nombre":
    // result = a.getNombre().compareTo(b.getNombre());
    // break;
    // case "apellido":
    // result = a.getApellido().compareTo(b.getApellido());
    // break;
    // }
    // return result;
    // }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}
