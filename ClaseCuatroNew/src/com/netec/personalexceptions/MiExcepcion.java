/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.personalexceptions;

/**
 *
 * @author Java
 */
public class MiExcepcion extends Exception{
    
    //MiExcepcion miExcepcion = new MiExcepcion();

    public MiExcepcion(String string) {
        super(string);
    }

    public MiExcepcion(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MiExcepcion(Throwable thrwbl) {
        super(thrwbl);
    }

    public MiExcepcion(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
