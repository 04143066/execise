package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {

	public static void main(String[] args) {
		
		//1.获取绝对路径
		File f1 = new File("E:\\我的java程序\\动力节点\\src\\IO\\FileInputStreamTest01.java");
		
		String absolutePath = f1.getAbsolutePath();
		System.out.println(absolutePath);
		
		//2.获取文件名
		System.out.println(f1.getName());//Test02.java
		
		//3.获取父路径
		File f2 = new File("E:\\我的java程序\\动力节点\\src\\IO\\t1.txt");
		String parenPath = f2.getParent();
		System.out.println(parenPath);
		
		//4.判断该File是Directory还是File
		System.out.println(f1.isDirectory());//false
		System.out.println(f1.isFile());
		
		//5.获取文件最后一次修改时间
		Date t = new Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
	
		//6.获取文件的长度(字节数)
		System.out.println(f1.length());
		
		//7.列出子文件
		File f3 = new File("E:\\我的java程序\\动力节点\\src\\");
		File[] fs = f3.listFiles();
		for(File f:fs){
			if(f.getAbsolutePath().endsWith(".java"));
				System.out.println(f.getAbsolutePath());
		}
		
	}
}
