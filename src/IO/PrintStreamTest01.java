package IO;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

/*
 * 	java.io.printStream; ��׼�������Ĭ�ϴ�ӡ������̨�����ֽڷ�ʽ
 * 	java.io.printWriter; ���ַ���ʽ
 */
public class PrintStreamTest01 {
	public static void main(String[] args) throws FileNotFoundException {
		//Ĭ�����������̨
		System.out.println("hello World");
		
		PrintStream ps = System.out;
		ps.print("java");
		
		//�ı��������
		System.setOut(new PrintStream(new FileOutputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\log")));
		
		//System.out.println("haha");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf.format(new Date()));
		m1();
		System.out.println(sdf.format(new Date()));
		
	}
	
	public static void m1(){
		System.out.println("m1 ������ִ��");
	}
}
