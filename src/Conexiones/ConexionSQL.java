/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Dina
 */
public class ConexionSQL {
    Connection Connection=null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection=DriverManager.getConnection("jdbc:mysql://localhost/Escuela","Dinavg","didi123");
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        }catch(Exception e){
		
	
            JOptionPane.showMessageDialog(null, "Error en la Conexion" );
	}
    return Connection;
    }
}