/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.Serializable;

/**
 *
 * @author Java
 */
public class Gato implements Serializable{
    
    public static final long serialVersionID = 121212;

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    public String nombre;
    public String raza;    
}
