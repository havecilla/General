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
public class Test1 {
    
    public static void main(String[] args) {
        
        //DIVISION BY ZERO
        //int a = 5;
        //int b = 0;
        //int division = a/b;
        
        String[] nombres = {"Juan","Jose","Maria","Pedro","Lucas"};
        try{
            for (int x=0; x<=6; x++){
            System.out.println(nombres[x]);
            }
        }catch(Exception e){
            System.out.println("Falla en arreglo...");
            System.out.println("-------------------");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("-------------------");
        }
          System.out.println("Continua...");
    }    
    
}
