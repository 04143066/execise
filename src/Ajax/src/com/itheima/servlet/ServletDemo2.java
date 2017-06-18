package com.itheima.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo2
 */
@WebServlet("/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String usernames[]={"admin","jack"};
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
	//	System.out.println("��ת�ɹ�"+username);
		boolean b = false;//�Ƿ����
		for(String s:usernames){
			if(s.equals(username)){
				b = true;
				break;
			}
		}
		response.setContentType("test/html;charset=UTF-8");
		if(b){
			response.getWriter().write("<font color='red'>�û���������</font>");
		}else{
			response.getWriter().write("<font color='green'>�û�����</font>");
		}
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
