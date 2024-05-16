/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import model.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Categoria;
/**
 *
 * @author sebas
 */
public class DaoCategoria {
    
    Connection conection;
    Conexion conexion = new Conexion();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public boolean insertar(Categoria categorias){
        String sql = "INSERT INTO categorias (categoria) VALUES (?)";
        try {
            
            conection = conexion.conectar();
            preparedStatement = conection.prepareStatement(sql);
            preparedStatement.setString(1, categorias.getNombreCategoria());
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
