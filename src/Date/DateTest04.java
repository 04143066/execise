package Date;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date d = new Date(); 获取当前系统时间
 * Date d = new Date(long millis);
 *
 */
public class DateTest04 {

	public static void main(String argv[]){
		
		//1000是自1970-1-1 00:00:00之后1000毫秒的 时间
		Date t1 = new Date(1000);
		//Date --> String
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd HH:mm:ss SSS");
		System.out.println(sdf.format(t1));
		
		//获取当前系统时间的前10分钟
		Date t2 = new Date(System.currentTimeMillis() - 1000*60*10);
		System.out.println(sdf.format(t2));
		System.out.println(sdf.format(new Date()));
	}
}
