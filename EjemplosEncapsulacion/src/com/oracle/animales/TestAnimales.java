/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.animales;

/**
 *
 * @author Java
 */

class Animal{
    String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    Animal reproducirse(Animal a){
        Animal hijo = new Animal(nombre);
        return hijo;
    }
}

class Gato extends Animal {
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a){
        //return super.reproducirse(a); //To change body of generated methods, choose Tools | Templates.
        if ( !(a instanceof Gato)){
           System.out.println("No se puede reproducir");
        }
        Gato gato = new Gato("Gato bebe");
        return gato;
    }
       
}

class Perro extends Animal{
    
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    Animal reproducirse(Animal a) {
        //return super.reproducirse(a); //To change body of generated methods, choose Tools | Templates.
        return new Animal("Soy un perro");
    }
       
}

public class TestAnimales {
    
    public static void main(String[] args) {
        Perro p = new Perro("Scooby Doo");
        Gato g = new Gato("Benito Bodoque");
        System.out.println("Nuevo hijo: " + g.reproducirse(p));
    }
           
}

