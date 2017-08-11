/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Java
 */
public class Archivos {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("RegistroHavecilla.txt");
        char[] in = new char[50];
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Se creo exitosamente continua el trabajo...");
                } else {
                    System.out.println("No se creo el archivo...");
                }
            } catch (IOException e) {
            }
        } else {
            System.out.println("El archivo ya existe...");
        }
        
        //ESCRIBIR A ARCHIVO
        
        FileWriter fw = new FileWriter(file);
        fw.write("Articulo: Televisión \n Precio: 5000");
        fw.write("Articulo: Bluray \n Precio: 2000");
        fw.write("Articulo: Tablet \n Precio: 4000");
        fw.write("Articulo: Celular \n Precio: 7000");
        System.out.println("Registros insertados...");
        fw.flush();
        fw.close();
        
        
        //LEER DESDE ARCHIVO
        /*
        FileReader fr = new FileReader(file);
        int size = fr.read();
        System.out.println("Tamaño: " + size);       
        */
    }
    
}
