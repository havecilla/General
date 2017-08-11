/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Java
 */
public class Herramientas {
    
    public static Date getFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd"); 
       
        String strFecha = fecha;
        Date fechaDate = null;
        
        try{
            fechaDate = formato.parse(strFecha);
            return fechaDate;
        } catch(ParseException e) {
            return fechaDate;
        }
    }

    private SimpleDateFormat SimpleDateFormat(String ddmmyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
