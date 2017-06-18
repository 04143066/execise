package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/*
 *  关于定时器的应用
 *  	作用：每隔一段时间固定的时间执行一段代码
 *  
 *  	t.schedule(TimerTask task, Date firstTime, long period);
 */
public class TimerTest01 {

	public static void main(String[] args) throws ParseException {
		//1.创建定时器
		Timer t = new Timer();
		
		//2.指定定时任务
		t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2016-5-24 13:37:00 000"),5*1000);
	}
}
 
class LogTimerTask extends TimerTask{//抽象类不能new实例化，但可以创建一个匿名内部类来实现

	@Override
	public void run() {
		
		try {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2016-5-24 13:34:00 000"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}