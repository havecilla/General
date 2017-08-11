/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.ordenar;

/**
 *
 * @author Java
 */
public class Alumno implements Comparable<Alumno>{
    
    String nombre;
    int edad;

    //CONSTRUCTOR
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Alumno t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //ORDENA POR NOMBRE
        //return nombre.compareTo(t.nombre);
        
        //ORDENA POR EDAD
        String a = String.valueOf(this.edad) + this.nombre;
        String b = String.valueOf(t.getEdad()) + t.getNombre();
        return a.compareTo(b);
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + "}";
    }
    
}
