package Thread;

public class ThreadTest14 {

	public static void main(String argv[]) throws InterruptedException{
		myClass mc = new myClass();
		Processor8 p = new Processor8(mc);
		
		Thread t1 = new Thread(p);
		t1.setName("t1");
		Thread t2 = new Thread(p);
		t2.setName("t2");
		
		t1.start();
		//�ӳ٣���֤t1�߳���������
		Thread.sleep(1000);
		t2.start();
	}
}

class Processor8 implements Runnable{

	myClass mc;
	Processor8(myClass mc){
		this.mc = mc;
	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("t1"))
			mc.m1();
		if(Thread.currentThread().getName().equals("t2"))
			mc.m2();
	}
	
}

class myClass{
	
	public synchronized void m1(){
		//����
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1....");
	}
	
	public void m2(){
		System.out.println("m2....");
	}//m2����ͬ���ģ�����m2���õ�m1��ӡ����ٴ�ӡ
	
	/*public synchronized void m2(){
		System.out.println("m2....");
	}*///m2��Ҫ��
}