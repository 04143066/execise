package Reflect;

import org.omg.Messaging.SyncScopeHelper;

/*
 * 
 */
public class ReflectTest02 {

	public static void main(String[] args) throws ClassNotFoundException {
		//��A.class �ļ�װ��JVM�еĹ���,��ִ�о�̬����
		Class.forName("Reflect.A");
		
		//����ִ�о�̬����
		Class c = A.class;
		
		//��ִ�ж�̬����
		A a = new A();//new��ʱ����Ѿ��������
		Class c1 = a.getClass();
		
		
	}
}

class A{
	static{
		System.out.println("A...");
	}
	
}