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
                    Integer aux = vista.SolicitarClaveProfe();
                    vista.imprimeInfoBorrado(borrarProfesor(aux));
                    break;
                case 3:
                    menuModificarProfesor();
                    break;
                case 4:
                    vista.imprimirInfoTotal(profList);
                    break;
                case 5:
                    aux = vista.SolicitarClaveProfe();
                    Integer pos = buscarProfesor(aux);
                    vista.imprimirInfoProfesor(profList.get(pos));
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
    public boolean ModiNomProfe(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.ImprimirInfoProfe(profList.get(indiceProfesor));
            profList.get(indiceProfesor).setNomProfe(vista.SolicitarNomProfe());
            return true;
        } else {
            return false;
        }
    }
    public boolean ModiEdadProfe(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.ImprimirInfoProfe(profList.get(indiceProfesor));
            profList.get(indiceProfesor).setEdadProfe(vista.SolicitarEdadProfe());
            return true;
        } else {
            return false;
        }
    }

    public boolean ModiFacuProfe(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.ImprimirInfoProfe(profList.get(indiceProfesor));
            profList.get(indiceProfesor).setFacultadProfe(vista.SolicitarFacultadProfe());
            return true;
        } else {
            return false;
        }
    }

    public boolean ModiMateProfe(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.ImprimirInfoProfe(profList.get(indiceProfesor));
            profList.get(indiceProfesor).setMateria(vista.SolicitarMateria());
            return true;
        } else {
            return false;
        }
    }

    private void menuModificarProfesor() {
        Integer opcion = 0;
        Integer ClaveAux = 0;
        boolean resultado;

        while (opcion != 5) {
            switch (vista.MenuModificarProfe()) {
                case 1:
                    ClaveAux = vista.SolicitarClaveProfe();
                    resultado = ModiNomProfe(ClaveAux);
                    System.out.println("Cambio exitoso.");
                    break;
                case 2:
                    ClaveAux = vista.SolicitarClaveProfe();
                    resultado = ModiEdadProfe(ClaveAux);
                    System.out.println("Cambio exitoso.");
                    break;
                case 3:
                    ClaveAux = vista.SolicitarClaveProfe();
                    resultado = ModiFacuProfe(ClaveAux);
                    System.out.println("Cambio exitoso.");
                    break;
                case 4:
                    ClaveAux = vista.SolicitarClaveProfe();
                    resultado = ModiMateProfe(ClaveAux);
                    System.out.println("Cambio exitoso.");
                    break;
                case 5:
                    opcion = 5;
                    break;
            }
        }
    }
}
