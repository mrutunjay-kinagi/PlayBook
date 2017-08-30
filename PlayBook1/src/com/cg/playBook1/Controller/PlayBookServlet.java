package com.cg.playBook1.Controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		PlayBookBean plyBk=null;
		IPlayBookService IplyService=null;
		String view=null;
		String reqPath=request.getServletPath();
		System.out.println(reqPath);
		switch(reqPath){
        case "/home.obj":
        	
        view="view/Main.html";
        break;
        case "/index.obj":
        IplyService=new PlayBookServiceImpl();
        String email=request.getParameter("uname"); 
      //  String pass=request.getParameter("psw");	
       // String cnfrmPass=request.getParameter("psw_repeat");
       // System.out.println(email+" "+ pass);
        plyBk=new PlayBookBean();
        plyBk.seteMail(email);
      //  plyBk.setPass(pass);
      //  plyBk.setCnfrmPass(cnfrmPass);
			try {
			PlayBookBean status=IplyService.createAccount(plyBk);
			if(status!=null){
				view="view/index.jsp";
			}else{
				System.out.println("login Failed");
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            break;
        case "/CRM.obj":
        	
            view="view/CRM.html";
            break;
        case "/fn1_2.obj":
        	String fn1 = request.getParameter("fn1");
        	String fn2 = request.getParameter("fn2");
        	try {
    			PlayBookBean status=IplyService.createAccount(plyBk);
    			if(status!=null){
    				view="view/index.html";
    			}else{
    				System.out.println("login Failed");
    			}
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        	view="view/Main.html";
            break;  
            
        }
        if(view != null){
        	RequestDispatcher rd=request.getRequestDispatcher(view);
        	rd.forward(request, response);
        }
		
	}

}
