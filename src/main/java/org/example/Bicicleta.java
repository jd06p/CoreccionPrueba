package org.example;

public abstract class Bicicleta {
    private String codigo;
    private int anioFabricacion;
    private double peso;

    public Bicicleta(String codigo, int anioFabricacion, double peso) {
        this.codigo = codigo;
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo==null||codigo.isEmpty()){
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }
        this.codigo = codigo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion){
        if(anioFabricacion<2000||anioFabricacion>2026){
            throw new IllegalArgumentException("El año de fabricacion no puede estar vacio");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso){
        if(peso<0){
            throw new IllegalArgumentException("El peso debe ser mayor que 0");
        }
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+
                "Año de fabricacion: "+getAnioFabricacion();
    }
}
