package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Asignatura obj1 = new Asignatura("Calculo", 3, 9, 101);

         Estudiante obj = new Estudiante(12343, "Emmanuel Cetzal", 19, 3, "Matematicas",
                 95.9, obj1);
          System.out.println(obj1);
        System.out.println(obj);

       /* ArrayList<Asignatura> catalogo = new ArrayList<>(Asignatura);
        catalogo.add(new Asignatura("Álgebra Intermedia", 1,8,10));
        catalogo.add(new Asignatura("Geometría Analítica", 1,8,12));
        catalogo.add(new Asignatura("Algoritmia", 1,8,13));
        catalogo.add(new Asignatura("Fundamentos de Ingeniería de Software", 1,8,14));
        catalogo.add(new Asignatura("Responsabilidad Social Universitaria", 1,8,15));*/

        Asignatura[] plantilla = new Asignatura[5];
        plantilla[0] = new Asignatura("Álgebra Intermedia", 1,8,10);
        plantilla[1] = new Asignatura("Geometría Analítica", 1,8,12);
        plantilla[2] = new Asignatura("Algoritmia", 1,8,13);
        plantilla[3] = new Asignatura("Fundamentos de Ingeniería de Software", 1,8,14);
        plantilla[4] = new Asignatura("Responsabilidad Social Universitaria", 1,8,15);

        for (Asignatura x: plantilla) {
            System.out.println(x);
        }



        /*CatalogoPrincipal obj = new CatalogoPrincipal();
        CatalogoEstudiante estudiante = new CatalogoEstudiante();
        CatalogoProfesor profesor = new CatalogoProfesor();
        CatalogoAsignatura asignatura = new CatalogoAsignatura();

        ControladorPrincipal programa = new ControladorPrincipal(obj, estudiante, asignatura, profesor);

        programa.menu();*/

    }
}