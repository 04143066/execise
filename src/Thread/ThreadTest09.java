package Thread;

/*
 * 如何正确更好的终止一个正在执行的线程
 * 		
 * 		需求：线程启动5s之后终止
 */
public class ThreadTest09 {

	public static void main(String[] args) throws InterruptedException {
		Procesor5 p = new Procesor5();
		Thread t = new Thread(p);
		t.setName("t");
		t.start();
		Thread.sleep(5000);
		//终止
		p.runs=false;
	}
}

class Procesor5 implements Runnable {

	boolean runs = true;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (runs) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "-->" + i);
			} else
				return;
		}
	}
}