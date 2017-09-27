package com.cg.playBook1.Controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.playBook1.Bean.PlayBookBean;
import com.cg.playBook1.Service.IPlayBookService;
import com.cg.playBook1.Service.PlayBookServiceImpl;
import com.cg.playBook1.Util.PlayBookUtil;

/**
 * Servlet implementation class PlayBookServlet
 */
@WebServlet("*.obj")
public class PlayBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String company1;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayBookServlet() {
 
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	PlayBookUtil.getConnection();
		PlayBookBean plyBk=new PlayBookBean();
		IPlayBookService IplyService=new PlayBookServiceImpl();
		String view=null;
		
		 HttpSession session =null;
		String reqPath=request.getServletPath();
		System.out.println(reqPath);
		PlayBookUtil.getConnection();
		switch(reqPath){
        case "/home.obj":
        	
        view="view/Main.jsp";
        break;
        case "/index.obj":
      
        String comp=request.getParameter("uname"); 
       company1 =comp;
        plyBk.setC_Name(comp);
    
			try {
			PlayBookBean status=IplyService.createAccount(plyBk);
			if(status!=null){
				view="view/Nav.jsp";
			}else{
				request.setAttribute("msg", "Company name already exist please load");
				view="view/error.jsp";
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            break;
        case "/solution.obj":
            
        	view="view/index.jsp";
                
                break;
        case "/CRM.obj":
        	
            view="view/CRM.jsp";
            break;
        case "/fn1_2.obj":
        	int fn1 = Integer.parseInt(request.getParameter("fn1"));
        	int fn2 = Integer.parseInt(request.getParameter("fn2"));
        	plyBk.setFunctionality1(fn1);
        	plyBk.setFunctionality2(fn2);
        	plyBk.setC_Name(company1);
        	
     //   System.out.println(fn1+"  "+fn2);
        	try {
    			PlayBookBean status=IplyService.insertCrm(plyBk);
    			if(status!=null)
    				view="view/index.jsp";
    			
    			} catch (Exception e) {
    				// TODO Auto-generated catch block
    				request.setAttribute("msg", "error logging in");
    				 view="view/error.jsp";
    			}
        	
            break; 
            
 case "/Portal.obj":
        	
            view="view/Portal.jsp";
            break;
         
 	case "/fn11_2.obj":
        	int fn_portal1 = Integer.parseInt(request.getParameter("fn1"));
        	int fn_portal2 = Integer.parseInt(request.getParameter("fn2"));
        	int fn_portal3 = Integer.parseInt(request.getParameter("fn3"));
        	
        	plyBk.setFunctionality1(fn_portal1);
        	plyBk.setFunctionality2(fn_portal2);
        	plyBk.setFunctionality2(fn_portal3);
        	
        	plyBk.setC_Name(company1);
        	
     //   System.out.println(fn1+"  "+fn2);
        	try {
    			PlayBookBean status=IplyService.insertPortal(plyBk);
    			if(status!=null)
    				view="view/index.jsp";
    			
    			} catch (Exception e) {
    				// TODO Auto-generated catch block
    				request.setAttribute("msg", "error logging in");
    				 view="view/error.jsp";
    			}
        	
            break;
            
 		case "/funRating.obj":
    	int fn_Rating1 = Integer.parseInt(request.getParameter("fn1"));
    	int fn_Rating2 = Integer.parseInt(request.getParameter("fn2"));
    	int fn_Rating3 = Integer.parseInt(request.getParameter("fn3"));
    	
    	plyBk.setFunctionality1(fn_Rating1);
    	plyBk.setFunctionality2(fn_Rating2);
    	plyBk.setFunctionality3(fn_Rating3);
    	;
    	plyBk.setC_Name(company1);
    	

    	try {
			PlayBookBean status=IplyService.insertRating(plyBk);
			if(status!=null)
				view="view/index.jsp";
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				request.setAttribute("msg", "error logging in");
				 view="view/error.jsp";
			}
    	
        break; 
            
         case "/coreSys.obj":
            view="view/CoreSystem.jsp";
            break;
            
         case "/Rating.obj":
             view="view/Rating.jsp";
             break;
             
         case "/mid_war.obj":
             view="view/Middleware.jsp";
             break;
       
         case "/func_ecm.obj":	
             view="view/ECM.jsp";
             break;
             
         case "/fun_dwh.obj":	
             view="view/DWH.jsp";
             break;   
         
         case "/fun_analysis.obj":	
             view="view/Analytics.jsp";
             break;    
            
         case "/fn_CoreSys.obj":
         	int fn_coreSys1 = Integer.parseInt(request.getParameter("fn1"));
         	int fn_coreSys2 = Integer.parseInt(request.getParameter("fn2"));
         	int fn_coreSys3 = Integer.parseInt(request.getParameter("fn3"));
         	int fn_coreSys4 = Integer.parseInt(request.getParameter("fn4"));
         	int fn_coreSys5 = Integer.parseInt(request.getParameter("fn5"));
         	int fn_coreSys6 = Integer.parseInt(request.getParameter("fn6"));
         	int fn_coreSys7 = Integer.parseInt(request.getParameter("fn7"));
         	int fn_coreSys8 = Integer.parseInt(request.getParameter("fn8"));
         	int fn_coreSys9 = Integer.parseInt(request.getParameter("fn9"));
         	
         //	System.out.println(fn_portal1);
         	plyBk.setFunctionality1(fn_coreSys1);
         	plyBk.setFunctionality2(fn_coreSys2);
         	plyBk.setFunctionality3(fn_coreSys3);
         	plyBk.setFunctionality4(fn_coreSys4);
         	plyBk.setFunctionality5(fn_coreSys5);
         	plyBk.setFunctionality6(fn_coreSys6);
         	plyBk.setFunctionality7(fn_coreSys7);
         	plyBk.setFunctionality8(fn_coreSys8);
         	plyBk.setFunctionality9(fn_coreSys9);
         	plyBk.setC_Name(company1);
         	
      //   System.out.println(fn1+"  "+fn2);
         	try {
     			PlayBookBean status=IplyService.insertCoresys(plyBk);
     			if(status!=null)
     				view="view/index.jsp";
     			
     			} catch (Exception e) {
     				// TODO Auto-generated catch block
     				request.setAttribute("msg", "error logging in");
     				 view="view/error.jsp";
     			}
         	
             break; 
             
         case "/fun_mid.obj":
          	int fn_Mid1 = Integer.parseInt(request.getParameter("fn1"));
          	int fn_Mid2 = Integer.parseInt(request.getParameter("fn2"));
          	int fn_Mid3 = Integer.parseInt(request.getParameter("fn3"));
          	int fn_Mid4 = Integer.parseInt(request.getParameter("fn4"));
          	
          	plyBk.setFunctionality1(fn_Mid1);
          	plyBk.setFunctionality2(fn_Mid2);
          	plyBk.setFunctionality3(fn_Mid3);
          	plyBk.setFunctionality4(fn_Mid4);
          	
          	plyBk.setC_Name(company1);
          	
       
          	try {
      			PlayBookBean status=IplyService.insertMid(plyBk);
      			if(status!=null)
      				view="view/index.jsp";
      			
      			} catch (Exception e) {
      				// TODO Auto-generated catch block
      				request.setAttribute("msg", "error logging in");
      				 view="view/error.jsp";
      			}
          	
              break;
              
         case "/fun_ecm.obj":
           	int fn_Ecm1 = Integer.parseInt(request.getParameter("fn1"));
           	int fn_Ecm2 = Integer.parseInt(request.getParameter("fn2"));
           	int fn_Ecm3 = Integer.parseInt(request.getParameter("fn3"));
           	int fn_Ecm4 = Integer.parseInt(request.getParameter("fn4"));
           	int fn_Ecm5 = Integer.parseInt(request.getParameter("fn5"));
           	int fn_Ecm6 = Integer.parseInt(request.getParameter("fn6"));
           	int fn_Ecm7 = Integer.parseInt(request.getParameter("fn7"));
           	
           	
           	plyBk.setFunctionality1(fn_Ecm1);
           	plyBk.setFunctionality2(fn_Ecm2);
           	plyBk.setFunctionality3(fn_Ecm3);
           	plyBk.setFunctionality4(fn_Ecm4);
           	plyBk.setFunctionality2(fn_Ecm5);
           	plyBk.setFunctionality3(fn_Ecm6);
           	plyBk.setFunctionality4(fn_Ecm7);
           	
           	plyBk.setC_Name(company1);
           	
        
           	try {
       			PlayBookBean status=IplyService.insertECM(plyBk);
       			if(status!=null)
       				view="view/index.jsp";
       			
       			} catch (Exception e) {
       				// TODO Auto-generated catch block
       				request.setAttribute("msg", "error logging in");
       				 view="view/error.jsp";
       			}
           	
               break; 
           
         case "/fun_Dwh.obj":
            	int fn_Dwh1 = Integer.parseInt(request.getParameter("fn1"));
            	int fn_Dwh2 = Integer.parseInt(request.getParameter("fn2"));
            	int fn_Dwh3 = Integer.parseInt(request.getParameter("fn3"));
            	int fn_Dwh4 = Integer.parseInt(request.getParameter("fn4"));
            	
            	plyBk.setFunctionality1(fn_Dwh1);
            	plyBk.setFunctionality2(fn_Dwh2);
            	plyBk.setFunctionality3(fn_Dwh3);
            	plyBk.setFunctionality4(fn_Dwh4);
            	
            	plyBk.setC_Name(company1);
            	
         
            	try {
        			PlayBookBean status=IplyService.insertDWH(plyBk);
        			if(status!=null)
        				view="view/index.jsp";
        			
        			} catch (Exception e) {
        				// TODO Auto-generated catch block
        				request.setAttribute("msg", "error logging in");
        				 view="view/error.jsp";
        			}
            	
                break;      
               
               
        case "/submit.obj":
        	String username= request.getParameter("uname");
        	plyBk.setC_Name(username);
        	try {
				PlayBookBean status=IplyService.fetchDetails(plyBk);
				System.out.println(status.getFunctionality1());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
            view="view/index.jsp";
            break;
            
        case "/methodology.obj":
        	view="view/Methodology.jsp";
            break;
            
        case "/fn_any.obj":
        	int fn_any1 = Integer.parseInt(request.getParameter("fn1"));
        	plyBk.setFunctionality1(fn_any1);
        	plyBk.setC_Name(company1);
        	
     
        	try {
    			PlayBookBean status=IplyService.insertAny(plyBk);
    			if(status!=null)
    				view="view/index.jsp";
    			
    			} catch (Exception e) {
    				// TODO Auto-generated catch block
    				request.setAttribute("msg", "error logging in");
    				 view="view/error.jsp";
    			}
        	
            break;    
            
        }
        if(view != null){
        	RequestDispatcher rd=request.getRequestDispatcher(view);
        	rd.forward(request, response);
        }
		
	}

}
