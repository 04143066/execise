package Decorator;

public class Test {

	public static void main(String args[]){
		//1.������װ����
		FileReader fr = new FileReader();
		
		//2.����װ����
		BufferedReader br = new BufferedReader(fr);
		
		//3.ͨ��ִ��װ�����еķ������ִ�б�װ�����еķ���
		br.close();
	}
}
