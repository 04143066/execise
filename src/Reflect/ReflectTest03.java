package Reflect;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取Class类型的对象之后，可以创建该“类”的对象
 */
public class ReflectTest03 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("Reflect.Employee");
		try {
			//创建此Class对象所表示的类的一个新实例
			Object o = c.newInstance();//调用了Employee的无参构造方法,注意如果有有参构造方法，没有无参的构造方法，在执行这句话的时候会有异常。
			System.out.println(o);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		//Class c1 = Class.forName("java.util.Date");
		Class c1 = Class.forName("Main");
		try {	
			Object o1 = c1.newInstance();
			Date t = (Date)o1;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
