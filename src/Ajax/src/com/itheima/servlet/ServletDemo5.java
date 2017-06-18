package com.itheima.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Product;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class ServletDemo5
 */
@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Product> products = new ArrayList<Product>();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo5() {
        super();
    }

	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("**************1ok**********");
		products.add(new Product(1, "����Ͳ", 20));
		products.add(new Product(2, "��ƿ÷", 10));
		products.add(new Product(3, "����", 10));
		products.add(new Product(4, "ϴ�·�", 10));
		products.add(new Product(5, "����", 7));
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	response.setContentType("text/plain;charset=UTF-8");
		//�����ֹ���֯JSON����
	//	response.getWriter().write("[{id:1,name:'����Ͳ',price:20},]");
	//	JSONArray json = JSONArray.fromObject(products);
	//	response.getWriter().write(json.toString());
		System.out.println("ok");
		response.setContentType("test/html;charset=UTF-8");
		response.getWriter().write("<font color='green'>�û�����</font>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
