package Random;

import java.util.Random;

/*
 * ���������
 */
public class RandomTest01 {

	public static void main(String argv[]) {

		// ����һ�������������
		Random r = new Random();
		// ����int�������
		int i = r.nextInt(2);
		System.out.println(i);
	}
}
