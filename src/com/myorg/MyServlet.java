package com.myorg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2638498772924154820L;

	private String message;
	
	private String message1;

	public void init() throws ServletException {
		// ִ�б���ĵĳ�ʼ��
		message = "Hello World2";
		message1 = "Hello World3";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������Ӧ��������
		response.setContentType("text/html");

		// ʵ�ʵ��߼���������
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>\n" + message1);
	}

	public void destroy() {
		// ʲôҲ����
	}
}
