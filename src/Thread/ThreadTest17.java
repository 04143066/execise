package Thread;

public class ThreadTest17 {

	public static void main(String[] args) throws InterruptedException {
		
		Myclass3 mc1 = new Myclass3();
		Myclass3 mc2 = new Myclass3();
		
		Thread t1 = new Thread(new Processor11(mc1));
		Thread t2 = new Thread(new Processor11(mc2));
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		//�ӳ�
		Thread.sleep(1000);
		t2.start();
	}
}

class Processor11 implements Runnable{
	
	Myclass3 mc;
	Processor11(Myclass3 mc){
		this.mc = mc;
	}
	public void run(){
		if("t1".equals(Thread.currentThread().getName()))
			mc.m1();
		if("t2".equals(Thread.currentThread().getName()))
			mc.m2();
		
	}
}

class Myclass3{
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
	/*public static void m2(){
		System.out.println("m2...");
	}*/
	
	//��Ȼt1��t2û�й���ͬһ����Դ��������������������ֻ��һ������static��������
	//m2������m1����֮�����ִ�У��÷�����synchronized
	//�߳�ִ�иĴ�����Ҫ����������������ֻ��һ��
	public synchronized static void m2(){
		System.out.println("m2...");
	}
}