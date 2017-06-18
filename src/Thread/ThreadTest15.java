package Thread;
/*
 * 因为两个线程没有共用同一个资源，所以t2不会等t1打印后才打印
 */
public class ThreadTest15 {

	public static void main(String argv[]) throws InterruptedException{
		myClass1 mc1 = new myClass1();
		myClass1 mc2 = new myClass1();
		Processor9 p1 = new Processor9(mc1);
		Processor9 p2 = new Processor9(mc2);
		
		Thread t1 = new Thread(p1);
		t1.setName("t1");
		Thread t2 = new Thread(p2);
		t2.setName("t2");
		
		t1.start();
		//延迟，保证t1线程先启动，
		Thread.sleep(1000);
		t2.start();
	}
}

class Processor9 implements Runnable{

	myClass1 mc;
	Processor9(myClass1 mc){
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

class myClass1{
	
	public synchronized void m1(){
		//休眠
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1....");
	}
	

	public synchronized void m2(){
		System.out.println("m2....");
	}
}