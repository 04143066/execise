package IO;

import java.io.*;

/* 
 * �ļ����ƣ�ֻ�ܸ��ƴ��ı��ļ�
 * 
 */
public class Copy02 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] chars = new char[512];
		int temp=0;
		try {
			//����
			fr = new FileReader("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\Copy02.java");
			fw = new FileWriter("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\Copy02.txt");
			//д
			while(true){
				temp = fr.read(chars);
				if(temp==-1)
					break;
				fw.write(chars,0,temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
