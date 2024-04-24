package maquinacafe;

public class IngredienteAdicional {

    private String nombre;
    private int cantidadGramos;
    private int orden;

    public IngredienteAdicional() {
    }

    public IngredienteAdicional(String nombre, int cantidadGramos, int orden) {
        this.nombre = nombre;
        this.cantidadGramos = cantidadGramos;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadGramos() {
        return cantidadGramos;
    }

    public void setCantidadGramos(int cantidadGramos) {
        this.cantidadGramos = cantidadGramos;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
