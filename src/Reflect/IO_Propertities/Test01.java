package Reflect.IO_Propertities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * IO+Propertities
 * 
 * dbinfo这样的文件我们称作配置文件
 * 配置文件的作用是：是程序更加灵活，一般在程序中可变得东西不要写死
 * 运行同样的程序得到不一样的结果 ，配置文件里面的key不能改，如果key重复，value覆盖
 * 
 * 像dbinfo这样的特殊文件又叫做：属性文件，java中规范属性文件以.propertities结尾
 * key与value之间可以是“=” “：” “ ”，这些符号谁先出现，就以谁为标准划分key和value
 * 
 * 在命令行界面输入     native2ascii   
 * 再输入     邹雄鑫  
 * 会打印一串字符，贴到配置文件中，在java控制台打印出来就不是乱码了
 * 
 */
public class Test01 {

	public static void main(String[] args) throws FileNotFoundException{
		//1.创建属性对象
		Properties p = new Properties();
		
		//2.创建输入流
		FileInputStream fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\Reflect\\IO_Propertities\\dbinfo");
		
		//3.将fis流中的所有数据加载到属性对象中
		try {
			p.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String v1 = p.getProperty("driver");
		String v2 = p.getProperty("password");
		String v3 = p.getProperty("username");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
}