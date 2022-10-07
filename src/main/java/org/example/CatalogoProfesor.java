package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoProfesor {
    private Scanner scan;

//MÉTODOS DE SOLICITUD DE DATOS
    public String SolicitarNomProfe(){
        System.out.println("Nombre del profesor: ");
        scan = new Scanner(System.in);
        return scan.next();
    }
    public String SolicitarMateria(){
        System.out.println("Materia que imparte: ");
        scan = new Scanner(System.in);
        return scan.next();
    }
    public Integer SolicitarEdadProfe(){
        System.out.println("Edad: ");
        scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public String SolicitarFacultadProfe(){
        System.out.println("Nombre de la facultad: ");
        scan = new Scanner(System.in);
        return scan.next();
    }
    public Integer SolicitarClaveProfe(){
        System.out.println("Número clave: ");
        scan = new Scanner(System.in);
        return scan.nextInt();
    }

//MENÚ DE OPCIONES
    public Integer MenuProfe(){
        System.out.println("MENÚ - PROFESORES");
        System.out.println("[1] - Agregar nuevo profesor.");
        System.out.println("[2] - Eliminar un profesor.");
        System.out.println("[3] - Modificar datos de un profesor.");
        System.out.println("[4] - Desplegar datos de un profesor.");
        System.out.println("[5] - Desplegar lista de profesores.");
        System.out.println("[6] - Salir.");
        System.out.println("\nElija una opción: ");
        scan = new Scanner(System.in);
        return scan.nextInt();
    }

//OTROS MÉTODOS IMPORTANTES
    public void imprimirInfoProfesor(Profesor obj1) {
        System.out.println(obj1);
    }
    public void imprimirInfoTotal(ArrayList<Profesor> estudiantes) {
        estudiantes.forEach(System.out::println);
    }
    public void imprimeInfoBorrado(boolean e) {
        if (e) {
            System.out.println("Borrado exitosamente.");
        } else {
            System.out.println("No se encontró el elemento.");
        }
    }
    public void ImprimirInfoProfe(Profesor obj1) {
        System.out.println(obj1);
    }

//MENÚ DE OPCIONES PARA MODIFICAR DATOS DE PROFESOR
    public Integer MenuModificarProfe(){
        System.out.println("MODIFICAR DATOS DE UN PROFESOR");
        System.out.println("[1] - Modificar el nombre.");
        System.out.println("[2] - Modificar la edad.");
        System.out.println("[3] - Modificar la facultad.");
        System.out.println("[4] - Modificar la materia que imparte.");
        System.out.println("[5] - Salir.");
        System.out.println("\nElija una opción: ");
        scan = new Scanner(System.in);
        return scan.nextInt();
    }

}
