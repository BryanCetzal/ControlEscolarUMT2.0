package org.example;

public class Estudiante {
    private Integer matricula;
    private String nombre;
    private Integer edad;
    private Integer semestre;
    private String facultad;
    private Double promedio;
    private Asignatura asignatura;

    public Estudiante(){
        this.matricula = 0;
        this.nombre = "S/N";
        this.edad = 0;
        this.semestre = 1;
        this.facultad = "UADY";
        this.promedio = 0.0;
        this.asignatura = asignatura;
    }

    public Estudiante(Integer matricula, String nombre, Integer edad, Integer semestre,
                      String facultad, Double promedio, Asignatura asignatura) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.facultad = facultad;
        this.promedio = promedio;
        this.asignatura = asignatura;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", facultad='" + facultad + '\'' +
                ", promedio=" + promedio +
                ", asignatura=" + asignatura +
                '}';
    }
}
