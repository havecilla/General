/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.ordenar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Java
 */
public class TestOrden {
    
    public static void main(String[] args) {
        
        Alumno alumno1  = new Alumno("Felipe",25);
        Alumno alumno2  = new Alumno("Zenon",30);
        Alumno alumno3  = new Alumno("Alan",40);
        Alumno alumno4  = new Alumno("Gabriela",42);
        Alumno alumno5  = new Alumno("Federico",26);
        Alumno alumno6  = new Alumno("Filemon",11);
        Alumno alumno7  = new Alumno("Arturo",34);
        Alumno alumno8  = new Alumno("Ana",20);
        Alumno alumno9  = new Alumno("Alejandra",60);
        Alumno alumno10 = new Alumno("Xochitl",45);
        
        //NUEVO ARREGLO DE ALUMNOS
        ArrayList<Alumno> alumnos = new ArrayList();
        
        //ADICIONA DATOS AL ARREGLO
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
        alumnos.add(alumno9);
        alumnos.add(alumno10);
        
        System.out.println("Lista sin ordenar...");
        //System.out.println(alumnos);
        for (Alumno alumnoR1 : alumnos) {
            System.out.println(alumnoR1);
        }
        
        Collections.sort(alumnos);
        System.out.println("Lista ordenada!!!");
        //System.out.println(alumnos);
        for (Alumno alumnoR2 : alumnos) {
            System.out.println(alumnoR2);
        }        
    }
}
