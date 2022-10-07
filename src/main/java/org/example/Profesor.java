package org.example;
public class Profesor {
    //ATRIBUTOS
    private String NomProfe, Materia, FacultadProfe;
    private Integer EdadProfe, ClaveProfe;

    //CONSTRUCTOR 1
    public Profesor(){
        setNomProfe("N/A");
        setMateria("N/A");
        setEdadProfe(0);
        setFacultadProfe("N/A");
        setClaveProfe(0);
    }

    //CONSTRUCTOR 2
    public Profesor(String NomProfe, String Materia, Integer EdadProfe, String FacultadProfe, Integer ClaveProfe){
        this.NomProfe = NomProfe;
        this.Materia = Materia;
        this.EdadProfe = EdadProfe;
        this.FacultadProfe = FacultadProfe;
        this.ClaveProfe = ClaveProfe;
    }

    //SETTERS AND GETTERS
    public void setNomProfe(String NomProfe){ this.NomProfe = NomProfe;}
        public String getNomProfe(){ return NomProfe; }
    public void setMateria(String Materia){ this.Materia = Materia; }
        public String getMateria(){ return Materia; }
    public void setEdadProfe(Integer EdadProfe) { this.EdadProfe = EdadProfe; }
        public Integer getEdadProfe(){ return EdadProfe; }
    public void setFacultadProfe(String FacultadProfe) { this.FacultadProfe = FacultadProfe; }
        public String getFacultadProfe(){ return FacultadProfe; }
    public void setClaveProfe(Integer ClaveProfe) { this.ClaveProfe = ClaveProfe; }
        public Integer getClaveProfe(){ return ClaveProfe; }

    //TOSTRING


    @Override
    public String toString() {
        return "Profesor{" +
                "NomProfe='" + NomProfe + '\'' +
                ", Materia='" + Materia + '\'' +
                ", FacultadProfe='" + FacultadProfe + '\'' +
                ", EdadProfe=" + EdadProfe +
                ", ClaveProfe=" + ClaveProfe +
                '}';
    }
}
