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

    @Override
    public double calcularCostoMantenimiento(){
        double costo=30000;

        if(cantidadSuspensiones>1){
            costo*=1.15;
        }
        return costo;
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+
                ", Año de fabricacion: "+getAnioFabricacion()+
                ", Peso: "+getPeso()+
                ", Cantidad de suspensiones: "+getCantidadSuspensiones()+
                ", Costo de mantencion: "+calcularCostoMantenimiento();
    }
}
