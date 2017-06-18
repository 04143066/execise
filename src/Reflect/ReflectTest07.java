package Reflect;

import java.lang.reflect.Method;

/*
 * 获取某个特定的方法，通过反射机制执行
 */
public class ReflectTest07 {

	public static void main(String[] args) throws Exception {
		//1.获取类
		Class c = Class.forName("CustomerService");
		
		//获取某个特定的方法,通过：方法名+形参
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		
		//通过反射机制执行login方法
		Object o = c.newInstance();
		
		//调用o对象的m方法，传递参数，返回方法的执行方法即返回值
		Object retValue = m.invoke(o, "admin", "123");
		
		System.out.println(retValue);
		
	}
}
