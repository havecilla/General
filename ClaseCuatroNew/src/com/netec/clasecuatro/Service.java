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
public class Service {
    
    public static void main(String[] args) {
        try {
            Service.conectarOracle("url:Oracle");
        } catch (Exception e) {
            System.out.println("Ocurrio una exception...");
        }
    }
    
    public static void conectarOracle(String a) throws Exception {
        accesoDao dao = new accesoDao();
        dao.conectarBase();
               
    }
    
}
