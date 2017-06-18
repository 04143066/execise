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
public class ThreadTest12 {
	public static void main(String[] args) {
		//创建一个公共账户
		Account act = new Account("actno-001",5000.0);
		
		//创建线程对同一个账户的取款
		//Porcessor p = new Porcessor(act);
		//Thread t1 = new Thread(p);
		//Thread t2 = new Thread(p);
		
		Thread t1 = new Thread(new Porcessor(act));
		Thread t2 = new Thread(new Porcessor(act));
		
		t1.start();
		t2.start();
	}
}

//取款线程
class Porcessor implements Runnable{

	//账户
	Account act;
	
	Porcessor(Account act){
		this.act = act;
	}
	@Override
	public void run() {
		act.withdraw(1000.0);
		System.out.println("取款成功，余额："+act.getBalance());
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
	
	public void withdraw(double money){//对当前账户进行取款操作
		
		/*
		 * 原理：
		 * 		t1线程和t2线程
		 * 		t1线程执行到此处，遇到了synchronized关键字，就会去取找this的对象锁，
		 * 		如果找到this对象锁，则进入同步语句块中执行程序。当同步语句块中的代码执行结束之后，
		 * 		t1线程归还this的对象锁。
		 * 
		 * 		在t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也遇到synchronized
		 * 		关键字，所以也去找this的对象锁，但是该对象锁t1线程持有，只能在这等待this对象的归还。
		 * 
		 * 		下面的叫线程同步语句块，同一时刻永远只有一个线程执行这段代码。
		 */
		
//		synchronized(this){			//取消掉此行的注释就正确了
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
	//	}
		
	}
	
}