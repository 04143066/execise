package IO;

import java.io.*;

/*
 *   java.io.ObjectOutputStream; ���л�JAVA����Ӳ�̣�Serial��
 *   java.io.ObjectInputStream;  ��Ӳ���е����ݡ������л�����JVM�ڴ�.(DeSerial)
 *   
 *   Compile ���루java-->class)
 *   DeCompile  ������ ��class-->java��
 */
class ObjectOutputStreamTest {
	public static void main(String[] args) throws Exception{
		//����java����
		User u1= new User("���»�");
		
		//��������� (���л���)  ��JVM��java����״̬���浽Ӳ���У�
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp06"));
		
		//д
		oos.writeObject(u1);
		
		//ˢ��
		oos.flush();
		
		//�ر�
		oos.close();
	}
}

