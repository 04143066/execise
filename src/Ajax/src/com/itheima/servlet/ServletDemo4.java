package com.itheima.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.City;
import com.itheima.domain.Province;
import com.thoughtworks.xstream.XStream;

/**
 * Servlet implementation class ServletDemo4
 */
@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo4() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("lll");
		List<Province> provinces = new ArrayList<Province>();
		Province sd = new Province(37,"ɽ��");
		Province hb = new Province(42,"����");
		Province hn = new Province(41,"����");
		
		sd.getCitys().add(new City(01,"����"));
		sd.getCitys().add(new City(02,"�ൺ"));
		sd.getCitys().add(new City(03,"�Ͳ�"));
		
		hb.getCitys().add(new City(01,"�人"));
		hb.getCitys().add(new City(02,"�Ƹ�"));
		hb.getCitys().add(new City(03,"����"));
		
		hn.getCitys().add(new City(01,"֣��"));
		hn.getCitys().add(new City(02,"����"));
		hn.getCitys().add(new City(03,"����"));
		
		provinces.add(sd);
		provinces.add(hb);
		provinces.add(hn);
		
		XStream xs = new XStream();
		xs.autodetectAnnotations(true);
		xs.alias("provinces", List.class);
		String xml = xs.toXML(provinces);
		
		response.setContentType("text/xml;charset=UTF-8");
		response.getWriter().write(xml);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
