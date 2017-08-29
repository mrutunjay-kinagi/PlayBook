package com.cg.playBook1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.playBook1.Bean.PlayBookBean;
import com.cg.playBook1.Util.PlayBookUtil;

public class PlayBookDaoImpl implements IPlayBookDao{
Connection con=null;
	@Override
	public PlayBookBean createAccount(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(plyBK.geteMail());
		int status=0;
		String query="INSERT INTO SignUP (Email, Password) VALUES (? , ?)";
		System.out.println(query);
		 
		
	      try(Connection con = PlayBookUtil.getConnection();) {
	    	  PreparedStatement preparedStmt = con.prepareStatement(query);
	    	  System.out.println(query);
	       preparedStmt.setString (1, plyBK.geteMail());
			preparedStmt.setString (2, plyBK.getPass());
		status=	preparedStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		}
	     if(status==1){ 
		return plyBK;
	     }else{
	    	 return null;
	     }
	}
	@Override
	public PlayBookBean updateCrm(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
