package IO;

import java.io.*;

/*
 * 	java.io.Reader;
 * 		java.io.InputStreamReader;  转换流（字节输入流-->字符输入流）
 * 			java.io.FileReader;     文件字符输入流
 */
public class FileReaderTest01 {

	public static void main(String argv[]){
		//1.创建文件字符输入流
		FileReader fr = null;
		int temp=0;
		try {
			fr = new FileReader("E:\\我的java程序\\动力节点\\src\\IO\\FileReaderTest01.java");
			char[] chars = new char[512];           //1kB
			while((temp=fr.read(chars))!=-1){
				//将char数组有效部分转换成字符串
				System.out.println(new String(chars,0,temp));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		}
	}
}
