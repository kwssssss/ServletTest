package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hellooo")

@WebServlet(
		urlPatterns = {"/hello", "/world"},
		initParams = {
			@WebInitParam(name="hellohello", value="d:\\\\test"),
			@WebInitParam(name="byebye", value="d:\\\\testest")
		}
		)
public class HelloServlet extends HttpServlet {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("HelloServlet destroy 호출"); //콘솔에 보내는 호출
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("HelloServlet init 호출"); //콘솔에 보내는 호출
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String hellohello = getInitParameter("hellohello");
		String byebye = getInitParameter("byebye");
		
		System.out.println("TestServlet 실행");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello<h1>");
		out.println(hellohello + "<br>");
		out.println(byebye + "<br>");
		out.println("</body>");
		out.println("</html>"); //println 반복
	}

}
