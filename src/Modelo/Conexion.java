package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

   private final String BBDD = "farmacia1";
    private final String PUERTO = "3306";
    private final String SERVIDORBD = "localhost";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String URL = "jdbc:mysql://" + SERVIDORBD + ":" + PUERTO + "/" + BBDD;
                        //URL="jdbc:mysql://localhost:3306/contable";
    private Connection con = null;
    //Connection con;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
        }catch(SQLException e){
            //System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al Conectarse a la BBDD: " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
