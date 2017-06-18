package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/*
 *  ���ڶ�ʱ����Ӧ��
 *  	���ã�ÿ��һ��ʱ��̶���ʱ��ִ��һ�δ���
 *  
 *  	t.schedule(TimerTask task, Date firstTime, long period);
 */
public class TimerTest01 {

	public static void main(String[] args) throws ParseException {
		//1.������ʱ��
		Timer t = new Timer();
		
		//2.ָ����ʱ����
		t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2016-5-24 13:37:00 000"),5*1000);
	}
}
 
class LogTimerTask extends TimerTask{//�����಻��newʵ�����������Դ���һ�������ڲ�����ʵ��

	@Override
	public void run() {
		
		try {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2016-5-24 13:34:00 000"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}