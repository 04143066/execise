/*
 * ʹ��String��ʱ������ע������⣺
 * 	 ������Ҫ���ַ�����Ƶ��ƴ�Ӳ�������Ϊ�ַ���һ���������󲻿ɸı䣬ֻҪƵ����ƴ�ӣ�
 *   �ͻ����ַ����������д����������ַ��������������մ������⡣ 
 */
public class StringTest04 {
	
	public static void main(String argv[]){
	
		String[] ins = {"sport","music","food","sleep"};
		//Ҫ���������Ȥ����ƴ�ӳ�һ���ַ���"sport,music,food,sleep"
		String temp = "";
		for(int i=0; i<ins.length; i++){
			if(i==ins.length-1)
				temp += ins[i];
			else
				temp += ins[i] + ",";
		}
		System.out.println(temp);
	}
}
