package IO;

import java.io.*;

/*
 * �����ļ�����ճ��
 */
public class Copy01 {

	public static void main(String argv[]){
		//�ȴ���������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int temp;
		byte[] bytes =new byte[1024];
		try {
			fis = new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\FileInputStreamTest01.java");
			fos = new FileOutputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\to.txt",true);
			while((temp = fis.read(bytes))!=-1){
				fos.write(bytes, 0, temp);	
			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally{		
				try {
					if(fis!=null)
						fis.close();
					if(fos!=null)
						fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}	
	}
}
