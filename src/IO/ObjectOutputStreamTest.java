package IO;

import java.io.*;

/*
 *   java.io.ObjectOutputStream; 序列化JAVA对象到硬盘（Serial）
 *   java.io.ObjectInputStream;  将硬盘中的数据“反序列化”到JVM内存.(DeSerial)
 *   
 *   Compile 编译（java-->class)
 *   DeCompile  反编译 （class-->java）
 */
class ObjectOutputStreamTest {
	public static void main(String[] args) throws Exception{
		//创建java对象
		User u1= new User("刘德华");
		
		//创建输出流 (序列化流)  （JVM的java对象状态保存到硬盘中）
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\我的java程序\\动力节点\\src\\IO\\temp06"));
		
		//写
		oos.writeObject(u1);
		
		//刷新
		oos.flush();
		
		//关闭
		oos.close();
	}
}

