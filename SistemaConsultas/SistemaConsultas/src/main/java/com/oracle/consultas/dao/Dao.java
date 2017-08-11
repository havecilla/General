/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Java
 */
public class Dao {
    Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void Conectar(){
        String url = "jdbc:derby://localhost:1527/";
        String dbName = "Consultas";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName = "root";
        String password = "root";    
    try{
        Class.forName(driver).newInstance();
        connection = DriverManager.getConnection(url+dbName, userName, password);
        System.out.println("Conexion exitosa!!!");
    } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
        if (e instanceof SQLException){
        System.out.println("Conexion NO exitosa");
        }
    }
        
    }
    
  
}
