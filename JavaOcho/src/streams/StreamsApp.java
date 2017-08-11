/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class StreamsApp {
    
    private List<String> lista;
    private List<Integer> numeros;

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Jaqueline");
        lista.add("Juvenal");
        lista.add("Julian");
        lista.add("Eduardo");
        lista.add("Hortensia");
        lista.add("Hector");
        lista.add("Hernan");

        numeros = new ArrayList<>();
        numeros.add(32);
        numeros.add(53);
        numeros.add(40);
        numeros.add(5);
        numeros.add(22);
        numeros.add(11);
        numeros.add(43);
        numeros.add(4);
    }
    
    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("H")).forEach(System.out::println);
    }

    public void ordenar(){
        //lista.stream().sorted((x,y) -> x.compareTo(y)).forEach(System.out::println);
        //numeros.stream().sorted((x,y) -> x.compareTo(y)).forEach(System.out::println);
        numeros.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        StreamsApp streams = new StreamsApp();
        streams.ordenar();
        streams.filtrar();
    }
    
}
