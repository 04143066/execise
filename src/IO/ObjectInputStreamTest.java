package IO;

import java.io.*;

/*
 * �����л�
 */
public class ObjectInputStreamTest {

	public static void main(String[] args) throws Exception{
		//���������л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp06"));
		
		//�����л�
		Object o = ois.readObject();
		System.out.println(o);
		
		//�ر�
		ois.close();
	}
}
