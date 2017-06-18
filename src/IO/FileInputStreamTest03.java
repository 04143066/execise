package IO;

import java.io.*;

/*
 * 	int read(byte[] bytes)
 *  ��ȡ֮ǰ���ڴ���׼��һ��byte���顣ÿ�ζ�ȡһ�����ֽڴ洢��byte�����С�
 *  һ�ζ�ȡ����ֽڣ����ǵ��ֽڶ�ȡ�ˡ�
 *  
 *  Ч�ʸߡ�
 */
public class FileInputStreamTest03 {

	public static void main(String argv[]){
		FileInputStream fis;
		byte[] bytes = new byte[3];//3���ֽ�
		try {
			//����������
			fis = new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp01.txt");
			//ÿ�ζ������ֽ�
			int i1 = fis.read(bytes);
			System.out.println(new String(bytes));
			
			int i2 = fis.read(bytes);
			System.out.println(new String(bytes));//ע��
			System.out.println(new String(bytes,0,i2));
			
			int i3 = fis.read(bytes);
			
			System.out.println(i1);//3
			System.out.println(i2);//1
			System.out.println(i3);//-1    �Ѿ������ļ���ĩβ
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
