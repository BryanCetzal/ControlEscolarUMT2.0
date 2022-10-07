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

    public void catalogo(Integer semestre){
        switch (semestre) {
            case 1:
                System.out.println("[] - Álgebra Intermedia.");
                System.out.println("[] - Geometría Analítica.");
                System.out.println("[] - Algoritmia.");
                System.out.println("[] - Fundamentos de Ingeniería de Software.");
                System.out.println("[] - Responsabilidad Social Universitaria.");

                break;
            case 2:
                System.out.println("[] - Álgebra Superior.");
                System.out.println("[] - Cálculo Diferencial.");
                System.out.println("[] - Programación Estructurada.");
                System.out.println("[] - Matemáticas Discretas.");
                System.out.println("[] - Cultura Maya");
                break;
            case 3:
                System.out.println("[] - Álgebra Lineal.");
                System.out.println("[] - Cálculo Integral.");
                System.out.println("[] - Programación Orientada a Objetos.");
                System.out.println("[] - Teoría de la Computación.");
                System.out.println("[] - Arquitectura y Organización de Computadoras.");
                break;
            case 4:
                System.out.println("[] - Probabilidad.");
                System.out.println("[] - Diseño de Software.");
                System.out.println("[] - Estructura de Datos.");
                System.out.println("[] - Sistemas Operativos.");
                System.out.println("[] - Teoría de Lenguajes de Programación.");
                break;
            case 5:
                System.out.println("[] - Inferencia Estadistica.");
                System.out.println("[] - Arquitecturas de Software.");
                System.out.println("[] - Construcción de Software.");
                System.out.println("[] - Diseño de Bases de Datos.");
                System.out.println("[] - Desarrollo de Aplicaciones Web.");
                break;
            case 6:
                System.out.println("[] - Métricas de Software.");
                System.out.println("[] - Aseguramiento de la Cakidad del Software.");
                System.out.println("[] - REquisitos de Software.");
                System.out.println("[] - Interacción Humano Computadora.");
                break;
            case 7:
                System.out.println("[] - Experimentación en Ingeniería de Software.");
                System.out.println("[] - Verificación y Validación de Software.");
                System.out.println("[] - Redes y Seguridad de Computadoras.");
                System.out.println("[] - Innovación Tecnológica.");
                break;
            case 8:
                System.out.println("[] - Administración de Proyectos I.");
                System.out.println("[] - Mantenimiento de Software.");
                System.out.println("[] - Sistemas Distribuidos.");
                break;
            case 9:
                System.out.println("[] - Administración de Proyectos II");
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


