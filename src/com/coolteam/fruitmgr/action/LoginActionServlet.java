package com.coolteam.fruitmgr.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coolteam.fruitmgr.bean.*;
import com.coolteam.fruitmgr.factory.*;

/**
 * Servlet implementation class LoginActionServlet
 */
@WebServlet("/LoginActionServlet")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		User oneUser = new User();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		oneUser.setUserName(username);
		oneUser.setUserPwd(password);
		System.out.println("liufeng, username:" + username + ". password:" + password);
		String type = request.getParameter("type");
		if (/*"USER_LOGIN".equals(type)*/true) {
			boolean ifLoginSuccess = DBAccessFactory.getUserDAOInstance().CheckUserLogin(oneUser);
			if (ifLoginSuccess) {
				System.out.println("User:" + username + ", Login success.");
				pw.println(true);
			} else {
				System.out.println("User:" + username + ", Login failed, need register.");
				pw.println(false);
			}
		}
		
		pw.close();
	}

}
