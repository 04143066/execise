package Foreach;

import java.util.*;

/*
 * JDK5.0 新特性
 * 	关于增强for循环
 * 
 * 		语法：
 * 			for(类型   变量：数组名/集合名){}
 * 		如果集合要使用for循环这种语法，集合需要使用泛型，如果不使用泛型，用Object接收要遍历的元素
 * 
 * 		缺点：
 * 			没有下标
 */
public class ForeachTest01 {

	public static void main(String argv[]){
		
		String[] str = {"232","aga","098"};
		for(String strs:str){
			System.out.println(strs);
		}
		List<String> l = new ArrayList<String>();
		l.add("joias");
		l.add("f98a");
		l.add("0u9a8");
		for(String strs:l){
			System.out.println(strs);
		}
		
		Set set = new HashSet();
		set.add("daj");
		set.add("08u");
		set.add("8u9jf");
		for(Object s:set){
			System.out.println(s);
		}
	}
}
