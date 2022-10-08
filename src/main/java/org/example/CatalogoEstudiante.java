package org.example;

import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoEstudiante {
    private Scanner scanner;

    public Integer solicitarMatricula(){
        System.out.println("Matricula: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public String solicitarNombre(){
        System.out.println("Nombre del estudiante: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer solicitarEdad(){
        System.out.println("Ingrese la edad del estudiante: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String solicitarFacultad(){
        System.out.println("Facultad: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer solicitarSemestre(){
        System.out.println("Ingrese el semestre del estudiante: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public Double solicitarPromedio(){
        System.out.println("Ingrese el promedio del estudiante: ");
        scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void imprimirInfoTotal(ArrayList<Estudiante> estudiantes) {
        estudiantes.forEach(System.out::println);
    }

    public Integer menu() {
        scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("[1] - Agregar Estudiante");
        System.out.println("[2] - Borrar Estudiante");
        System.out.println("[3] - Modificar Estudiante");
        System.out.println("[4] - Desplegar lista");
        System.out.println("[5]- Desplegar Estudiante");
        System.out.println("[6] - Salir");
        System.out.println("\nOpcion: ");
        return scanner.nextInt();
    }

    public void imprimeInfoBorrado(boolean e) {
        if (e) {
            msgBajaExitosa();
        } else {
            msgNoRegistro();
        }
    }

    public void msgBajaExitosa() {
        System.out.println("Baja exitosa.");
    }

    public void msgModificacionExitosa() {
        System.out.println("Modificacion exitosa.");
    }

    public void msgNoRegistro() {
        System.out.println("No se encuentra el elemento.");
    }

    public void msgError(Integer e, String descripcion) {
        System.out.println("Error " + e);
        System.out.println(descripcion);
    }

    public void msgError() {
        System.out.println("Error");
    }

    public void imprimirInfoEstudiante(Estudiante obj1) {
        System.out.println(obj1);
    }

    public Integer menuModificarEstudiante() {
        scanner = new Scanner(System.in);
        //scanner.useDelimiter("\n");
        System.out.println("Menu modificacion");
        System.out.println("1- Nombre del estudiante");
        System.out.println("2- Edad del estudiante");
        System.out.println("3- Promedio del estudiante");
        System.out.println("4- Salir");
        System.out.println("Opcion: ");
        return scanner.nextInt();
    }

    public void infoActualizacion(boolean e) {
        if (e) {
            msgModificacionExitosa();
        } else {
            msgError();
        }
    }
}
