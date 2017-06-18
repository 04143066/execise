package IO;

import java.io.*;

public class FileInputStreamTest04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\我的java程序\\动力节点\\src\\IO\\FileInputStreamTest01.java");
			byte[] bytes = new byte[1024];//每次读以1kB
			int temp;
			/*while(true){
				temp = fis.read(bytes);
				if(temp==-1) break;
				System.out.print(new String(bytes,0,temp));
			}*/
			
			while((temp=fis.read(bytes)) != -1){
				System.out.print(new String(bytes,0,temp));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
