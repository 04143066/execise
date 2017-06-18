package IO;

import java.io.*;

public class BufferedWriterTest01 {

	public static void main(String argv[]) throws Exception{
		
		//创建带有缓冲区的字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\我的java程序\\动力节点\\src\\IO\\t1.txt",true));
		//开始写
		bw.write("奥运会！");
		//写入一个行分隔符
		bw.newLine();
		
		bw.write("没一点意思");
		//刷新
		bw.flush();
		
		//关闭
		bw.close();
	}
}
