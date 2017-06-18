package IO;

import java.io.*;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
		//1.创建流
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\temp01.txt");
			System.out.println(fis.available());//4    
			System.out.println(fis.read());//97
			System.out.println(fis.available());//3
			//available() 返回下一次输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余值
			fis.skip(1);//跳过一个字节
			System.out.println(fis.available());//2
			System.out.println(fis.read());//99
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{ 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
