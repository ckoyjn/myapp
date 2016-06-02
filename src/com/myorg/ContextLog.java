package com.myorg;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextLog extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9055323977995847943L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		String par = request.getParameter("par1");
		// �������� ServletContext.log ����
		ServletContext context = getServletContext();

		if (par == null || par.equals(""))
			// ͨ�� Throwable ������¼�汾
			context.log("No message received:", new IllegalStateException("Missing parameter"));
		else
			context.log("Here is the visitor's message: " + par);

		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		String title = "Context Log";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n"
				+ "<h2 align=\"center\">Messages sent</h2>\n" + "</body></html>");
	} // doGet
}
