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
		System.out.println("-----ContextServlet����------");
		//��ȡsession������
		HttpSession session = request.getSession();
		ServletContext sc = session.getServletContext();
		
		//�洢����
		sc.setAttribute("name", "jorck");
		
		//��ȡ����
		String n = (String) sc.getAttribute("name");
		System.out.println(n);
	}

}
