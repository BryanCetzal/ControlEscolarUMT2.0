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
}
