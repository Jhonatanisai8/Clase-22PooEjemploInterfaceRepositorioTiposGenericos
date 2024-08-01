package org.jhonatan.pooInterface.Modelo;

public class Producto extends BaseEntity {
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        super();
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Id = "+id+", Descripcion=" + descripcion + ", Precio=" + precio;
    }

}
