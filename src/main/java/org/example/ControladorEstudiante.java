package org.example;

import java.util.ArrayList;

public class ControladorEstudiante {
    ArrayList <Estudiante> estList;
    CatalogoEstudiante vista;
    Estudiante obj1;
    Asignatura asignatura;

    ControladorEstudiante (CatalogoEstudiante vista) {
        estList = new ArrayList<Estudiante>();
        this.vista = vista;
    }

    public void addEstudiante(){
        obj1 = new Estudiante(vista.solicitarMatricula(), vista.solicitarNombre(),
                vista.solicitarEdad(), vista.solicitarSemestre(), vista.solicitarFacultad(),
                vista.solicitarPromedio(), asignatura);
        estList.add(obj1);
    }

    public void menuEstudiantes(){
        int opcion = 0;
        while (opcion != 6){
            switch (vista.menu()){
                case 1:
                    addEstudiante();
                    break;
                case 2:
                    Integer aux = vista.solicitarMatricula();
                    vista.imprimeInfoBorrado(borrarEstudiante(aux));
                    break;
                case 3:
                    menuModificarEstudiante();
                    break;
                case 4:
                    vista.imprimirInfoTotal(estList);
                    break;
                case 5:
                    aux = vista.solicitarMatricula();
                    Integer pos = buscarEstudiante(aux);
                    vista.imprimirInfoEstudiante(estList.get(pos));
                    break;
                case 6:
                    opcion = 6;
                    break;
            }
        }
    }

    //MÉTODO PARA BUSCAR UN ESTUDIANTE POR MEDIO DE SU MATRÍCULA
    private Integer buscarEstudiante(Integer matricula) {
        for (int i = 0; i < estList.size(); i++){
            if (matricula.equals(estList.get(i).getMatricula())) {
                return i;
            }
        }
        return -1;
    }

    //MÉTODO PARA BORRAR UN ESTUDIANTE A RAÍZ DEL MÉTODO BUSCAR
    private boolean borrarEstudiante(Integer matricula) {
        Integer indiceEst = buscarEstudiante(matricula);
        if (indiceEst != -1) {
            estList.remove((int)indiceEst);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarNombreEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vista.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setNombre(vista.solicitarNombre());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarEdadEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vista.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setEdad(vista.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarPromedioEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vista.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setPromedio(vista.solicitarPromedio());
            return true;
        } else {
            return false;
        }
    }

    private void menuModificarEstudiante() {
        int opcion = 0;
        Integer auxMatricula = 0;
        boolean resultado;

        while (opcion != 4) {
            switch (vista.menuModificarEstudiante()) {
                case 1:
                    auxMatricula = vista.solicitarMatricula();
                    resultado = modificarNombreEstudiante(auxMatricula);
                    break;
                case 2:
                    auxMatricula = vista.solicitarMatricula();
                    resultado = modificarEdadEstudiante(auxMatricula);
                    break;
                case 3:
                    auxMatricula = vista.solicitarMatricula();
                    resultado = modificarPromedioEstudiante(auxMatricula);
                    break;
                case 4:
                    opcion = 4;
                    break;
            }
        }
    }

}
