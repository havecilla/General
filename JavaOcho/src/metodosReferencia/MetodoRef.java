/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosReferencia;

import java.util.Arrays;

/**
 *
 * @author Java
 */
public class MetodoRef {

    public static void main(String[] args) {
       MetodoRef.refernciarMetodosObjetos();
    }
    
    public static void refernciarMetodosObjetos(){
        
        String[] nombres = {"Armando", "Zaori", "Gerardo"};
    
        //LAMBDA
        //Arrays.sort(nombres, (s1, s2) -> s1.compareTo(s2));
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(nombres);
    }
    
    public void refernciarMetodosParticular(){
        
    }    
    
    public void refernciarConstructor(){
        IPersona ip = Persona::new;
        Persona per = ip.crear(1, "Hector Avecilla");
    }
   

}
