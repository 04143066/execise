package IO;

import java.io.*;

/*
 * ʹ��BufferedReader �� BufferedWriter��ɸ���
 */
public class Copy03 {

	public static void main(String[] args) throws Exception {
		String temp = null;
		BufferedReader br = new BufferedReader(new FileReader("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\Copy03.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\�ҵ�java����\\�����ڵ�\\src\\IO\\te.txt"));
		
		while((temp=br.readLine())!=null){
			bw.write(temp);
			System.out.println(temp);
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
