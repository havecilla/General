/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.abstractClass;

import java.util.Calendar;

/**
 *
 * @author Java
 */
public class Casa {
     
    public static void main(String[] args) {
        Electrodomestico television = new Electrodomestico() {
            @Override
            public void encender() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void apagar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
}
