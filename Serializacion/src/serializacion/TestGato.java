/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.in;

/**
 *
 * @author Java
 */
public class TestGato {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Gato benito = new Gato();
        benito.nombre = "Don Gato";
        benito.raza   = "Angora";
        
        /*
        //SERIALIZAR
        try {
            FileOutputStream fs = new FileOutputStream("testSerTres.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(benito);
            os.close();
        } catch (IOException e) {
        }
        */
        
        
        //DESERIALIZAR
        FileInputStream fi = new FileInputStream("testSerTres.ser");
        ObjectInputStream obj = new ObjectInputStream(fi);
        Gato nuevoGato = (Gato)obj.readObject();
        obj.close();
        System.out.println(nuevoGato);
        
    }
}
