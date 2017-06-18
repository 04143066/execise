package Reflect;

import java.util.Date;

/*
 * 关于java中的课变长参数
 */
public class kebianchangcanshu {

	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1,2);
		m1(3,4,5,6,7);
		m2("体育","音乐","旅游","美食");
		
		String[] s ={"体育","音乐","旅游","美食"};
		m2(s);
		try {
			m3(Date.class,Employee.class);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void m1(int... a){//m1 方法在调用的时候传递的实参是0——N个
		System.out.println("test");
	}
	
	//如果有可以精确匹配的方法，则调用该方法，不会再去执行可变长参数的那个方法
	public static void m1(int i){
		System.out.println(i);
	}
	
	//可变长参数可以等同看做数组
	public static void m2(String... args){
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		System.out.println();
	}

	public static void m3(Class... args) throws InstantiationException, IllegalAccessException{
		for(int i=0; i<args.length; i++){
			Class c = args[i];
			System.out.println(c.newInstance());
		}
	}
	
	public static void m4(int i,String... a){//可变长参数只能出现一次，并出现在所有参数的最后一位
		
	}
	
}





















