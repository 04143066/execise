package IO;

import java.io.*;

public class BufferedWriterTest01 {

	public static void main(String argv[]) throws Exception{
		
		//�������л��������ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\t1.txt",true));
		//��ʼд
		bw.write("���˻ᣡ");
		//д��һ���зָ���
		bw.newLine();
		
		bw.write("ûһ����˼");
		//ˢ��
		bw.flush();
		
		//�ر�
		bw.close();
	}
}
