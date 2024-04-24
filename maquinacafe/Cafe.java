package maquinacafe;

public class Cafe {

    private String descripcion;
    private int gramos;
    private String tamanoVaso;

    public Cafe() {

    }

    public Cafe(String descripcion, int gramos, String tamanoVaso) {
        this.descripcion = descripcion;
        this.gramos = gramos;
        this.tamanoVaso = tamanoVaso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public String getTamanoVaso() {
        return tamanoVaso;
    }

    public void setTamanoVaso(String tamanoVaso) {
        this.tamanoVaso = tamanoVaso;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "descripcion='" + descripcion + '\'' +
                ", gramos=" + gramos +
                ", tamanoVaso='" + tamanoVaso + '\'' +
                '}';
    }
}
