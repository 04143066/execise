package IO;

import java.io.*;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
		//1.������
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp01.txt");
			System.out.println(fis.available());//4    
			System.out.println(fis.read());//97
			System.out.println(fis.available());//3
			//available() ������һ�����������õķ������Բ��������شӴ���������ȡ�����������Ĺ���ʣ��ֵ
			fis.skip(1);//����һ���ֽ�
			System.out.println(fis.available());//2
			System.out.println(fis.read());//99
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
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
