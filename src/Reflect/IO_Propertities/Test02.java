package Reflect.IO_Propertities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/*
 * IO  +   Propertity  +  反射      联合应用
 */
public class Test02 {

	public static void main(String[] args) throws FileNotFoundException {
		//1.创建属性对象
		Properties p = new Properties();
		
		//2.创建流
		FileReader fr = new FileReader("E:\\我的java程序\\动力节点\\src\\Reflect\\IO_Propertities\\classInfo.properties");
		
		//3.加载
		try {
			p.load(fr);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//通过key获取value
		String className = p.getProperty("className");
		System.out.println(className);
		
		//通过反射机制创建对象
		Class c = null;
		try {
			c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//创建对象
		try {
			Object o = c.newInstance();
			System.out.println(o);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
