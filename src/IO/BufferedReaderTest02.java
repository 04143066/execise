package IO;

import java.io.*;

/*
 * BufferedReader
 */
public class BufferedReaderTest02 {

	public static void main(String argv[]) throws Exception{
		//����һ�����л��������ַ�������
		FileInputStream fis = new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\FileInputStreamTest01.java");
		
		//ת���������ֽ���ת�����ַ�����
		InputStreamReader isr = new InputStreamReader(fis);//isr���ַ���
		
		BufferedReader br = new BufferedReader(isr);
		
		//��ʼ��
		String temp = null;
		while((temp = br.readLine())!=null){
			System.out.println(temp);
		}
		
		//�ر�
		br.close();//װ����ģʽ
		
	}
}
