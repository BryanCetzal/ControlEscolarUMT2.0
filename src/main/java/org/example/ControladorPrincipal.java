package org.example;

public class ControladorPrincipal {
    CatalogoPrincipal vista;
    CatalogoEstudiante vista1;
    CatalogoAsignatura vista2;
    CatalogoProfesor vista3;

    public void menu(){
        int opcion = 0;
        do{
            switch (vista.menuPrincipal()){
                case 1 :
                    vista1.menu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    opcion =  4;
                    break;
            }

        }while(opcion != 4);
    }
}
