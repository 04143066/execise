package Thread;

/*
 * �����ȷ���õ���ֹһ������ִ�е��߳�
 * 		
 * 		�����߳�����5s֮����ֹ
 */
public class ThreadTest09 {

	public static void main(String[] args) throws InterruptedException {
		Procesor5 p = new Procesor5();
		Thread t = new Thread(p);
		t.setName("t");
		t.start();
		Thread.sleep(5000);
		//��ֹ
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