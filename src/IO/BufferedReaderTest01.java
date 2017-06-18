package IO;

import java.io.*;

/*
 * BufferedInputStream;  //字节
 * BufferedOutputStream;
 * BufferedReader;  //带有缓冲区的字符输入流
 * BufferedWriter;  //带有缓冲区的字符输出流
 */
public class BufferedReaderTest01 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br =null;
		try {
			fr = new FileReader("E:\\我的java程序\\动力节点\\src\\IO\\FileInputStreamTest01.java");
			br = new BufferedReader(fr);
			
			//根据流出现的位置，流又可以分为：包装流或者处理流       和节点流
			//FileReader 是个节点流
			//BufferedReader 是一个包装流，或者处理流
			//开始读
			String temp = null;
			while((temp=br.readLine())!=null){//br.readLine()方法读取一行，但是行尾不带换行符
				//System.out.print(temp);//输出一行
				System.out.println(temp);//
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();//只需关闭最外面
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}










