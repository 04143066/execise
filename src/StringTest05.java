/*
 * �����ַ������õķ���
 */
public class StringTest05 {
	
	//���õĹ��췽��
	public static void main(String argv[]){
		String s1 = "abc";
		
		String s2 = new String("abc");
		
		byte[] bytes = {97,98,99,100};
		String s3 = new String(bytes);
		System.out.println(s3);//println���������һ���������ͣ���ֱ�ӵ���object��toString������Ȼ��String��д��toString����
		
		String s4 = new String(bytes,1,2);
		System.out.println(s4);
		
		char[] c1={'��','��','��','��','��'};
		String s5 = new String(c1);
		System.out.println(s5);//�����й���
		
		String s6 = new String(c1,2,2);
		System.out.println(s6);//�й�
	}
}
