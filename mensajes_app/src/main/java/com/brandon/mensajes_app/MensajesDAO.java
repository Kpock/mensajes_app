/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandon.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author WPOSS
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion dbConnect = new Conexion();
        
        try(Connection conexion = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try{
               String query = "INSERT INTO mensajes_app (mensaje, autor_mensaje) VALUES (?, ?)";
               ps = conexion.prepareStatement(query);
               ps.setString(1, mensaje.getMensaje());
               ps.setString(2, mensaje.getAutorMensaje());
               ps.executeUpdate();
               System.out.println("Mensaje creado");
               
            } catch(SQLException ex) {
                System.out.println(ex);
            }
            
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void leerMensajesDB() {
        
    }
    
    public static void borrarMensajeDB(int idMensaje) {
        
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje) {
        
    }
    
    
}
