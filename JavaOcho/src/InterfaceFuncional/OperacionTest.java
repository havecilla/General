/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceFuncional;

/**
 *
 * @author Java
 */
public class OperacionTest {
    
    public static void main(String[] args) {
        //double salida = OperacionTest.operar(75, 25);
        OperacionTest ot = new OperacionTest();
        double salida = ot.operar(75, 25);
        System.out.println("Valor obtenido: " + salida);
    }
    
    //public static double operar(double x, double y){
    public double operar(double x, double y){
        Operacion op = (double n1, double n2) -> (n1 + n2);
        return op.calcular(x, y);
    }
    
}
