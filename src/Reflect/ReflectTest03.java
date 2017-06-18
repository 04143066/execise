package Reflect;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡClass���͵Ķ���֮�󣬿��Դ����á��ࡱ�Ķ���
 */
public class ReflectTest03 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("Reflect.Employee");
		try {
			//������Class��������ʾ�����һ����ʵ��
			Object o = c.newInstance();//������Employee���޲ι��췽��,ע��������вι��췽����û���޲εĹ��췽������ִ����仰��ʱ������쳣��
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
