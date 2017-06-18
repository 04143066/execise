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
		//延迟
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
	//synchronized添加到静态方法上，线程执行此方法的时候会找类锁
	public synchronized static void m1(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1...");
	}
	//不会等m1结束，因为该方法没有被synchronized修饰
	/*public static void m2(){
		System.out.println("m2...");
	}*/
	
	//虽然t1和t2没有共用同一个资源，但现在是类锁，类锁只有一个，有static就是类锁
	//m2方法等m1结束之后才能执行，该方法有synchronized
	//线程执行改代码需要“类锁”，而类锁只有一个
	public synchronized static void m2(){
		System.out.println("m2...");
	}
}