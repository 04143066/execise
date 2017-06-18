package Reflect.IO_Propertities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/*
 * IO  +   Propertity  +  ����      ����Ӧ��
 */
public class Test02 {

	public static void main(String[] args) throws FileNotFoundException {
		//1.�������Զ���
		Properties p = new Properties();
		
		//2.������
		FileReader fr = new FileReader("E:\\�ҵ�java����\\�����ڵ�\\src\\Reflect\\IO_Propertities\\classInfo.properties");
		
		//3.����
		try {
			p.load(fr);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//ͨ��key��ȡvalue
		String className = p.getProperty("className");
		System.out.println(className);
		
		//ͨ��������ƴ�������
		Class c = null;
		try {
			c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//��������
		try {
			Object o = c.newInstance();
			System.out.println(o);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
