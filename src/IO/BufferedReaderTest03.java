package IO;

import java.io.*;
import java.util.*;

/*
 * �����û���������
 */
public class BufferedReaderTest03 {
	public static void main(String[] args) throws Exception {
		//��ǰ�ķ�ʽ
		Scanner s = new Scanner(System.in);//System.in ��һ����׼����������Ĭ�Ͻ��ռ��̵�����
		//����ִ�е��˴�ͣ�������ȴ��û�����
		String str = s.next();
		System.out.println("�������ˣ�"+str);// �ո�֮����ղ���
		
		//ʹ��BufferedReader���������û�������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		String str1 = br.readLine();
		
		System.out.println("��������:"+str1);
		
		//�ر� 
		br.close();
	}

}
