package org.example;

public class Main {
    public static void main(String[] args) {
         Asignatura obj1 = new Asignatura("Calculo", 3, 9);

         Estudiante obj = new Estudiante(12343, "Bryan Cetzal", 19, 3, "Matematicas", 95.9, obj1);

        System.out.println(obj1);
        System.out.println(obj);
    }
}