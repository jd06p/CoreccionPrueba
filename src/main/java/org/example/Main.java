package org.example;

import java.util.List;

public class Main {

    GestorTallerBicicletas gestor = new GestorTallerBicicletas();

    Bicicleta bicicletaElectrica=
            new BicicletaElectrica("BIC-E01",2023,22.5,60,false, true);

    Bicicleta bicicletaElectrica1=
            new BicicletaElectrica("BIC-E02",2022,24.0,45,true, true);

    Bicicleta bicicletaMontanya=
            new BicicletaMontanya("BIC-M01",2021,13.5,2);

    Bicicleta bicicletaMontanya1=
            new BicicletaMontanya("BIC-M02",2020,12.0,1);


gestor.registrar(bicicletaElectrica);
gestor.registrar(bicicletaElectrica1);
gestor.registrar(bicicletaMontanya);
gestor.registrar(bicicletaMontanya1);
}
