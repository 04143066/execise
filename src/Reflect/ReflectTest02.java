package Reflect;

import org.omg.Messaging.SyncScopeHelper;

/*
 * 
 */
public class ReflectTest02 {

	public static void main(String[] args) throws ClassNotFoundException {
		//将A.class 文件装到JVM中的过程,会执行静态语句块
		Class.forName("Reflect.A");
		
		//不会执行静态语句块
		Class c = A.class;
		
		//会执行动态语句块
		A a = new A();//new的时候就已经类加载了
		Class c1 = a.getClass();
		
		
	}
}

class A{
	static{
		System.out.println("A...");
	}
	
}