package Number;
import java.text.DecimalFormat;

/*
 * 关于数字格式化:
 * 	java.text.DecimalFormat；
 *  数字格式元素：
 *  	#  任意数字
 *  	，     千分位
 *  	.  小数点
 *  	0  不够补零
 */
public class NumberTest01 {

	public static void main(String[] args){
		//创建数字格式对象
		//需求：加入千分位
		DecimalFormat df = new DecimalFormat("###,###");
		
		//开始格式化
		//Number -->String
		System.out.println(df.format(1234567));
		
		//需求：加入千分位  保留两位小数
		DecimalFormat df1 = new DecimalFormat("###,###.##");
		System.out.println(df1.format(1234567.123));
		
		//需求：加入千分位  保留两位小数  不够补零
		DecimalFormat df2 = new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.123));
	}
}
