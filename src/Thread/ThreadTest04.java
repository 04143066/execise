package Thread;
/*
 * �����̵߳����ȼ�
 * 	
 * 		1.��ȡ��ǰ�̶߳���Thread.currenThread();
 * 		2.���߳�������t.SetName("t1");
 * 		3.��ȡ�̵߳����� t.getName();
 */
public class ThreadTest04 {

	public static void main(String argv[]){
		//��λ�ȡ��ǰ����
		Thread t = Thread.currentThread();//t������ڴ��ַָ����߳������̶߳���
		
		//��ȡ�̵߳�����
		System.out.println(t.getName());
		
		Thread t1 = new Thread(new Processo());
		t1.start();
		
		//���߳�����
		Thread t2 = new Thread(new Processo());
		t2.setName("t2");
		t2.start();
	}
}

class Processo implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
	
}