package Thread;
/*
 * 某线程正在休眠，如何打断它的休眠
 * 		以下方式依靠的是异常处理机制
 */
public class ThreadTest08 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new processor4());
		t.setName("t");
		t.start();
		
		Thread.sleep(5000);
		t.interrupt();
	}
}

class processor4 implements Runnable{

	@Override
	public void run() {
		try{
			Thread.sleep(10000000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
	
}