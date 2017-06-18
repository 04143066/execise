package Reflect;

import java.lang.reflect.Constructor;

/*
 * ��ȡĳ���ض��Ĺ��췽����Ȼ�󴴽�����
 */
public class ReflectTest09 {

	public static void main(String[] args) throws Exception {
		//1.��ȡ��
		Class c = Class.forName("Reflect.Customer");
		
		//�����c.newInstance()���ݵ����޲εĹ��췽��
		
		//2.��ȡ�ض��Ĺ��췽��
		Constructor con = c.getDeclaredConstructor(String.class, int.class);
		
		//3.��������
		Object o = con.newInstance("����",20);//newInstance ����������c���������в����Ĺ��췽��
		
		System.out.println(o);
	}
}

class Customer{
	String name;
	int age;
	
	Customer(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return "Customer["+name+","+age+"]";
	}
}
