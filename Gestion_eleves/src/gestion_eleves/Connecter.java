/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_eleves;

import java.sql.*;
/**
 *
 * @author Abdourahmane
 */
public class Connecter {
    Connection con;
    public Connecter(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e) {
            System.err.println(e); 
            // Pour afficher l'erreur
        }
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eleve","root","");
        }catch(SQLException e) {System.err.println(e);}
        
    }
    Connection Obtenirconnexion(){return con;}
}
