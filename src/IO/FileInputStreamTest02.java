package IO;

import java.io.*;
/*
 * ÿ����һ�η���һ���ֽڣ�Ƶ�����ʴ��̣�Ч�ʲ���
 */
public class FileInputStreamTest02 {

	public static void main(String argv[]){
		//1.������
		FileInputStream fis = null;
		int temp = 0;
		try {
			fis = new FileInputStream("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\temp01.txt");
			temp = fis.read();	
			while(temp!=-1){
				System.out.println(temp);
				temp = fis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}


