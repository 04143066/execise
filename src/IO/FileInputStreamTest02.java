package IO;

import java.io.*;
/*
 * 每访问一次访问一个字节，频繁访问磁盘，效率不高
 */
public class FileInputStreamTest02 {

	public static void main(String argv[]){
		//1.创建流
		FileInputStream fis = null;
		int temp = 0;
		try {
			fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\temp01.txt");
			temp = fis.read();	
			while(temp!=-1){
				System.out.println(temp);
				temp = fis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}


