package IO;

import java.io.*;

/*
 * java.io.DataOutputStream; �����ֽ������
 * ���Խ��ڴ��еġ�int i = 10�� д��ȥ�Ĳ����ַ������Ƕ��������ݣ�������д��ȥ��
 */
public class DataOutputStreamTest01 {

	public static void main(String[] args) throws Exception {
		//���������ֽ������
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp05"));
		
		//׼������
		byte b = 10;
		short s = 11;
		int i = 12;
		long l = 1000L;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';
		
		//д
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		
		//ˢ��
		dos.flush();
		
		//�ر�
		dos.close();
	}
}











