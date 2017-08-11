/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Java
 */
public class HasMapTest {
    
    public static void main(String[] args) {
        
        Map<Integer, String> diccionario = new HashMap<>();
        
        diccionario.put(20, "ID");
        diccionario.put(30, "NAME");
        diccionario.put(40, "LASTNAME");
        
        System.out.println("Tamaño de Map: " + diccionario.size());
        
        //BARRE EL MAP
        diccionario.entrySet().forEach((e) -> {
            System.out.println(e.getKey() + " - " + e.getValue());
        });
    }
}
