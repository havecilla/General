/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.archivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Java
 */
public class Folders {
    
    public static void main(String[] args) throws IOException {
        
        //CREACION DE DIRECTORIO Y ARCHIVO
        File aDirectorio = new File("Electronica");
        aDirectorio.mkdir();
        File file = new File("Electronica","Ventas20170810.txt");
        file.createNewFile();
        
    }
    
    
}
