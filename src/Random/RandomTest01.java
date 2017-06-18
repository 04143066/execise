package Random;

import java.util.Random;

/*
 * 生成随机数
 */
public class RandomTest01 {

	public static void main(String argv[]) {

		// 创建一个随机数生成器
		Random r = new Random();
		// 生成int型随机数
		int i = r.nextInt(2);
		System.out.println(i);
	}
}
