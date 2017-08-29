package com.cg.playBook1.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayBookUtil {
	
	ResultSet rs=null;
	PreparedStatement pst=null;
public static Connection getConnection(){
	Connection con=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		con = DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/PlayBook","root","Singh7964#");
		System.out.println("Connection Established");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
	}
	return con;
	

}
}
