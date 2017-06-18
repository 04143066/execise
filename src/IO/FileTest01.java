package IO;

import java.io.File;
import java.io.IOException;

/*
 * java.io.File;
 * 		1.File类和流无关，不能通过该类完成文件读和写
 * 		2.File是文件和目录路径名的抽象
 * 
 * 	File代表是硬盘上的Directory和file
 */
public class FileTest01 {

	public static void main(String[] args) throws IOException {
		//path 路径
		File f1 = new File("E:\\我的java程序\\动力节点\\src\\IO\\t1.txt");
		File f3 = new File("t1.txt");
		System.out.println(f1.exists());
		System.out.println(f3.exists());
		
		File f4 = new File("F:/T");
		//如果存在则以目录的形式创建
		if(!f4.exists()){
			//创建目录
			f4.mkdir();
	//		f4.createNewFile();
		}
		
		File f5 = new File("f:/a/b/c/d/e");
		if(!f5.exists()){
			//创建多重目录
			f5.mkdirs();
		}
	}
}
