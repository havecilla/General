/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.cliente;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Java
 */
public class SalsaBaile {
    
    public static boolean validarEntrar(String name, int edad) throws MiExcepcion{
        boolean esMayor = false;
        if (edad >= 18) {
            //System.out.println("Bienvenido " + name);
            //VENTANA DE MENSAJE DE JAVA
            JOptionPane.showMessageDialog(null, "Bienvenido " + name);
        } else {
            throw new MiExcepcion("Es requerido ser mayor de edad!!!");
        }
        return esMayor;
    }
    
    public static void main(String[] args) throws MiExcepcion{
        try {
            //SalsaBaile.validarEntrar("Hector Avecilla", 42);
            SalsaBaile.validarEntrar("Aram Avecilla", 16);
        } catch (MiExcepcion e) {
            //throw new MiExcepcion(500,"Ocurre cuando un menor de edad intenta entrar",new Date(),"Intenta entrar menor de edad");
            //VENTANA DE MENSAJE DE JAVA
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            //JOptionPane.showMessageDialog(null, "Error: " + e.getDate());
        }
    }
}
