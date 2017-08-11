package com.coolteam.fruitmgr.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coolteam.fruitmgr.bean.*;
import com.coolteam.fruitmgr.factory.DBAccessFactory;

/**
 * Servlet implementation class QueryAllFruitServlet
 */
@WebServlet("/QueryAllFruitServlet")
public class QueryAllFruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryAllFruitServlet() {
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
		PrintWriter out = response.getWriter();
		String xml = "<xml><title>Test Title</title></xml>";//XMLÎÄ±¾×Ö·û´®
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/xml;charset=utf-8");
        response.setHeader("Cache-control", "no-cache");
        List<FruitGoods> list=DBAccessFactory.getFruitGoodDAOInstance().getAllMainFruitGoods();
        for (int i = 0; i < list.size(); i ++) {
        	System.out.println(list.get(i).getFruitName());
        }
        out.println(xml);
	}

}
