/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.cliente;

import com.netec.personalexceptions.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Java
 */
public class MiExcepcion extends Exception{
    
    protected int code;
    protected String description;         
    protected Date date; 
    
    public MiExcepcion(int code, String description, Date date, String message){
        super(message);
        this.code = code;
        this.description = description;
        this.date = date;
    }
    
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        DateFormat fecha = new SimpleDateFormat("yyyymmdd hh:mm:ss");
        return fecha.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
