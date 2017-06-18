package IO;

import java.io.*;

/* 
 * 文件复制，只能复制纯文本文件
 * 
 */
public class Copy02 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] chars = new char[512];
		int temp=0;
		try {
			//创建
			fr = new FileReader("E:\\我的java程序\\动力节点\\src\\IO\\Copy02.java");
			fw = new FileWriter("E:\\我的java程序\\动力节点\\src\\IO\\Copy02.txt");
			//写
			while(true){
				temp = fr.read(chars);
				if(temp==-1)
					break;
				fw.write(chars,0,temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
