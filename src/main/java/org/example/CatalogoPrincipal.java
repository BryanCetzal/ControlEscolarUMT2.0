package org.example;

import java.util.Scanner;

public class CatalogoPrincipal {
    private Scanner scanner;

    public Integer menuPrincipal(){
        scanner = new Scanner(System.in);
        System.out.println("CONTROL ESCOLAR UMT");
        System.out.println("1- Agregar estudiante");
        System.out.println("2- Cargar asignaturas");
        System.out.println("3- Agregar profesor");
        System.out.println("4- Salir");
        System.out.println("Opcion: ");
        return scanner.nextInt();
    }

    public void msgGracias() {
        System.out.println("Gracias por utilizar el sistema.");
    }

    public void msgVersion() {
        System.out.println("Control Escolar ver. 2.0.0.1");
    }

}
