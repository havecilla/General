/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.statictest;

import com.netec.util.Herramientas;
import com.sun.org.apache.xerces.internal.xs.PSVIProvider;
import java.util.Date;

/**
 *
 * @author Java
 */
public class TestStatic {
    
    /*
    public static void main(String[] args) {
        
        //Herramientas herramientas = new Herramientas();
        Date fecha = Herramientas.getFecha("2017/23/11");
        System.out.println("::: " + fecha);
        
    }
    */
    
    private static final boolean [] switches = new boolean[5];
    
    public static void main(String[] args) {
        switches[1] = false;
        switches[2] = false;
        
        for (boolean swit:switches){
            System.out.println("swit");
        }
    }
}
