package Reflect;

import java.util.Date;

/*
 * 获取Class类型对象的三种方式
 */
public class ReflectTest01 {

	public static void main(String[] args) throws ClassNotFoundException {
		//第一种方式
		Class c1 = Class.forName("Reflect.Employee");//c1引用保存内存地址指向堆中的对象，该对象对应的是Employee整个类
		
		
		//第二种方式：
		//java中每个类型都有 class属性
		Class c2 = Employee.class;
		
		
		//第三种方式
		//java语言中任何一个java对象都有getClass方法
		Employee e = new Employee();
		Class c3 = e.getClass(); //c3是运行时类  （e的运行时类是Employee）
		
		//因为Employee这个类在JVM中只有一个，所以c1,c2.c3的内存地址是相同的，指向堆中唯一的一个对象
		System.out.println(c1==c2);//true
		System.out.println(c3==c2);//true
		
		
		//c4,c5,c6都代表Date这个类
		Class c4 = Date.class;//c4代表Date这个类
		Class c5 = Class.forName("java.util.Date");//必须写类全名，类全名带有包名
	
		Date d = new Date();
		Class c6 = d.getClass();
		
		System.out.println(c4==c5);//true
		System.out.println(c5==c6);//true
	
		//c7代表int类型
		Class c7 = int.class;
		
	}
}
