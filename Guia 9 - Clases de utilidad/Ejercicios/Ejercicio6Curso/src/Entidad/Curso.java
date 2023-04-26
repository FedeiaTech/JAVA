/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author iacon
 */
public class Curso {
    private String nombreCurso, turno;
    private String[] alumnos;
    private int cantidadHoras, vecesSemana, precioPorHora;

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, String[] alumnos, int cantidadHoras, int vecesSemana, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.alumnos = alumnos;
        this.cantidadHoras = cantidadHoras;
        this.vecesSemana = vecesSemana;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getVecesSemana() {
        return vecesSemana;
    }

    public void setVecesSemana(int vecesSemana) {
        this.vecesSemana = vecesSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    
}


