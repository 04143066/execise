package IO;
/*
 * java.io.Writer;
 * 		java.io.OutputStreamWriter;  ת�������ֽ������-->�ַ��������
 * 			java.io.FileWriter;      �ļ��ַ������
 */
import java.io.*;

public class FileWriteTest01 {

	public static void main(String[] args){
		//�����ļ��ַ������
		FileWriter fw = null;
		try {
			//fw = new FileWriter("te.txt");
			fw = new FileWriter("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\te.txt",true);
			//д
			fw.write("nihao���");
			char[] chars = {'��','��','��','��','��','!',','};
			fw.write(chars,0,6);
			//ˢ��
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			//�ر�
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
