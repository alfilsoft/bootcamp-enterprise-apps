package maquinacafe;

public class OpcionAzucar {
    private String descripcion;
    private int cubosAzucar;

    public OpcionAzucar() {

    }

    public OpcionAzucar(String descripcion, int cubosAzucar) {
        this.descripcion = descripcion;
        this.cubosAzucar = cubosAzucar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCubosAzucar() {
        return cubosAzucar;
    }

    public void setCubosAzucar(int cubosAzucar) {
        this.cubosAzucar = cubosAzucar;
    }

    @Override
    public String toString() {
        return "OpcionAzucar{" +
                "descripcion='" + descripcion + '\'' +
                ", cubosAzucar=" + cubosAzucar +
                '}';
    }
}
