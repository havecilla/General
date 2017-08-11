/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Java
 */
public class OrdernarSinLambda {
    
    public static void main(String[] args) {
        
        List<Persona> clientes = new ArrayList<Persona>();
        clientes.add(new Persona("Leticia"));
        clientes.add(new Persona("Alberto"));
        clientes.add(new Persona("Carlos"));
        clientes.add(new Persona("Jessica"));
        
        /*
        Collections.sort(clientes, new Comparator<Persona>() {
            @Override
            public int compare(Persona t, Persona t1) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                p1.nombre.compareTo(p2.nombre);
            }
        }
        */
        
        //ORDENA LISTA CON LAMBDA
        Collections.sort(clientes, (Persona p1, Persona p2) -> p1.nombre.compareTo(p2.nombre));
        
        //MUESTRA CLIENTES
        for (Persona cliente : clientes){
            System.out.println(cliente);
        }
        
        
   }
}