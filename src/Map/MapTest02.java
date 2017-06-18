package Map;

import java.util.Properties;

/*
 * HashMap 默认初始化容量是16，默认加载因子0.75
 * HashTable 默认初始化容量是11，默认加载因子是0.75
 */
public class MapTest02 {

	public static void main(String[] args) {
		// 1.创建属性类对象
		Properties p = new Properties();
		
		//2.存,key 重复也是覆盖之前的value值
		p.setProperty("driver", "faiej;lkajsf");
		p.setProperty("adfa", "faoih");
		
		//3.取
		String str1 = p.getProperty("driver");
		String str2 = p.getProperty("adfa");
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
