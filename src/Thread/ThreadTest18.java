package Thread;
/*
 * 		�߳̿��Է�Ϊ���֣��û��̣߳�֮ǰ�������û��̣߳�����һ�����ػ��̣߳�
 * 		�ػ��߳��������ģ����е��û��߳̽����������ڣ��ػ��̲߳Ż�������ڣ�
 * 		ֻҪ��һ���û��̴߳��ڣ���ô�ػ��߳̾Ͳ�����������磺java������
 * 		����������������һ���ػ��̣߳�ֻ��Ӧ�ó��������е��߳̽��������Ż������
 * 
 * 		java�������һ�����̣� ������֮�󲻽�ֻ��һ�������̣�����һ�����������̣߳�
 * 		 
 * 
 * �ػ��߳�
 * 		�������е��û��߳̽��������ػ��߳��˳�
 * 		�ػ��߳�һ�㶼������ִ�е�
 * 
 * 		�ĳ������������Զ�����
 */
public class ThreadTest18 {

	public static void main(String[] args) {
		Thread t1 = new Processor12();
		t1.setName("t1");
		
		//��t1����̱߳�ǳ��ػ��߳�
		t1.setDaemon(true);
		t1.start();
		
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Processor12 extends Thread{
	public void run(){
		int i=0;
		while(true){
			System.out.println(Thread.currentThread().getName()+"-->"+(i++));
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}