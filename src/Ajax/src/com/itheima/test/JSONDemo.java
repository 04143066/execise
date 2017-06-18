package com.itheima.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.itheima.domain.Product;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
public class JSONDemo {

/*	@Test
	public void test1() {
		String s[] = {"a","b","c"};
		JSONArray json = JSONArray.fromObject(s);
		System.out.println(json);
	}
	
	@Test
	public void test2() {
		List<String> list = new ArrayList<String>();
		list.add("a");                                     //
		list.add("b");
		list.add("c");
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json);
	}
	
	@Test
	public void test3() {
		List<Product> pros = new ArrayList<Product>();
		pros.add(new Product(1,"金瓶梅",20));                //链表，数组用JSONObject
		pros.add(new Product(2,"荷花",30));
		pros.add(new Product(3,"雨伞",33));
		JSONArray json = JSONArray.fromObject(pros);
		System.out.println(json);
	}
	
	@Test
	public void test4() {
		Product p = new Product(1,"书",20);
		JSONObject json = JSONObject.fromObject(p);   //单独的对象用JSONObject
		System.out.println(json);
	}
	*/
	
	//过滤
	@Test
	public void test5() {
		Product p = new Product(1, "金瓶梅", 20);
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(new String[]{"id","price"}); //这样就只输出name属性
		JSONObject json = JSONObject.fromObject(p,jc);
		System.out.println(json);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
