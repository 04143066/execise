package Foreach;

import java.util.*;

/*
 * JDK5.0 ������
 * 	������ǿforѭ��
 * 
 * 		�﷨��
 * 			for(����   ������������/������){}
 * 		�������Ҫʹ��forѭ�������﷨��������Ҫʹ�÷��ͣ������ʹ�÷��ͣ���Object����Ҫ������Ԫ��
 * 
 * 		ȱ�㣺
 * 			û���±�
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
