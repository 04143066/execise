package Thread;
/*
 * t1和t2
 * 异步编程模型，t1线程执行t1的，t2线程执行t2的，两个线程之间谁也不等谁
 * 同步编程模型，t1线程和t2线程执行，当t1线程必须等t2线程执行结束之后，t1才能执行，
 * 
 * 什么时候要同步呢？
 * 		为了引入数据安全，尽管应用程序的使用率降低，
 * 什么条件下要使用线程同步？
 * 		1.必须是多线程环境
 * 		2.多线程环境共享同一个数据
 * 		3.共享的数据设计到修改操作
 */
public class ThreadTest13 {
	public static void main(String[] args) {
		//创建一个公共账户
		Account1 act = new Account1("actno-001",5000.0);
		
		//创建线程对同一个账户的取款
		//Porcessor8 p = new Porcessor8(act);
		//Thread t1 = new Thread(p);
		//Thread t2 = new Thread(p);
		
		Thread t1 = new Thread(new Porcessor8(act));
		Thread t2 = new Thread(new Porcessor8(act));
		
		t1.start();
		t2.start();
	}
}

//取款线程
class Porcessor8 implements Runnable{

	//账户
	Account1 act;
	
	Porcessor8(Account1 act){
		this.act = act;
	}
	@Override
	public void run() {
		act.withdraw(1000.0);
		System.out.println("取款成功，余额："+act.getBalance());
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
	
	//synchronized关键字添加到成员方法上，线程拿走的也是this的对象锁
	public synchronized void withdraw(double money){//对当前账户进行取款操作
		
		
			double before = this.balance;
			double after = before - money;
			//延迟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//更新
			this.setBalance(after);
		
		
	}
	
}