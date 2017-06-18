package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取特定的时间
 */
public class DateTest03 {

	public static void main(String[] argv){
		String strTime = "2008年08月08日  08:08:08 888";
		//将String日期转换成日期类型Date
		//String --> Date
		
		//1.创建日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss SSS");
		
		//将字符串转换成日期类型
		try {
			Date date = sdf.parse(strTime);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
