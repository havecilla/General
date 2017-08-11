/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosencapsulacion;


/**
 *
 * @author Java
 */
public class Empleado {
    
    private String nombre;
    private int edad;

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
        /*
        if(edad < 0 ){
           System.out.println("Edad NO Permitida, debe ser mayor a cero.");
        }else if (edad > 100){
           System.out.println("Edad NO Permitida, debe ser menor a 100."); 
        }else {
        this.edad = edad;
        }
        */
        
        if(edad < 0 || edad >= 100){
           System.out.println("Edad NO Permitida!!!");
        }        
        
        
    }
    
    
}
