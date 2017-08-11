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
public class Clase4 {
 
    public static void main(String[] args) {
        String[] nombres = {"Juan","Jose","Maria"};
        int a = 5;
        int b = 0;
       
        try{
            // DIVISION BY ZERO
            int division = a/b;
            
            // ARRAY EXCEPTION
            for (int x=0; x<=3; x++){
            System.out.println(nombres[x]);
            }
        /*    
        }catch(ArithmeticException e){
            System.out.println("Falla division by zero...");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Falla en arreglo...");
            //System.out.println("-------------------");
            //System.out.println(e.getMessage());
            //System.out.println(e.getCause());
            //e.printStackTrace();
            //System.out.println("-------------------");
        }catch(Exception e){
            System.out.println("Exception de mayor jerarquia");
        }finally{
            System.out.println("*Exception Final.");
            System.out.println("*Cerrando Proceso...");
        }
        */
        //MULTICATCH A PARTIR DE JAVA 7
        //AGRUPAS EXCEPCIONES
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            //Instanciamos la exception
            if(e instanceof RuntimeException){
              System.out.println("Multiples Exceptions tratadas de la misma forma");    
            }
        }catch(Exception e){
            System.out.println("Exception de mayor jerarquia");
        }finally{
            System.out.println("*Exception Final.");
            System.out.println("*Cerrando Recurso...");
        }
        
    }
    
}
