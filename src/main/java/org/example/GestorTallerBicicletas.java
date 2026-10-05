package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicletas {

    public ArrayList<Bicicleta>bicicletas;
    public GestorTallerBicicletas(){
        bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
        System.out.println(
                bicicleta.getCodigo()+
                        " ("+bicicleta.getClass().getSimpleName()+")"
        );
    }

    public List<Bicicleta> buscarPorCodigo(String codigo){
        List<Bicicleta> resultados=new ArrayList<>();

        for(Bicicleta bicicleta:bicicletas){
            if(bicicleta.getCodigo().equals(codigo)){
                resultados.add(bicicleta);
            }
        }

        return resultados;
    }

    public List<Bicicleta> buscarTodos(){
        return bicicletas;
    }

}
