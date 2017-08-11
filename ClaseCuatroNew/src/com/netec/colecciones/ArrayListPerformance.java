/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class ArrayListPerformance {
    
    public static void main(String[] args) {
        
        long ini1 = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<Integer>();
        // LLENAR ARREGLO CON NUMEROS
        for (int i = 0; i < 10000000; i++) {
            lista.add(i);
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("Ini 1: " + ini1);
        System.out.println("Fin 1: " + fin1);
        
        ////////////////////////////////////////////////
        ////////////////////////////////////////////////
        ///////////////////////////////////////////////
        
        long ini2 = System.currentTimeMillis();
        List<Integer> lista2 = new ArrayList<Integer>(10000000);
        // LLENAR ARREGLO CON NUMEROS
        for (int i = 0; i < 10000000; i++) {
            lista2.add(i);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Ini 2: " + ini2);
        System.out.println("Fin 2: " + fin2);

        ////////////////////////////////////////////////
        ////////////////////////////////////////////////
        ///////////////////////////////////////////////
        
        /*
        long ini3 = System.currentTimeMillis();
        String nombres = new String("name");
        // LLENAR ARREGLO CON NUMEROS
        for (int i = 0; i < 10000000; i++) {
            nombres += "HAS";
        }
        long fin3 = System.currentTimeMillis();
        System.out.println("Ini 3: " + ini3);
        System.out.println("Fin 3: " + fin3);
        */
        
        ////////////////////////////////////////////////
        ////////////////////////////////////////////////
        ///////////////////////////////////////////////
        
        /*
        long ini4 = System.currentTimeMillis();
        StringBuilder nombres2 = new StringBuilder();
        //String nombres2 = new String("name");
        // LLENAR ARREGLO CON NUMEROS
        for (int i = 0; i < 10000000; i++) {
            nombres2.append("has").append(","); 
        }
        long fin4 = System.currentTimeMillis();
        System.out.println("Ini 4: " + ini4);
        System.out.println("Fin 4: " + fin4);
        */
    }
    
    
}
