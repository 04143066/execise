package Date;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取系统当前时间
 */
public class DateTest02 {

	public static void main(String argv[]){
		//获取系统当前时间
		Date nowTime = new Date();
		System.out.println(nowTime);//  Sun May 08 22:29:02 CST 2016
		
		//以上程序说明java.util.Date; 已经重写了Object中的toString方法
		
		//java.util.Data; --> String 格式化日期
		
		/*
		 * 日期格式：y年 M月 d日 H小时 m分 s秒 S毫秒
		 */
		
		//1.创建日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		
		//2.开始格式化
		String strTime = sdf.format(nowTime);
		System.out.println(strTime);
	}
}
