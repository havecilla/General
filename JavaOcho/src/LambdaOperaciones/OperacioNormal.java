/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaOperaciones;

/**
 *
 * @author Java
 */
public class OperacioNormal {
    public static void main(String[] args) {
        OperacioNormal test = new OperacioNormal();
        test.calcular();
    }
    
    public void calcular(){
        Operacion operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(18, 0));
    }
}
