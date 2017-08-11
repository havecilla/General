/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Java
 */
public class Archivos2 {
    
    public static void main(String[] args) {
        File file = new File("archivo2.txt");
        try {
           
           //WRITER 
           FileWriter fw = new FileWriter(file);
           PrintWriter pw = new PrintWriter(file);
           pw.println("Producto: Lavadora");
           pw.println("Precio: 10000");
           pw.flush();
           pw.close();
           
           //READER
           FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
        } catch (IOException e) {
        }
        
    }
    
}
