package IO;

import java.io.File;
import java.io.IOException;

/*
 * java.io.File;
 * 		1.File������޹أ�����ͨ����������ļ�����д
 * 		2.File���ļ���Ŀ¼·�����ĳ���
 * 
 * 	File������Ӳ���ϵ�Directory��file
 */
public class FileTest01 {

	public static void main(String[] args) throws IOException {
		//path ·��
		File f1 = new File("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\t1.txt");
		File f3 = new File("t1.txt");
		System.out.println(f1.exists());
		System.out.println(f3.exists());
		
		File f4 = new File("F:/T");
		//�����������Ŀ¼����ʽ����
		if(!f4.exists()){
			//����Ŀ¼
			f4.mkdir();
	//		f4.createNewFile();
		}
		
		File f5 = new File("f:/a/b/c/d/e");
		if(!f5.exists()){
			//��������Ŀ¼
			f5.mkdirs();
		}
	}
}
