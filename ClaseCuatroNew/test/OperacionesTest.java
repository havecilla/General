/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.netec.operaciones.Operaciones;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java
 */
public class OperacionesTest {
    
    @Test
    public void testOperaciones(){
        Operaciones op = new Operaciones();
        
        //Suma
        //int resultadoSuma = op.sumar(5, 4);
        //Assert.assertEquals(9, resultadoSuma);
        
        //Resta
        int resultadoResta = op.restar(10, 5);
        System.out.println("Resta= " + resultadoResta);
        Assert.assertEquals(1, resultadoResta);
        
    }
    
}
