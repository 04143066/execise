package IO;

import java.io.*;

/*
 * java.io.InputStream;
 * 		java.io.FileInputStream;�ļ��ֽ�������
 * 		�����ֽڷ�ʽ��ȡ
 */
public class FileInputStreamTest01 {

	public static void main(String[] argv){
		//1.Ҫ����������
		FileInputStream fis = null;
		//String filePath = "temp01.txt";//���·��
		String filePath = "E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp01.txt";
		//String filePath = "E:/�ҵ�java����/�����ڵ�/src/IO/temp01.txt";
		try {
			fis = new FileInputStream(filePath);
		
			//2.��ʼ��
			
				int a = fis.read();
				int b = fis.read();
				int c = fis.read();
				int d = fis.read();
				
				System.out.println(a);//97
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
