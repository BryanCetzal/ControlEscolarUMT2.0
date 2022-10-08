package org.example;
public class Asignatura {
    private String nombreAsig;
    private Integer semestre;
    private Integer creditos;
    private Integer clave;

    public Asignatura(){
        this.nombreAsig = "UMT";
        this.semestre = 0;
        this.creditos = 0;
        this.clave = 0;
    }

    public Asignatura(String nombreAsig, Integer semestre, Integer creditos, Integer clave) {
        this.nombreAsig = nombreAsig;
        this.semestre = semestre;
        this.creditos = creditos;
        this.clave = clave;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return nombreAsig +
                ", semestre =" + " "+ semestre +
                ", creditos =" + " "+ creditos +
                ", clave =" + " "+ clave;
    }
}
