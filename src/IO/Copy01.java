package IO;

import java.io.*;

/*
 * 关于文件复制粘贴
 */
public class Copy01 {

	public static void main(String argv[]){
		//先创建输入流
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int temp;
		byte[] bytes =new byte[1024];
		try {
			fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\FileInputStreamTest01.java");
			fos = new FileOutputStream("E:\\我的java程序\\动力节点\\src\\IO\\to.txt",true);
			while((temp = fis.read(bytes))!=-1){
				fos.write(bytes, 0, temp);	
			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{		
				try {
					if(fis!=null)
						fis.close();
					if(fos!=null)
						fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}	
	}
}
