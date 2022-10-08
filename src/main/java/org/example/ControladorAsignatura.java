package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ControladorAsignatura {
    private ArrayList<Asignatura> asigList;
    private ArrayList<Asignatura> auxList;
    private CatalogoAsignatura vista;
    private Asignatura objAsig;

    ControladorAsignatura(CatalogoAsignatura vista){
        asigList = new ArrayList<Asignatura>();
        auxList = new ArrayList<Asignatura>();
        this.vista = vista;
    }
    public void addAsignatura(){

        objAsig = new Asignatura("Algrebra Intermedia", 1, 8, 1001);
        asigList.add(objAsig);
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
                    vista.asigSolicitarClave();
                    vista.addAsignatura();
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
