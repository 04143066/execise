package IO;
/*
 * java.io.Writer;
 * 		java.io.OutputStreamWriter;  转换流（字节输出流-->字符输出流）
 * 			java.io.FileWriter;      文件字符输出流
 */
import java.io.*;

public class FileWriteTest01 {

	public static void main(String[] args){
		//创建文件字符输出流
		FileWriter fw = null;
		try {
			//fw = new FileWriter("te.txt");
			fw = new FileWriter("E:\\我的java程序\\动力节点\\src\\IO\\te.txt",true);
			//写
			fw.write("nihao你好");
			char[] chars = {'我','是','中','国','人','!',','};
			fw.write(chars,0,6);
			//刷新
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			//关闭
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
