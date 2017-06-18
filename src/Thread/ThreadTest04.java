package Thread;
/*
 * 关于线程的优先级
 * 	
 * 		1.获取当前线程对象Thread.currenThread();
 * 		2.给线程起名字t.SetName("t1");
 * 		3.获取线程的名字 t.getName();
 */
public class ThreadTest04 {

	public static void main(String argv[]){
		//如何获取当前对象
		Thread t = Thread.currentThread();//t保存的内存地址指向的线程是主线程对象
		
		//获取线程的名字
		System.out.println(t.getName());
		
		Thread t1 = new Thread(new Processo());
		t1.start();
		
		//给线程起名
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