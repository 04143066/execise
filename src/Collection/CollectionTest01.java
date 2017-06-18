package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {

	public static void main(String argv[]){
		
		//1.创建集合
		Collection c = new ArrayList();//多态
		
		//2.添加元素
		c.add(1); //JDK5.0之后，自动装箱
		c.add(new Integer(100));
		Object o = new Object();
		c.add(o);//o存的内存地址
		
		Customer j = new Customer("java",21);
		c.add(j);
		
		//3.获取元素的个数
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		//4.将集合转换成Object类型的数组
		Object[] objs = c.toArray();
		for(int i=0; i<objs.length; i++){
			System.out.println(objs[i]);
		}
		
		//5.清空
		c.clear();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		
	}
}

class Customer{
	
	String name;
	int age;
	
	Customer(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Customer[name="+name+",age="+age+"]";
	}
	
}
