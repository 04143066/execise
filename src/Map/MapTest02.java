package Map;

import java.util.Properties;

/*
 * HashMap Ĭ�ϳ�ʼ��������16��Ĭ�ϼ�������0.75
 * HashTable Ĭ�ϳ�ʼ��������11��Ĭ�ϼ���������0.75
 */
public class MapTest02 {

	public static void main(String[] args) {
		// 1.�������������
		Properties p = new Properties();
		
		//2.��,key �ظ�Ҳ�Ǹ���֮ǰ��valueֵ
		p.setProperty("driver", "faiej;lkajsf");
		p.setProperty("adfa", "faoih");
		
		//3.ȡ
		String str1 = p.getProperty("driver");
		String str2 = p.getProperty("adfa");
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
