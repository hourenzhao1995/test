package com.baizhi.lean;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContextServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("-----ContextServlet创建------");
		//获取session作用域
		HttpSession session = request.getSession();
		ServletContext sc = session.getServletContext();
		
		//存储数据
		sc.setAttribute("name", "jorck");
		
		//获取数据
		String n = (String) sc.getAttribute("name");
		System.out.println(n);
	}

}
