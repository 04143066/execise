package Reflect;

import java.util.Date;

/*
 * ��ȡClass���Ͷ�������ַ�ʽ
 */
public class ReflectTest01 {

	public static void main(String[] args) throws ClassNotFoundException {
		//��һ�ַ�ʽ
		Class c1 = Class.forName("Reflect.Employee");//c1���ñ����ڴ��ַָ����еĶ��󣬸ö����Ӧ����Employee������
		
		
		//�ڶ��ַ�ʽ��
		//java��ÿ�����Ͷ��� class����
		Class c2 = Employee.class;
		
		
		//�����ַ�ʽ
		//java�������κ�һ��java������getClass����
		Employee e = new Employee();
		Class c3 = e.getClass(); //c3������ʱ��  ��e������ʱ����Employee��
		
		//��ΪEmployee�������JVM��ֻ��һ��������c1,c2.c3���ڴ��ַ����ͬ�ģ�ָ�����Ψһ��һ������
		System.out.println(c1==c2);//true
		System.out.println(c3==c2);//true
		
		
		//c4,c5,c6������Date�����
		Class c4 = Date.class;//c4����Date�����
		Class c5 = Class.forName("java.util.Date");//����д��ȫ������ȫ�����а���
	
		Date d = new Date();
		Class c6 = d.getClass();
		
		System.out.println(c4==c5);//true
		System.out.println(c5==c6);//true
	
		//c7����int����
		Class c7 = int.class;
		
	}
}
