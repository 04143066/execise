package IO;

import java.io.*;

/*
 * 	java.io.Reader;
 * 		java.io.InputStreamReader;  ת�������ֽ�������-->�ַ���������
 * 			java.io.FileReader;     �ļ��ַ�������
 */
public class FileReaderTest01 {

	public static void main(String argv[]){
		//1.�����ļ��ַ�������
		FileReader fr = null;
		int temp=0;
		try {
			fr = new FileReader("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\FileReaderTest01.java");
			char[] chars = new char[512];           //1kB
			while((temp=fr.read(chars))!=-1){
				//��char������Ч����ת�����ַ���
				System.out.println(new String(chars,0,temp));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		}
	}
}
