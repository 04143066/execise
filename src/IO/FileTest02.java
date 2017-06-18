package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {

	public static void main(String[] args) {
		
		//1.��ȡ����·��
		File f1 = new File("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\FileInputStreamTest01.java");
		
		String absolutePath = f1.getAbsolutePath();
		System.out.println(absolutePath);
		
		//2.��ȡ�ļ���
		System.out.println(f1.getName());//Test02.java
		
		//3.��ȡ��·��
		File f2 = new File("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\t1.txt");
		String parenPath = f2.getParent();
		System.out.println(parenPath);
		
		//4.�жϸ�File��Directory����File
		System.out.println(f1.isDirectory());//false
		System.out.println(f1.isFile());
		
		//5.��ȡ�ļ����һ���޸�ʱ��
		Date t = new Date(f1.lastModified());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
	
		//6.��ȡ�ļ��ĳ���(�ֽ���)
		System.out.println(f1.length());
		
		//7.�г����ļ�
		File f3 = new File("E:\\�ҵ�java����\\�����ڵ�\\src\\");
		File[] fs = f3.listFiles();
		for(File f:fs){
			if(f.getAbsolutePath().endsWith(".java"));
				System.out.println(f.getAbsolutePath());
		}
		
	}
}
