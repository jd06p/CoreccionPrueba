package org.example;

public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida{
    private double autonomiaKM;
    private boolean certificada;
    private boolean garantiaExtendidaActiva=true;

    public BicicletaElectrica(String codigo,
                              int anioFabricacion,
                              double peso,
                              double autonomiaKM,
                              boolean certificada,
                              boolean garantiaExtendidaActiva){
        super(codigo,anioFabricacion,peso);
        this.autonomiaKM = autonomiaKM;
        this.certificada = certificada;
        this.garantiaExtendidaActiva = garantiaExtendidaActiva;
    }

    public double getAutonomiaKM() {
        return autonomiaKM;
    }

    public void setAutonomiaKM(double autonomiaKM) {
        this.autonomiaKM = autonomiaKM;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada){
        this.certificada = certificada;
    }

    public boolean isGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    public void setGarantiaExtendidaActiva(boolean garantiaExtendidaActiva){
        this.garantiaExtendidaActiva=garantiaExtendidaActiva;
    }
    @Override
    public boolean activarGarantia(){
        garantiaExtendidaActiva=true;
        return true;
    }


    @Override
    public void tieneGarantiaExtendida(){
        System.out.println("Garantia: "+garantiaExtendidaActiva);
    }

    @Override
    public double calcularCostoMantenimiento(){

        double costo=45000;

        if(!certificada){
            costo*=1.25;
        }
        return costo;
    }

    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+
                ", Año de fabricacion: "+getAnioFabricacion()+
                ", Peso: "+getPeso()+
                ", Autonomia: "+getAutonomiaKM()+
                ", Esta certificada: "+isCertificada()+
                ", Tiene garantia: "+isGarantiaExtendidaActiva()+
                ", Costo de mantencion: "+calcularCostoMantenimiento();
    }
}
