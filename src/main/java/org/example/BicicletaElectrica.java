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
        if(certificada==true){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }

    public boolean isGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    public void setGarantiaExtendidaActiva(boolean garantiaExtendidaActiva){
        if(activarGarantia()==true){
            this.garantiaExtendidaActiva=true;
        }
    }
    @Override
    public boolean activarGarantia(){
        return garantiaExtendidaActiva=true;
    }


    @Override
    public void tieneGarantiaExtendida(){
        System.out.println("Garantia: "+garantiaExtendidaActiva);
    }
}
