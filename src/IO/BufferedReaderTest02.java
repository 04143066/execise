package IO;

import java.io.*;

/*
 * BufferedReader
 */
public class BufferedReaderTest02 {

	public static void main(String argv[]) throws Exception{
		//创建一个带有缓冲区的字符输入流
		FileInputStream fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\FileInputStreamTest01.java");
		
		//转换流（将字节流转换成字符流）
		InputStreamReader isr = new InputStreamReader(fis);//isr是字符流
		
		BufferedReader br = new BufferedReader(isr);
		
		//开始读
		String temp = null;
		while((temp = br.readLine())!=null){
			System.out.println(temp);
		}
		
		//关闭
		br.close();//装饰者模式
		
	}
}
