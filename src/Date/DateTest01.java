package Date;
/*
 * 获取1970年1月1日  00时00分00秒000毫秒   到当前的毫秒数
 * 
 * 1000毫秒  = 1 秒
 */
public class DateTest01 {
	
	public static void main(String[] args){
		long now = System.currentTimeMillis();
		System.out.println(now);//1343721481578
	}
}
