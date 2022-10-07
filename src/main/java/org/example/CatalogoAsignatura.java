package org.example;

import java.util.Scanner;

public class CatalogoAsignatura {
    private Scanner lectura = new Scanner(System.in);

    public int menuAsig(){
        int opcion;
        do {
            System.out.println("Menu de carga de asignaturas");
            System.out.println("1 - Seleccionar asignatura.");
            System.out.println("2 - Eliminar asignatura.");
            System.out.println("3 - Mostrar asignaturas cargadas.");
            System.out.println("4 - Salir.");
            opcion = lectura.nextInt();

            if (opcion < 1 || opcion>4)
                System.out.println("¡Error! Número inválido.");

        }while(opcion < 1 || opcion > 4);
        return opcion;
    }

    public Integer asigSolicitarSemestre(){
        Integer semestre;
        do {
            System.out.println("Ingrese el semestre a cursar: ");
            semestre = lectura.nextInt();
            if (semestre < 1 || semestre > 9)
                msgSemestreFueraRango();
        }while (semestre < 1 || semestre > 9);
        return semestre;
    }

    public Integer asigSoliMatricula(){
        Integer matricula;
        System.out.println("Ingrese la matricula: ");
        matricula = lectura.nextInt();
        //Faltaria una comprobacion para saber si existe la matricula
        return matricula;
    }

    public Integer asigSolicitarClave(){
        Integer clave;
        System.out.println("Ingrese la clave de la asignatura: ");
        clave = lectura.nextInt();
        return clave;
    }

    public boolean addAsignatura(){
        String respuesta;
        boolean respuestaBoolean;

        do {
            System.out.print("¿Desea agregar otra asignatura? (S/N): ");
            respuesta = lectura.next();

            respuestaBoolean = ((respuesta.isBlank()) || (respuesta.length() != 1) ||
                    (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")));

            if (respuestaBoolean) {
                System.out.println("Verifique la respuesta ingresada.");
            }
        } while(respuestaBoolean);

        return respuesta.equalsIgnoreCase("S");
    }

    public void msgAgregadoExito(){
        System.out.println("Asignatura agregada exitosamente");
    }

    public void msgErrorSemestre(){
        System.out.println("La asignatura no corresponde al semestre");
    }

    public void msgAsigRepetida(){
        System.out.println("Asignatura repetida");
    }

    public void msgCreditosExcedidos(){
        System.out.println("Créditos excedidos");
    }

    public void msgAsigEliminada(){
        System.out.println("Asignatura eliminada en el cardex");
    }

    public void msgSemestreFueraRango(){
        System.out.println("La licenciatura en Ingenieria de Software solo tiene 9 semestres");
        System.out.println("Ingrese su semestre entre (1-9)");
    }
    public void NoKardex() {
        System.out.println("No se pudo encontrar el kardex.");
    }

}


