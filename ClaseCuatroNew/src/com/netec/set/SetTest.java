/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Java
 */
public class SetTest {
    
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        
        lista.add("A");
        lista.add("R");
        lista.add("S");
        lista.add("A");
        lista.add("A");
        lista.add("X");
        lista.add("Y");
        lista.add("Y");
        lista.add("H");
        lista.add("T");
      
        //MUESTRA ARREGLO SIN DUPLICADOS
        System.out.println("Muestra Lista sin Duplicados!!!");
        for (String list : lista) {
            System.out.println(list);
        }
    }
}
