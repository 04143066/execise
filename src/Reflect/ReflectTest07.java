package Reflect;

import java.lang.reflect.Method;

/*
 * ��ȡĳ���ض��ķ�����ͨ���������ִ��
 */
public class ReflectTest07 {

	public static void main(String[] args) throws Exception {
		//1.��ȡ��
		Class c = Class.forName("CustomerService");
		
		//��ȡĳ���ض��ķ���,ͨ����������+�β�
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		
		//ͨ���������ִ��login����
		Object o = c.newInstance();
		
		//����o�����m���������ݲ��������ط�����ִ�з���������ֵ
		Object retValue = m.invoke(o, "admin", "123");
		
		System.out.println(retValue);
		
	}
}
