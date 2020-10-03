/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    static Scanner lee = new Scanner(System.in);
    static Scanner leer = new Scanner(System.in);
    Alumnos alum = alumnos();

    public static void main(String[] args) {
        Alumnos alum = alumnos();
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar alumnos y notas");
            System.out.println("2. ver datos");
            System.out.println("3. salir");

            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    limpiar();
                    alum.getAlumnos().add(datos());
                    limpiar();
                    break;
                case 2:
                    limpiar();
                    mostrardatos(alum.getAlumnos());
                    limpiar();
                    break;
            }
        } while (opcion != 3);

    }

    static void mostrardatos(ArrayList<Nota> alumnos) {
        System.out.println("Los datos guardados son ");
        System.out.println("Numero de alumo \t Nombre \t Numero de carnet\tNota parcial 1\t\tNota parcial 2\t\tNota de zona");
        int d = 1;
        for (Nota alumno : alumnos) {
            System.out.println(d+"\t\t\t "+alumno.getNombre()+"  \t\t "+alumno.getCarnet()+"\t\t\t"+alumno.getNota1()+"\t\t\t"+alumno.getNota2()+"\t\t\t"+alumno.getZona());
            d++;

        }
    }

    static Alumnos alumnos() {

        return new Alumnos(new ArrayList());

    }

    static Nota datos() {
        return new Nota(nombre(), carnet(), nota1(), nota2(), zona());
    }

    static String nombre() {
        System.out.println("Ingrese nombre ");
        return lee.nextLine();
    }

    static int carnet() {
        System.out.println("Ingrese carnet ");
        return leer.nextInt();
    }

    static int nota1() {
        System.out.println("Ingrese nota de parcial 1 ");
        return leer.nextInt();
    }

    static int nota2() {
        System.out.println("Ingrese nota de parcial 2 ");
        return leer.nextInt();
    }

    static int zona() {
        System.out.println("Ingrese zona total  ");
        return leer.nextInt();
    }

    private static void limpiar() {
        int lineas = 3;
        for (int i = 0; i < lineas; i++) {
            System.out.println();
        }
    }

}
