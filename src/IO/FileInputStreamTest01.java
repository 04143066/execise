package IO;

import java.io.*;

/*
 * java.io.InputStream;
 * 		java.io.FileInputStream;文件字节输入流
 * 		按照字节方式读取
 */
public class FileInputStreamTest01 {

	public static void main(String[] argv){
		//1.要创建输入流
		FileInputStream fis = null;
		//String filePath = "temp01.txt";//相对路径
		String filePath = "E:\\我的java程序\\动力节点\\src\\IO\\temp01.txt";
		//String filePath = "E:/我的java程序/动力节点/src/IO/temp01.txt";
		try {
			fis = new FileInputStream(filePath);
		
			//2.开始读
			
				int a = fis.read();
				int b = fis.read();
				int c = fis.read();
				int d = fis.read();
				
				System.out.println(a);//97
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
