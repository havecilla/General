/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Java
 */
public class DoctorDaoImpl extends Dao implements DoctorDao{

    private final String crearSql = "INSERT INTO DOCTOR(CODIGO,NOMBRE,APELLIDO,ESPECIALIDAD) VALUES(?,?,?,?)";
    
    @Override
    public void crearDoctor(Doctor doctor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.Conectar();
        try {
        PreparedStatement pst = this.getConnection().prepareStatement(crearSql);
        pst.setInt(1,doctor.getCodigo());
        pst.setString(2,doctor.getNombre());
        pst.setString(3,doctor.getApellido());
        pst.setString(4,doctor.getEspecialidad());
        
        pst.executeUpdate();
    }catch(SQLException e){
    } finally {
            
        }
    }
    
    @Override
    public void eliminarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> ListarDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void cerrarConexion() throws SQLException{
        if (connection != null){
            if (!connection.isClosed()){
                connection.close();
            }
        }
    }
    
    
}

