/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Usuario
 */
public class Nota {
    private String nombre;
    
    private int carnet;
    private int nota1;
    private int nota2;
    private int zona;


    public Nota() {

    }

    public Nota(String nombre, int carnet, int nota1, int nota2, int zona ) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.zona = zona;

    }

    
    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getZona() {
        return zona;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    
    public void limpiar() {
        int lineas = 3;
        for (int i = 0; i < lineas; i++) {
            System.out.println();
        }
    }
}
