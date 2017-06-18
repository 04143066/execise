package Thread;
/*
 * 线程优先级高的获取的cpu时间片相对来说高一些
 * 	优先级：1-10
 * 		最低1，最高10，默认5 
 */
public class ThreadTest05 {

	public static void main(String[] args) {
		Thread t1 = new Processor1();
		t1.setName("t1");
		
		Thread t2 = new Processor1();
		t2.setName("t2");
		
		System.out.println(t1.getPriority());
		
		t1.setPriority(4);
		t2.setPriority(6);//优先级高，先结束
		
		//启动线程
		t1.start();
		t2.start();
	}
}

class Processor1 extends Thread{
	public void run(){
		for(int i=0; i<50; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}