package Decorator;
//ʹ��BufferedReader ��FileReader�е�close����������չ
//1.װ����ģʽ��Ҫ��װ���к��б�װ���ߵ�����
//2.װ����ģʽ��Ҫ��װ���ߺͱ�װ����Ӧ��ʵ��ͬһ�����ͣ��ӿڣ�
public class BufferedReader extends Reader{ //BufferedReader װ����
	//������ϵ
	//FileReader reader;//FileReader���Ǳ�װ��
	Reader reader;//�̳�֮��Ϳ���ֻдReader�ͺ�,BufferedReader �� FileReader �Ĺ�ϵ�Ͳ�����
	//Constructor
	//BufferedReader(FileReader reader){
	BufferedReader(Reader reader){//Reader reader = new FileReader()
		this.reader = reader;
	}
	
	//��FileReader�е�close����������չ
	public void close(){
		System.out.println("��չ����1");
		reader.close();
		System.out.println("��չ����2");
	}
}
