package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoAsignatura {
    private Scanner lectura = new Scanner(System.in);
    private ArrayList<Asignatura> catalogo;
    private Asignatura vista;

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

    public void catalogo(Integer semestre){

        switch (semestre) {
            case 1:
                System.out.println("[10] - Álgebra Intermedia (8 crts).");
                System.out.println("[11] - Geometría Analítica (8 crts).");
                System.out.println("[12] - Algoritmia (7 crts).");
                System.out.println("[13] - Fundamentos de Ingeniería de Software (8 crts).");
                System.out.println("[14] - Responsabilidad Social Universitaria (6 crts).");

                break;
            case 2:
                System.out.println("[20] - Álgebra Superior (8 crts).");
                System.out.println("[21] - Cálculo Diferencial (7 crts).");
                System.out.println("[22] - Programación Estructurada (8 crts).");
                System.out.println("[23] - Matemáticas Discretas (8 crts).");
                System.out.println("[24] - Cultura Maya (6 crts)");
                break;
            case 3:
                System.out.println("[30] - Álgebra Lineal (8 crts).");
                System.out.println("[31] - Cálculo Integral (7 crts).");
                System.out.println("[32] - Programación Orientada a Objetos (8 crts).");
                System.out.println("[33] - Teoría de la Computación (8 crts).");
                System.out.println("[34] - Arquitectura y Organización de Computadoras (8 crts).");
                break;
            case 4:
                System.out.println("[40] - Probabilidad (8 crts).");
                System.out.println("[41] - Diseño de Software (8 crts).");
                System.out.println("[42] - Estructura de Datos (7 crts).");
                System.out.println("[43] - Sistemas Operativos (8 crts).");
                System.out.println("[44] - Teoría de Lenguajes de Programación (7 crts).");
                break;
            case 5:
                System.out.println("[50] - Inferencia Estadistica (8 crts).");
                System.out.println("[51] - Arquitecturas de Software (8 crts).");
                System.out.println("[52] - Construcción de Software (7 crts).");
                System.out.println("[53] - Diseño de Bases de Datos (8 crts).");
                System.out.println("[54] - Desarrollo de Aplicaciones Web (8 crts).");
                break;
            case 6:
                System.out.println("[60] - Métricas de Software (8 crts).");
                System.out.println("[61] - Aseguramiento de la Calidad del Software (8 crts).");
                System.out.println("[62] - Requisitos de Software (7 crts).");
                System.out.println("[63] - Interacción Humano Computadora (8 crts).");
                break;
            case 7:
                System.out.println("[70] - Experimentación en Ingeniería de Software (8 crts).");
                System.out.println("[71] - Verificación y Validación de Software (8 crts).");
                System.out.println("[72] - Redes y Seguridad de Computadoras (8 crts).");
                System.out.println("[73] - Innovación Tecnológica (7 crts).");
                break;
            case 8:
                System.out.println("[80] - Administración de Proyectos I (8 crts).");
                System.out.println("[81] - Mantenimiento de Software (8 crts).");
                System.out.println("[82] - Sistemas Distribuidos (7 crts).");
                break;
            case 9:
                System.out.println("[90] - Administración de Proyectos II (8 crts).");
                break;
        }

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


//Empiezan los mensajes que pueden aparecer
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

    public void primerSemestre(){
        System.out.println("Clave \t Asignatura\t\t Creditos ");
    }

}


