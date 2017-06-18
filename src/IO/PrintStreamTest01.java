package IO;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

/*
 * 	java.io.printStream; 标准输出流，默认打印到控制台，以字节方式
 * 	java.io.printWriter; 以字符方式
 */
public class PrintStreamTest01 {
	public static void main(String[] args) throws FileNotFoundException {
		//默认输出到控制台
		System.out.println("hello World");
		
		PrintStream ps = System.out;
		ps.print("java");
		
		//改变输出方向
		System.setOut(new PrintStream(new FileOutputStream("E:\\我的java程序\\动力节点\\src\\IO\\log")));
		
		//System.out.println("haha");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf.format(new Date()));
		m1();
		System.out.println(sdf.format(new Date()));
		
	}
	
	public static void m1(){
		System.out.println("m1 方法被执行");
	}
}
