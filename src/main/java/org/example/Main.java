package org.example;

import java.util.List;


public class Main {

public static void main(String[] args) {

    GestorTallerBicicletas gestor = new GestorTallerBicicletas();

    BicicletaElectrica bicicletaElectrica=
            new BicicletaElectrica("BIC-E01",2023,22.5,60,false, false);
bicicletaElectrica.activarGarantia();

    BicicletaElectrica bicicletaElectrica1=
            new BicicletaElectrica("BIC-E02",2022,24.0,45,true, false);

    BicicletaMontanya bicicletaMontanya=
            new BicicletaMontanya("BIC-M01",2021,13.5,2);

    BicicletaMontanya bicicletaMontanya1=
            new BicicletaMontanya("BIC-M02",2020,12.0,1);

gestor.registrarBicicleta(bicicletaElectrica);
gestor.registrarBicicleta(bicicletaElectrica1);
gestor.registrarBicicleta(bicicletaMontanya);
gestor.registrarBicicleta(bicicletaMontanya1);

List<Bicicleta> resultados=
        gestor.buscarPorCodigo("BIC-E01");
for (Bicicleta bicicleta:resultados){
    System.out.println(bicicleta);
}

for (Bicicleta bicicleta: gestor.buscarTodos()){
    System.out.println(bicicleta);
}


}

}