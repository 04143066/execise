package IO;

import java.io.*;

/*
 * 	int read(byte[] bytes)
 *  读取之前在内存中准备一个byte数组。每次读取一个多字节存储到byte数组中。
 *  一次读取多个字节，不是单字节读取了。
 *  
 *  效率高。
 */
public class FileInputStreamTest03 {

	public static void main(String argv[]){
		FileInputStream fis;
		byte[] bytes = new byte[3];//3个字节
		try {
			//创建输入流
			fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\temp01.txt");
			//每次读三个字节
			int i1 = fis.read(bytes);
			System.out.println(new String(bytes));
			
			int i2 = fis.read(bytes);
			System.out.println(new String(bytes));//注意
			System.out.println(new String(bytes,0,i2));
			
			int i3 = fis.read(bytes);
			
			System.out.println(i1);//3
			System.out.println(i2);//1
			System.out.println(i3);//-1    已经到达文件的末尾
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
