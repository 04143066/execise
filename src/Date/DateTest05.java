package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 日历
 */
public class DateTest05 {

	public static void main(String argv[]){
		
		//获取系统当前的日历
		
		Calendar c = Calendar.getInstance();
		
		//查看当前日历的星期几
		int i = c.get(Calendar.DAY_OF_WEEK);
		int j = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		System.out.println(j);
		
		//获取2008年 8 8 是星期几
		String strTime = "2008,08,08";
		try {
			Date d = new SimpleDateFormat("yyyy,mm,dd").parse(strTime);
			
			//该日历就是2008 8 8 的日历了
			c.setTime(d);
			
			System.out.println(c.get(Calendar.DAY_OF_WEEK));
			System.out.println(c.get(Calendar.DAY_OF_MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
