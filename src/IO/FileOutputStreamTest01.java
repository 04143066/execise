package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.OutputStream;
 * 		java.io.FileOutputStream;�ļ��ֽ������
 * 
 * 		��������ڴ��е�����д��Ӳ���ļ���
 */
public class FileOutputStreamTest01 {

	public static void main(String atgv[]){
		
		//1.�����ļ��ֽ������
		FileOutputStream fos =null;
		try {
		//	fos = new FileOutputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\t1.txt");//�Ḳ��֮ǰ������
			fos = new FileOutputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\t1.txt",true);//׷��
			//temp02����������Զ�����
			//2.��ʼд
			//��Stringת����byte����
			String msg = "helloWorld";
			byte[] bytes = msg.getBytes();
			//fos.write(bytes);
			fos.write(bytes,0,3);
			//�Ƽ�����ʱ��Ϊ�˱�֤����д����Ӳ�̣�����Ҫˢ��
			fos.flush();//ǿ��д��
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
			}
		finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
