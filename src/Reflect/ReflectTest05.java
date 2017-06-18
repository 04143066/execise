package Reflect;

import java.lang.reflect.*;

/*
 * java.lang.reflect.Field;��ȡĳ��ָ��������
 */
public class ReflectTest05 {

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("Reflect.User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//��ȡĳ���ض�
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
		
		//id��private���͵ģ��ⲿ���ܷ��ʣ�Ҫ���Ʒ�װ
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
