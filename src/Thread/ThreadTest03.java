package Thread;
/*
 * java��ʵ���̵߳ĵڶ��ַ�ʽ��
 * 		��һ����дһ����ʵ��java.lang.Runnable;�ӿ�
 * 		�ڶ�����ʵ��run()����		
 */

//��ѡ���ַ�ʽ����Ϊһ����ʵ�ֽӿ�֮�⣬�������˼̳�
public class ThreadTest03 {

	public static void main(String[] args) {
		//�����߳�
		Thread t = new Thread(new Processors());
		//����
		t.start();
	}
}

class Processors implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("run-->"+i);
		}
	}
}
