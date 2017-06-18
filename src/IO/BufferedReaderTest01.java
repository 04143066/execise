package IO;

import java.io.*;

/*
 * BufferedInputStream;  //�ֽ�
 * BufferedOutputStream;
 * BufferedReader;  //���л��������ַ�������
 * BufferedWriter;  //���л��������ַ������
 */
public class BufferedReaderTest01 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br =null;
		try {
			fr = new FileReader("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\FileInputStreamTest01.java");
			br = new BufferedReader(fr);
			
			//���������ֵ�λ�ã����ֿ��Է�Ϊ����װ�����ߴ�����       �ͽڵ���
			//FileReader �Ǹ��ڵ���
			//BufferedReader ��һ����װ�������ߴ�����
			//��ʼ��
			String temp = null;
			while((temp=br.readLine())!=null){//br.readLine()������ȡһ�У�������β�������з�
				//System.out.print(temp);//���һ��
				System.out.println(temp);//
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();//ֻ��ر�������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}










