package maquinacafe;

public class OpcionLeche {

    private String descripcion;
    private int cantidad;

    public OpcionLeche() {
    }

    public OpcionLeche(String descripcion, int cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public OpcionLeche(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "OpcionLeche{" +
                "descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
