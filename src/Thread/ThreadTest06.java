package Thread;
/*
 * 1.Tread.sleep(����)
 * 2.sleep������һ����̬����
 * 3.�÷��������ã�������ǰ�߳�
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

class Processor2 extends Thread{//�����ǵķ��������׳��ȸ��෽��������쳣��������throws
	//run()�������׳��쳣��������д��run()����ֻ����try,catch
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try {
				////�ڵ���sleep()�����Ĺ����У��̲߳����ͷŶ�������
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//m1();
	}
	/*m1��������throws,
	 * public void m1(){
		
	}*/
}