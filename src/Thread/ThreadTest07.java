package Thread;

public class ThreadTest07 {

	public static void main(String[] args) throws InterruptedException {
		//创建线程
		Thread t = new Processor3();
		t.setName("t");
		
		//启动线程
		t.start();
		
		//休眠
		//Thread.sleep(5000);
		t.sleep(5000);//阻塞的是main方法
		System.out.println("HelloWorld");
	}
}

class Processor3 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}