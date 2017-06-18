package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.OutputStream;
 * 		java.io.FileOutputStream;文件字节输出流
 * 
 * 		将计算机内存中的数据写入硬盘文件中
 */
public class FileOutputStreamTest01 {

	public static void main(String atgv[]){
		
		//1.创建文件字节输出流
		FileOutputStream fos =null;
		try {
		//	fos = new FileOutputStream("E:\\我的java程序\\动力节点\\src\\IO\\t1.txt");//会覆盖之前的数据
			fos = new FileOutputStream("E:\\我的java程序\\动力节点\\src\\IO\\t1.txt",true);//追加
			//temp02如果不存在自动创建
			//2.开始写
			//将String转换成byte数组
			String msg = "helloWorld";
			byte[] bytes = msg.getBytes();
			//fos.write(bytes);
			fos.write(bytes,0,3);
			//推荐最后的时候为了保证数据写入了硬盘，所以要刷新
			fos.flush();//强制写入
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
			}
		finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
