package controller;

/**
 *
 * @author sebas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conexion;
import model.Usuarios;

public class DaoUsuario {
    Connection con;
    Conexion cn = new Conexion();
    
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuarios login(String usuario, String contrasena){
        Usuarios us = new Usuarios();
        String sql = "SELECT * FROM usuarios WHERE usuario = '"+usuario+"' and contrasena ='"+contrasena+"'";
        
        try { 
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                us.setId_usuario(rs.getInt(1));
                us.setNombre(rs.getString(2));
                us.setApellido(rs.getString(3));
                us.setTelefono(rs.getString(4));
                us.setCorreo(rs.getString(5));
                us.setRol(rs.getString(6));
                us.setUsuario(rs.getString(7));
                us.setContrasena(rs.getString(8));
                us.setDocumento(rs.getString(9));
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return us;
    }
}