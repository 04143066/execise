package Generic;

import java.util.*;

/*
 * 关于JDK5.0的新特性泛型(和自动装箱一样都是编译期概念)
 * 		1.为什么引入泛型
 * 			如果不用泛型，集合中可以存储多种数据类型，须做大量的强制类型转换
 * 		2.泛型的语法实现
 * 		3.泛型的优缺点
 * 			存储的类型太统一
 */
public class GenericTest01 {

	public static void main(String argv[]){
		//创建一个List集合，只能存储字符串类型
		List<String> strs = new ArrayList<String>();
		
		//添加元素
		strs.add("lk");
		strs.add("zxx");
		
		//遍历
		Iterator<String> it = strs.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}
