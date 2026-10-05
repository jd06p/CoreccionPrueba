package org.example;

public class BicicletaMontanya extends Bicicleta {

    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigo,
                             int anioFabricacion,
                             double peso,
                             int cantidadSuspensiones){
        super(codigo,anioFabricacion,peso);
        this.cantidadSuspensiones=cantidadSuspensiones;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }
}
