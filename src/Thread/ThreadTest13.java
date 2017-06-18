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
public class ThreadTest13 {
	public static void main(String[] args) {
		//����һ�������˻�
		Account1 act = new Account1("actno-001",5000.0);
		
		//�����̶߳�ͬһ���˻���ȡ��
		//Porcessor8 p = new Porcessor8(act);
		//Thread t1 = new Thread(p);
		//Thread t2 = new Thread(p);
		
		Thread t1 = new Thread(new Porcessor8(act));
		Thread t2 = new Thread(new Porcessor8(act));
		
		t1.start();
		t2.start();
	}
}

//ȡ���߳�
class Porcessor8 implements Runnable{

	//�˻�
	Account1 act;
	
	Porcessor8(Account1 act){
		this.act = act;
	}
	@Override
	public void run() {
		act.withdraw(1000.0);
		System.out.println("ȡ��ɹ�����"+act.getBalance());
	}
}
	


class Account1{
	private String actno;
	private double balance;
	public Account1(){}
	public Account1(String actno, double balance){
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
	
	//synchronized�ؼ�����ӵ���Ա�����ϣ��߳����ߵ�Ҳ��this�Ķ�����
	public synchronized void withdraw(double money){//�Ե�ǰ�˻�����ȡ�����
		
		
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
		
		
	}
	
}