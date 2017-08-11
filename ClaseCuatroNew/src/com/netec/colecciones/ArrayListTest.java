/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.colecciones;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author Java
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        
        /*
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(19);
        arrayList.add(20);
        */
        
        // LLENAR ARREGLO CON NUMEROS
        for (int i = 1; i < 11; i++) {
            arrayList.add(i);
        }
        
        //RECORRER UN ARREGLO
        for (Integer integer : arrayList) {
            //System.out.println(arrayList);
        }
        
        int numero = 50;
        int numElementos = arrayList.size();
        boolean contiene = arrayList.contains(numero);
        
        System.out.println("¿Cuantos elementos contiene?, R = " + numElementos);
        System.out.println("¿Contiene el numero " + numero + "?, R = " + ((contiene==true)?"Si":"No"));
        
    }
    
}
