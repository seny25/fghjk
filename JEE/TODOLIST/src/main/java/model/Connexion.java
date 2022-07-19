package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	  private static Connection con;
	    static String DR = "org.postgresql.Driver";
	    static String url = "jdbc:postgresql://localhost/FORMATION";
	    static String user = "postgres";
	    static String pass = "1234";
	    //private constructor
	    
	    static
	    {

	        try {
	            Class.forName(DR);
	            con = DriverManager.getConnection(url, user, pass);
	            System.out.println("Je suis dans la base de donnée");
	        }
	        catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public static Connection getConnection()
	    {

	        return con;
	    }

}