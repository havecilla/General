/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosReferencia;

/**
 *
 * @author Java
 */
public class Persona {
    
    public int id;
    public String nombre; 

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Persona{" + "id= " + id + "nombre= " + nombre; 
    }

}

