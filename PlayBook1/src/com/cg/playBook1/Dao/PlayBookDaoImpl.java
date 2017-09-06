package com.cg.playBook1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	//	String query="INSERT INTO PROFILE (Email, Password) VALUES (? , ?)";
		
	      try(Connection con = PlayBookUtil.getConnection();) {
	    	  String query="INSERT INTO PROFILE (P_ID, P_NAME) VALUES (seq_profile.nextval , ?)";
	    	  
	    	  PreparedStatement preparedStmt = con.prepareStatement(query);
	       preparedStmt.setString (1, plyBK.geteMail());
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
		String query="Update SignUP set Functionality1=?, Functionality2=? where Email=?";
		System.out.println(query);
		int status=0;
		
		  try(Connection con = PlayBookUtil.getConnection();) {
	    	  PreparedStatement preparedStmt = con.prepareStatement(query);
	    	  System.out.println(plyBK.getFunctionality1()+" "+plyBK.getFunctionality2()+plyBK.geteMail());
	       preparedStmt.setString (1, plyBK.getFunctionality1());
			preparedStmt.setString (2, plyBK.getFunctionality2());
			preparedStmt.setString (3, plyBK.geteMail());
		status=	preparedStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	     if(status==1){ 
	    	 System.out.println("sucess");
		return plyBK;
	     }else{
	    	 System.out.println("failed");
	    	 return null;
	     }
		
		
		
	}
	@Override
	public PlayBookBean fetchDetails(PlayBookBean plyBK)throws SQLException {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			String query="select * from SignUP where Email=?";
			System.out.println(query);
			int status=0;
			ResultSet rs=null;
			  try(Connection con = PlayBookUtil.getConnection();) {
				  String name=plyBK.geteMail();
		    	  PreparedStatement preparedStmt = con.prepareStatement(query);
		    	  System.out.println(name);
		    	  preparedStmt.setString (1,name);
		    	  
		    	  rs = preparedStmt.executeQuery(query);
		    	  
		            if (rs.next()) {
		                plyBK.seteMail(rs.getString(1));
		                plyBK.setFunctionality1(rs.getString(3));
		                plyBK.setFunctionality2(rs.getString(3));
		                System.out.println(plyBK);
		            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		 
		    	 return plyBK;
		     }
	}

		
		
		
	


