package org.example;

public class ControladorPrincipal {
    CatalogoPrincipal vista;
    ControladorEstudiante vistaEst;
    ControladorAsignatura vistaAsig;
    ControladorProfesor vistaProf;

    ControladorPrincipal(CatalogoPrincipal vista, CatalogoEstudiante vistaEst, CatalogoAsignatura vistaAsig,
                         CatalogoProfesor vistaProf){
        this.vista = vista;
        this.vistaAsig = new ControladorAsignatura(vistaAsig);
        this.vistaEst = new ControladorEstudiante(vistaEst, this.vistaAsig);
        this.vistaProf= new ControladorProfesor(vistaProf);
    }

    public void menu(){
        int opcion = 0;
        do{
            switch (vista.menuPrincipal()){
                case 1 :
                    vistaEst.menuEstudiante();
                    break;
                case 2:
                    vistaAsig.menuAsignatura();
                    break;
                case 3:
                    vistaProf.MainMenuProfe();
                    break;
                case 4:
                    opcion =  4;
                    break;
            }

        }while(opcion != 4);
    }
}
