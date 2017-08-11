/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.abstractClass;

/**
 *
 * @author Java
 */
public class Television extends LineaBlanca{
    
    public ControlRemotoUniversal controlRemoto;
    
    @Override
    public void tareaDomestica(){
        System.out.println("Ver Netflix");  
    }
    
    @Override
    public void encender(){
        System.out.println("Encender como television");
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagar como television");
    }
    
}
