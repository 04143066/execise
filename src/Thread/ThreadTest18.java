package Thread;
/*
 * 		线程可以分为两种：用户线程（之前讲的是用户线程），另一个是守护线程，
 * 		守护线程是这样的，所有的用户线程结束生命周期，守护线程才会结束周期，
 * 		只要有一个用户线程存在，那么守护线程就不会结束，例如：java中著名
 * 		的垃圾回收器就是一个守护线程，只有应用程序中所有的线程结束，它才会结束。
 * 
 * 		java虚拟机是一个进程， 它启动之后不仅只有一个主进程，还有一个垃圾回收线程，
 * 		 
 * 
 * 守护线程
 * 		其他所有的用户线程结束，则守护线程退出
 * 		守护线程一般都是无限执行的
 * 
 * 		改程序运行五秒自动结束
 */
public class ThreadTest18 {

	public static void main(String[] args) {
		Thread t1 = new Processor12();
		t1.setName("t1");
		
		//将t1这个线程标记成守护线程
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