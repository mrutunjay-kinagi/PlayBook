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
		Class.forName("oracle.jdbc.driver.OracleDriver");   
		 con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","pwd");
		System.out.println("connection");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
System.out.println(e);
	}
	return con;
	

}
}
