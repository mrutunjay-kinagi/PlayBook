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
	String email1;
      
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
      
        String email=request.getParameter("uname"); 
         email1=email;
        plyBk.seteMail(email);
    
			try {
			PlayBookBean status=IplyService.createAccount(plyBk);
			if(status!=null){
				view="view/Nav.jsp";
			}else{
				request.setAttribute("msg", "Companey name already exist please load");
				view="view/error.jsp";
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            break;
        case "/CRM.obj":
        	
            view="view/CRM.jsp";
            break;
        case "/fn1_2.obj":
        	String fn1 = request.getParameter("fn1");
        	String fn2 = request.getParameter("fn2");
        	plyBk.setFunctionality1(fn1);
        	plyBk.setFunctionality2(fn2);
        	plyBk.seteMail(email1);
        	
        System.out.println(fn1+"  "+fn2);
        	try {
    			PlayBookBean status=IplyService.updateCrm(plyBk);
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
        	plyBk.seteMail(username);
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
            
        }
        if(view != null){
        	RequestDispatcher rd=request.getRequestDispatcher(view);
        	rd.forward(request, response);
        }
		
	}

}
