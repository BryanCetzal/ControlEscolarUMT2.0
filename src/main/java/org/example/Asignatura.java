package org.example;
public class Asignatura {
    private String nombreAsig;
    private Integer semestre;
    private Integer creditos;

    public Asignatura(){
        this.nombreAsig = "UMT";
        this.semestre = 0;
        this.creditos = 0;
    }

    public Asignatura(String nombreAsig, Integer semestre, Integer creditos) {
        this.nombreAsig = nombreAsig;
        this.semestre = semestre;
        this.creditos = creditos;
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

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombreAsig='" + nombreAsig + '\'' +
                ", semestre=" + semestre +
                ", creditos=" + creditos +
                '}';
    }
}
