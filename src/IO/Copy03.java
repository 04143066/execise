package IO;

import java.io.*;

/*
 * 使用BufferedReader 和 BufferedWriter完成复制
 */
public class Copy03 {

	public static void main(String[] args) throws Exception {
		String temp = null;
		BufferedReader br = new BufferedReader(new FileReader("E:\\我的java程序\\动力节点\\src\\IO\\Copy03.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\我的java程序\\动力节点\\src\\IO\\te.txt"));
		
		while((temp=br.readLine())!=null){
			bw.write(temp);
			System.out.println(temp);
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
