package Thread;
/*
 * t1��t2
 * �첽���ģ�ͣ�t1�߳�ִ��t1�ģ�t2�߳�ִ��t2�ģ������߳�֮��˭Ҳ����˭
 * ͬ�����ģ�ͣ�t1�̺߳�t2�߳�ִ�У���t1�̱߳����t2�߳�ִ�н���֮��t1����ִ�У�
 * 
 * ʲôʱ��Ҫͬ���أ�
 * 		Ϊ���������ݰ�ȫ������Ӧ�ó����ʹ���ʽ��ͣ�
 * ʲô������Ҫʹ���߳�ͬ����
 * 		1.�����Ƕ��̻߳���
 * 		2.���̻߳�������ͬһ������
 * 		3.�����������Ƶ��޸Ĳ���
 */
public class ThreadTest12 {
	public static void main(String[] args) {
		//����һ�������˻�
		Account act = new Account("actno-001",5000.0);
		
		//�����̶߳�ͬһ���˻���ȡ��
		//Porcessor p = new Porcessor(act);
		//Thread t1 = new Thread(p);
		//Thread t2 = new Thread(p);
		
		Thread t1 = new Thread(new Porcessor(act));
		Thread t2 = new Thread(new Porcessor(act));
		
		t1.start();
		t2.start();
	}
}

//ȡ���߳�
class Porcessor implements Runnable{

	//�˻�
	Account act;
	
	Porcessor(Account act){
		this.act = act;
	}
	@Override
	public void run() {
		act.withdraw(1000.0);
		System.out.println("ȡ��ɹ�����"+act.getBalance());
	}
}
	


class Account{
	private String actno;
	private double balance;
	public Account(){}
	public Account(String actno, double balance){
		this.actno = actno;
		this.balance = balance;
	}
	public String getActno() {
		return actno;
	}
	public void setActno(String actno) {
		this.actno = actno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double money){//�Ե�ǰ�˻�����ȡ�����
		
		/*
		 * ԭ��
		 * 		t1�̺߳�t2�߳�
		 * 		t1�߳�ִ�е��˴���������synchronized�ؼ��֣��ͻ�ȥȡ��this�Ķ�������
		 * 		����ҵ�this�������������ͬ��������ִ�г��򡣵�ͬ�������еĴ���ִ�н���֮��
		 * 		t1�̹߳黹this�Ķ�������
		 * 
		 * 		��t1�߳�ִ��ͬ������Ĺ����У����t2�߳�Ҳ����ִ�����´��룬Ҳ����synchronized
		 * 		�ؼ��֣�����Ҳȥ��this�Ķ����������Ǹö�����t1�̳߳��У�ֻ������ȴ�this����Ĺ黹��
		 * 
		 * 		����Ľ��߳�ͬ�����飬ͬһʱ����Զֻ��һ���߳�ִ����δ��롣
		 */
		
//		synchronized(this){			//ȡ�������е�ע�;���ȷ��
			double before = this.balance;
			double after = before - money;
			//�ӳ�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//����
			this.setBalance(after);
	//	}
		
	}
	
}