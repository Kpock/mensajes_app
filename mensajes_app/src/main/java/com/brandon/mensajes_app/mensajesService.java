/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandon.mensajes_app;
import java.util.Scanner;

/**
 *
 * @author WPOSS
 */
public class mensajesService {
    
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }
    
    
    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }
    
    
    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    
    
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        
        Mensajes actualizacion = new Mensajes();
        actualizacion.setIdMensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
    
    
    
}
