/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumnos {
    private ArrayList<Nota> alumnos;

    public Alumnos(ArrayList<Nota> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumnos() {
        alumnos = new ArrayList();
    }

    public ArrayList<Nota> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Nota> alumnos) {
        this.alumnos = alumnos;
    }
}
