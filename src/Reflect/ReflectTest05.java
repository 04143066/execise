package Reflect;

import java.lang.reflect.*;

/*
 * java.lang.reflect.Field;获取某个指定的属性
 */
public class ReflectTest05 {

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("Reflect.User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//获取某个特定
		Field idf = null;
		Object o = null;
		try {
			idf = c.getDeclaredField("id");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		try {
			o = c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//id是private类型的，外部不能访问，要打破封装
		idf.setAccessible(true);
		
		try {
			idf.set(o, "zxx");
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(idf.get(o));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}
}
