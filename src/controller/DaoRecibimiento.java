/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Conexion;
import model.Recibimientos;


public class DaoRecibimiento {
    Connection conection;
    Conexion conexion = new Conexion();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public boolean insertar(Recibimientos recibimiento){
        
        String sql = "INSERT INTO recibimiento (nombre_producto, stock, id_categoria, fecha, id_proveedor, precio_recibimiento, precio_venta, total) VALUES (?, ?, ? ,? ,? ,?, ?, ?)";
        try {
            
            conection = conexion.conectar();
            
            preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setString(1, recibimiento.getNombre_producto());
            preparedStatement.setInt(2, recibimiento.getStock());
            preparedStatement.setInt(3, recibimiento.getId_categoria());
            preparedStatement.setDate(4, recibimiento.getFecha());
            preparedStatement.setInt(5, recibimiento.getId_proveedor());
            preparedStatement.setDouble(6, recibimiento.getPrecio_recibimiento());
            preparedStatement.setDouble(7, recibimiento.getPrecio_venta());
            preparedStatement.setDouble(8, recibimiento.getTotal());
                                                
            int number = preparedStatement.executeUpdate();
            
            if(number != 0){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
