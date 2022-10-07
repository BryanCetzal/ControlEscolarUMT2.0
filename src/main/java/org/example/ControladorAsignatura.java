package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ControladorAsignatura {
    ArrayList<Asignatura> asigList;
    CatalogoAsignatura vista;
    Asignatura objAsig;

    ControladorAsignatura(CatalogoAsignatura vista){
        asigList = new ArrayList<Asignatura>();
        this.vista = vista;
    }
    public void addAsignatura(){

    }


    public void menuAsignatura(){
        Integer opcion = 0;
        Integer aux;
        do {
            switch (vista.menuAsig()){
                case 1:
                    vista.asigSoliMatricula();
                    aux = vista.asigSolicitarSemestre();
                    vista.catalogo(aux);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    opcion = 4;
                    break;
            }

        }while (opcion != 4);
    }
}
