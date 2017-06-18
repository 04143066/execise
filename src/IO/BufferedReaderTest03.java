package IO;

import java.io.*;
import java.util.*;

/*
 * 接收用户键盘输入
 */
public class BufferedReaderTest03 {
	public static void main(String[] args) throws Exception {
		//以前的方式
		Scanner s = new Scanner(System.in);//System.in 是一个标准的输入流，默认接收键盘的输入
		//程序执行到此处停下来，等待用户输入
		String str = s.next();
		System.out.println("您输入了："+str);// 空格之后接收不到
		
		//使用BufferedReader用来接收用户的输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		String str1 = br.readLine();
		
		System.out.println("您输入了:"+str1);
		
		//关闭 
		br.close();
	}

}
