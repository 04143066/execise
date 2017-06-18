package IO;

import java.io.*;

/*
 * 反序列化
 */
public class ObjectInputStreamTest {

	public static void main(String[] args) throws Exception{
		//创建反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\temp06"));
		
		//反序列化
		Object o = ois.readObject();
		System.out.println(o);
		
		//关闭
		ois.close();
	}
}
