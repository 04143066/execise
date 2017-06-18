package Thread;

/*
 * ��������ֻ��һ���������������༶��ģ�ֻ��һ��
 */
public class ThreadTest16 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Processor10());
		Thread t2 = new Thread(new Processor10());
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		//�ӳ٣���֤t1��ִ��
		Thread.sleep(1000);
		t2.start();
	}
}

class Processor10 implements Runnable{
	
	public void run(){
		if("t1".equals(Thread.currentThread().getName()))
			Myclass2.m1();
		if("t2".equals(Thread.currentThread().getName()))
			Myclass2.m2();
		
	}
}

class Myclass2{
	//synchronized��ӵ���̬�����ϣ��߳�ִ�д˷�����ʱ���������
	public synchronized static void m1(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1...");
	}
	
	//�����m1��������Ϊ�÷���û�б�synchronized����
	public static void m2(){
		System.out.println("m2...");
	}
	
	//m2������m1����֮�����ִ�У��÷�����synchronized
	//�߳�ִ�иô�����Ҫ����������������ֻ��һ��   
	/*public synchronized static void m2(){
		System.out.println("m2...");
	}*/
}