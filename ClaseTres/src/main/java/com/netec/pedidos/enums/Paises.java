/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos.enums;

/**
 *
 * @author Java
 */
public enum Paises {
    
    MEXICO(0.16F),
    ESPANA(0.20F),
    ARGENTINA(0.29F);
    
    private float iva;
    
    private Paises(float iva){
        this.iva = iva;
    }
    
    public float getIva(){
        return iva;
    }
    
    public float setIva(){
        this.iva = iva;
        return 0;
    }
    
}
