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
		System.out.println(plyBK.getC_Name());
		int status=0;
	//	String query="INSERT INTO PROFILE (Email, Password) VALUES (? , ?)";
		
	      try(Connection con = PlayBookUtil.getConnection();) {
	    	  String query="INSERT INTO PROFILE (P_ID, P_NAME) VALUES (seq_profile.nextval , ?)";
	    	  
	    	  PreparedStatement preparedStmt = con.prepareStatement(query);
	       preparedStmt.setString (1, plyBK.getC_Name());
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
	public PlayBookBean insertCrm(PlayBookBean plyBK) throws SQLException {
		// TODO Auto-generated method stub
		int status=0;
		int status1=0;
		for(int count=1;count<3;count++){
		String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
				+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
		
		
		
		  try(Connection con = PlayBookUtil.getConnection();) {
	    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
	    	
	    //	  System.out.println(plyBK.getFunctionality1()+" "+plyBK.getFunctionality2()+plyBK.getC_Name());
	    	 if(count==1){
	       preparedStmt1.setInt(1, plyBK.getFunctionality1());
	    	}else{
		preparedStmt1.setInt (1, plyBK.getFunctionality2());
	    	 }
			preparedStmt1.setString (2, plyBK.getC_Name());
			
		status=	preparedStmt1.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		}
		if(status==1){
			 try(Connection con = PlayBookUtil.getConnection();) {
			String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
					+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
					+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
					+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
					+ "left join scope s on s.S_ID=fn.scope_fid)";	
			  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
				status1=preparedStmt2.executeUpdate();
			}catch(SQLException e){
				System.out.println(e);
			}
		
		return plyBK;
		
		}else{
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
				  String name=plyBK.getC_Name();
		    	  PreparedStatement preparedStmt = con.prepareStatement(query);
		    	  System.out.println(name);
		    	  preparedStmt.setString (1,name);
		    	  
		    	  rs = preparedStmt.executeQuery(query);
		    	  
		            if (rs.next()) {
		                plyBK.setC_Name(rs.getString(1));
		                plyBK.setFunctionality1(rs.getInt(2));
		                plyBK.setFunctionality2(rs.getInt(3));
		                System.out.println(plyBK);
		            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		 
		    	 return plyBK;
		     }
	


public PlayBookBean insertPortal(PlayBookBean plyBK) throws SQLException {
	// TODO Auto-generated method stub
	int status=0;
	int status1=0;
	for(int count=1;count<4;count++){
	String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
			+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
	
	
	
	  try(Connection con = PlayBookUtil.getConnection();) {
    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
    	 
    //	  System.out.println(plyBK.getFunctionality1()+" "+plyBK.getFunctionality2()+plyBK.getC_Name());
    	 if(count==1){
       preparedStmt1.setInt(1, plyBK.getFunctionality1());
    	}else if(count==2){
	preparedStmt1.setInt (1, plyBK.getFunctionality2());
    	 }else{
     preparedStmt1.setInt (1, plyBK.getFunctionality3()); 
    	 }
		preparedStmt1.setString (2, plyBK.getC_Name());
		
	status=	preparedStmt1.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}
	if(status==1){
		 try(Connection con = PlayBookUtil.getConnection();) {
		String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
				+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
				+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
				+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
				+ "left join scope s on s.S_ID=fn.scope_fid)";	
		  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
			status1=preparedStmt2.executeUpdate();
		}catch(SQLException e){
			System.out.println(e);
		}
	
	return plyBK;
	
	}else{
		return null;
	}
	

   }


@Override
public PlayBookBean insertCoreSys(PlayBookBean plyBK) throws SQLException {
	// TODO Auto-generated method stub
	int status=0;
	int status1=0;
	for(int count=1;count<10;count++){
	String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
			+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
	
	
	  try(Connection con = PlayBookUtil.getConnection();) {
    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
    	
    //	  System.out.println(plyBK.getFunctionality1()+" "+plyBK.getFunctionality2()+plyBK.getC_Name());
    	 if(count==1){
     preparedStmt1.setInt(1, plyBK.getFunctionality1());
    	}else if(count==2){
	 preparedStmt1.setInt (1, plyBK.getFunctionality2());
    	 }else if(count==3){
     preparedStmt1.setInt (1, plyBK.getFunctionality3());	 
    	 }else if(count==4){
     preparedStmt1.setInt (1, plyBK.getFunctionality4());	 
    	 }else if(count==5){
     preparedStmt1.setInt (1, plyBK.getFunctionality5());		 
    	 
	  	}else if(count==6){
		     preparedStmt1.setInt (1, plyBK.getFunctionality6());		 
		    	 
	 	}else if(count==7){
	     preparedStmt1.setInt (1, plyBK.getFunctionality7());		 
	    	 
		}else if(count==8){
			preparedStmt1.setInt (1, plyBK.getFunctionality8());		 
		
		}else {
			preparedStmt1.setInt (1, plyBK.getFunctionality9());		 
		}
		preparedStmt1.setString (2, plyBK.getC_Name());
    	 
	status=	preparedStmt1.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}
	if(status==1){
		 try(Connection con = PlayBookUtil.getConnection();) {
		String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
				+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
				+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
				+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
				+ "left join scope s on s.S_ID=fn.scope_fid)";	
		  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
			status1=preparedStmt2.executeUpdate();
		}catch(SQLException e){
			System.out.println(e);
		}
	
	return plyBK;
	
	}else{
		return null;
	}
	
	
}
@Override
public PlayBookBean insertRating(PlayBookBean plyBk) throws SQLException {
	int status=0;
	int status1=0;
	for(int count=1;count<4;count++){
	String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
			+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
	
	
	
	  try(Connection con = PlayBookUtil.getConnection();) {
    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
    
    	 if(count==1){
       preparedStmt1.setInt(1, plyBk.getFunctionality1());
    	}else if(count==2){
	preparedStmt1.setInt (1, plyBk.getFunctionality2());
    	 }else{
     preparedStmt1.setInt (1, plyBk.getFunctionality3()); 
    	 }
		preparedStmt1.setString (2, plyBk.getC_Name());
		
	status=	preparedStmt1.executeUpdate();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}
	if(status==1){
		 try(Connection con = PlayBookUtil.getConnection();) {
		String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
				+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
				+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
				+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
				+ "left join scope s on s.S_ID=fn.scope_fid)";	
		  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
			status1=preparedStmt2.executeUpdate();
		}catch(SQLException e){
			System.out.println(e);
		}
	
	return plyBk;
	
	}else{
		return null;
	}
	

	}
@Override
public PlayBookBean insertMid(PlayBookBean plyBk) throws SQLException {
	int status=0;
	int status1=0;
	for(int count=1;count<5;count++){
	String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
			+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
	
	
	
	  try(Connection con = PlayBookUtil.getConnection();) {
    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
    	 
    
    	 if(count==1){
       preparedStmt1.setInt(1, plyBk.getFunctionality1());
    	}else if(count==2){
	preparedStmt1.setInt (1, plyBk.getFunctionality2());
    	 }else if(count==3){
     preparedStmt1.setInt (1, plyBk.getFunctionality3()); 
    	 }else{
    preparedStmt1.setInt (1, plyBk.getFunctionality4()); 
    	 }
    	 
		preparedStmt1.setString (2, plyBk.getC_Name());
		
	status=	preparedStmt1.executeUpdate();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}
	if(status==1){
		 try(Connection con = PlayBookUtil.getConnection();) {
		String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
				+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
				+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
				+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
				+ "left join scope s on s.S_ID=fn.scope_fid)";	
		  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
			status1=preparedStmt2.executeUpdate();
		}catch(SQLException e){
			System.out.println(e);
		}
	
	return plyBk;
	
	}else{
		return null;
	}
	
}
		@Override
		public PlayBookBean insertECM(PlayBookBean plyBk) throws SQLException {
			int status=0;
			int status1=0;
			for(int count=1;count<8;count++){
			String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
					+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
			
			  try(Connection con = PlayBookUtil.getConnection();) {
		    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
		    	
		    //	  System.out.println(plyBK.getFunctionality1()+" "+plyBK.getFunctionality2()+plyBK.getC_Name());
		    	 if(count==1){
		     preparedStmt1.setInt(1, plyBk.getFunctionality1());
		    	}else if(count==2){
			 preparedStmt1.setInt (1, plyBk.getFunctionality2());
		    	 }else if(count==3){
		     preparedStmt1.setInt (1, plyBk.getFunctionality3());	 
		    	 }else if(count==4){
		     preparedStmt1.setInt (1, plyBk.getFunctionality4());	 
		    	 }else if(count==5){
		     preparedStmt1.setInt (1, plyBk.getFunctionality5()); 
			  	}else if(count==6){
				     preparedStmt1.setInt (1, plyBk.getFunctionality6());   	 
			 	}
				else{
					preparedStmt1.setInt (1, plyBk.getFunctionality7());		 
				}
				preparedStmt1.setString (2, plyBk.getC_Name());
		    	 
			status=	preparedStmt1.executeUpdate();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			}
			if(status==1){
				 try(Connection con = PlayBookUtil.getConnection();) {
				String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
						+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
						+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
						+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
						+ "left join scope s on s.S_ID=fn.scope_fid)";	
				  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
					status1=preparedStmt2.executeUpdate();
				}catch(SQLException e){
					System.out.println(e);
				}
			
			return plyBk;
			
			}else{
				return null;
			}
			
		}
		
		@Override
		public PlayBookBean insertDWH(PlayBookBean plyBk) throws SQLException {
			int status=0;
			int status1=0;
			for(int count=1;count<5;count++){
			String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
					+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
			
			  try(Connection con = PlayBookUtil.getConnection();) {
		    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
		    
		    	 if(count==1){
		       preparedStmt1.setInt(1, plyBk.getFunctionality1());
		    	}else if(count==2){
			preparedStmt1.setInt (1, plyBk.getFunctionality2());
		    	 }else if(count==3){
		     preparedStmt1.setInt (1, plyBk.getFunctionality3()); 
		    	 }else{
		    preparedStmt1.setInt (1, plyBk.getFunctionality4()); 
		    	 }
		    	 
				preparedStmt1.setString (2, plyBk.getC_Name());
				
			status=	preparedStmt1.executeUpdate();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			}
			if(status==1){
			return plyBk;
			}else{
				return null;
			}
		}
		@Override
		public PlayBookBean insertAny(PlayBookBean plyBk) throws SQLException {
			int status=0;
			int status1=0;
			String query1="insert into B_PROFILE_FUNCTION(PROFILE_FUNCTION_ID,Functionality_id,profile_id)  values "
					+ "(Seq_Bridge_profile_func.nextval,?,(select p_id from profile where p_name=?))";
			String query2="insert into PROFILE_DETAILS(PD_ID,PD_NAME,PD_SCOPE,PD_FUNC) "
					+ "(select seq_profile_details.nextval,p.p_name,s.s_name,fn.f_name from profile p "
					+ "left join B_PROFILE_FUNCTION bp on bp.profile_id=p.p_id "
					+ "left join functionallity fn on fn.f_id=bp.FUNCTIONALITY_ID "
					+ "left join scope s on s.S_ID=fn.scope_fid)";
			
			  try(Connection con = PlayBookUtil.getConnection();) {
		    	  PreparedStatement preparedStmt1 = con.prepareStatement(query1);
		    	  PreparedStatement preparedStmt2 = con.prepareStatement(query2);
		    
		    	
		    preparedStmt1.setInt(1, plyBk.getFunctionality1());
		    preparedStmt1.setString (2, plyBk.getC_Name());
				
			status=	preparedStmt1.executeUpdate();
			status1=preparedStmt2.executeUpdate();
			
			} catch (SQLException e) {
				
				System.out.println(e);
			}
			if(status==1){
			return plyBk;
			}else{
				return null;
			}
		}
		
}		
	
	


