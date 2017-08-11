/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.clasecuatro;

/**
 *
 * @author Java
 */
public class accesoDao {
    
    
    public void conectarBase() throws Exception{
       try{
           System.out.println("Intentando Conectar");
           throw new Exception("Url incorrecta...");
       } catch(Exception e){
         throw new Exception(e);
       }        
    }
    
    
}
