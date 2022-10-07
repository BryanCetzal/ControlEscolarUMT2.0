package org.example;
import java.util.ArrayList;

public class ControladorProfesor {
    ArrayList<Profesor> profList;
    CatalogoProfesor vista;
    Profesor obj1;

    ControladorProfesor(CatalogoProfesor vista){
        profList = new ArrayList<Profesor>();
        this.vista = vista;
    }
    public void addProfesor(){
        obj1 = new Profesor(vista.SolicitarNomProfe(),
                vista.SolicitarMateria(),
                vista.SolicitarEdadProfe(),
                vista.SolicitarFacultadProfe(),
                vista.SolicitarClaveProfe());
        profList.add(obj1);
    }
    public void MainMenuProfe(){
        int opcion = 0;
        while (opcion != 6){
            switch (vista.MenuProfe()){
                case 1:
                    addProfesor();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    opcion = 6;
                    System.out.println("Saliendo del sistema...");
                    break;

            }
        }
    }
    private Integer buscarProfesor(Integer clave) {
        for (int i = 0; i < profList.size(); i++){
            if (clave == profList.get(i).getClaveProfe()) {
                return i;
            }
        }
        return -1;
    }
    private boolean borrarProfesor(Integer clave) {
        Integer indiceEst = buscarProfesor(clave);
        if (indiceEst != -1) {
            profList.remove((int)indiceEst);
            return true;
        } else {
            return false;
        }
    }
    public boolean modificarNombreProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.imprimirInfoProfe(profList.get(indiceProfesor));
            profList.get(indiceProfesor).setNomProfe(vista.SolicitarNomProfe());
            return true;
        } else {
            return false;
        }
    }
}
