package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest03 {

	public static void main(String[] args) {
		//查找当前目录下所有的目录和文件
		File f = new File("E:\\我的java程序\\动力节点\\src");
		
		method(f);
	}

	private static void method(File f) {
		
		if(f.isFile()){
			String absolutePath = f.getAbsolutePath();
			String newPath = "F:\\TTT\\"+absolutePath.substring(21);
			try {
				System.out.println(newPath);
				File parentFile = new File(newPath).getParentFile();
				if(!parentFile.exists())
					parentFile.mkdir();
				copy(absolutePath,newPath);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		File[] fs = f.listFiles();
		for(File f1:fs){
			//System.out.println(f1.getAbsolutePath());
			method(f1);
		}
	}
	
	private static void copy(String absolutePath, String string) throws Exception {
		FileInputStream fis = new FileInputStream(absolutePath);
		FileOutputStream fos = new FileOutputStream(string);
		
		byte[] bytes = new byte[1024];
		int temp = 0;
		while((temp=fis.read(bytes))!=-1){
			fos.write(bytes, 0, temp);
		}
		fis.close();
		fos.flush();
		fos.close();
			
	}

	
}
