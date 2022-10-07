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
                System.out.println("[ALGI] - Álgebra Intermedia.");
                System.out.println("[GEOA] - Geometría Analítica.");
                System.out.println("[ALGO] - Algoritmia.");
                System.out.println("[FUIS] - Fundamentos de Ingeniería de Software.");
                System.out.println("[RESU] - Responsabilidad Social Universitaria.");

                break;
            case 2:
                System.out.println("[ALGS] - Álgebra Superior.");
                System.out.println("[CALD] - Cálculo Diferencial.");
                System.out.println("[PROE] - Programación Estructurada.");
                System.out.println("[MATD] - Matemáticas Discretas.");
                System.out.println("[CULM] - Cultura Maya");
                break;
            case 3:
                System.out.println("[ALGL] - Álgebra Lineal.");
                System.out.println("[CALI] - Cálculo Integral.");
                System.out.println("[PROO] - Programación Orientada a Objetos.");
                System.out.println("[TEOC] - Teoría de la Computación.");
                System.out.println("[AROC] - Arquitectura y Organización de Computadoras.");
                break;
            case 4:
                System.out.println("[PROB] - Probabilidad.");
                System.out.println("[DISS] - Diseño de Software.");
                System.out.println("[ESTD] - Estructura de Datos.");
                System.out.println("[SISO] - Sistemas Operativos.");
                System.out.println("[TELP] - Teoría de Lenguajes de Programación.");
                break;
            case 5:
                System.out.println("[INFE] - Inferencia Estadistica.");
                System.out.println("[ARQS] - Arquitecturas de Software.");
                System.out.println("[CONS] - Construcción de Software.");
                System.out.println("[DIBD] - Diseño de Bases de Datos.");
                System.out.println("[DEAW] - Desarrollo de Aplicaciones Web.");
                break;
            case 6:
                System.out.println("[METS] - Métricas de Software.");
                System.out.println("[ASCS] - Aseguramiento de la Calidad del Software.");
                System.out.println("[REQS] - Requisitos de Software.");
                System.out.println("[INHC] - Interacción Humano Computadora.");
                break;
            case 7:
                System.out.println("[EXIS] - Experimentación en Ingeniería de Software.");
                System.out.println("[VEVS] - Verificación y Validación de Software.");
                System.out.println("[RESC] - Redes y Seguridad de Computadoras.");
                System.out.println("[INNT] - Innovación Tecnológica.");
                break;
            case 8:
                System.out.println("[ADPI] - Administración de Proyectos I.");
                System.out.println("[MANS] - Mantenimiento de Software.");
                System.out.println("[SISD] - Sistemas Distribuidos.");
                break;
            case 9:
                System.out.println("[APII] - Administración de Proyectos II");
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


