package Thread;
/*
 * 1.Tread.sleep(毫秒)
 * 2.sleep方法是一个静态方法
 * 3.该方法的作用：阻塞当前线程
 */
public class ThreadTest06 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Processor2();
		t1.setName("t1");
		t1.start();
		
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(500);
		}
	}
}

class Processor2 extends Thread{//被覆盖的方法不能抛出比父类方法更多的异常，不能用throws
	//run()方法不抛出异常，所以重写的run()方法只能用try,catch
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try {
				////在调用sleep()方法的过程中，线程不会释放对象锁。
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//m1();
	}
	/*m1方法可以throws,
	 * public void m1(){
		
	}*/
}