package com.itheima.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.itheima.domain.Product;
import com.thoughtworks.xstream.XStream;
//��javaBean��������>XML
public class XStreamDemo {
	@Test
	public void test1(){
		Product p = new Product(1,"��ƿ÷",20);
		XStream xs = new XStream();
		//ָ������
		xs.alias("product", Product.class);
		String xml = xs.toXML(p);
		System.out.println(xml);
	}
	
	@Test
	public void test2(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"����Ͳ",20));
		products.add(new Product(2,"��",20));
		products.add(new Product(3,"����",10));
		products.add(new Product(4,"ϴ�·�",10));
		products.add(new Product(5,"����",5));
		XStream xs = new XStream();
		//ָ������
		xs.alias("product", Product.class);
		xs.alias("products", List.class);
		String xml = xs.toXML(products);
		System.out.println(xml);
	}
}
