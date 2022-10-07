package org.example;
public class Profesor {
    //ATRIBUTOS
    private String nomProfe;
    private String materia;
    private Integer edadProfe;
    private String facultadProfe;
    private Integer claveProfe;

    //CONSTRUCTOR 1
    public Profesor(){
        setNomProfe("N/A");
        setMateria("N/A");
        setEdadProfe(0);
        setFacultadProfe("N/A");
        setClaveProfe(0);
    }

    //CONSTRUCTOR 2
    public Profesor(String nomProfe, String materia, Integer edadProfe, String facultadProfe, Integer claveProfe){
        this.nomProfe = nomProfe;
        this.materia = materia;
        this.edadProfe = edadProfe;
        this.facultadProfe = facultadProfe;
        this.claveProfe = claveProfe;
    }

    //SETTERS AND GETTERS
    public void setNomProfe(String nomProfe){ this.nomProfe = nomProfe;}
        public String getNomProfe(){ return nomProfe; }
    public void setMateria(String materia){ this.materia = materia; }
        public String getMateria(){ return materia; }
    public void setEdadProfe(Integer edadProfe) {this.edadProfe = edadProfe; }
        public Integer getEdadProfe(){ return edadProfe; }
    public void setFacultadProfe(String facultadProfe) { this.facultadProfe = facultadProfe; }
        public String getFacultadProfe(){ return facultadProfe; }
    public void setClaveProfe(Integer claveProfe) { this.claveProfe = claveProfe; }
        public Integer getClaveProfe(){ return claveProfe; }

    //TOSTRING
    @Override
    public String toString() {
        return "Profesor{" +
                "NomProfe='" + nomProfe + '\'' +
                ", Materia='" + materia + '\'' +
                ", FacultadProfe='" + facultadProfe + '\'' +
                ", EdadProfe=" + edadProfe +
                ", ClaveProfe=" + claveProfe +
                '}';
    }
}
