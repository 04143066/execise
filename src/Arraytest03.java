/*
	��̬��ʼ��һά����
	1.��̬����һά���飬�����ڶ��ڴ��з���������飬����������ÿһ��Ԫ�ض�����Ĭ��ֵ
	byte,short,int,long 0
	float double 0.0
	boolean false
	char /u0000
	���� null
*/

public class Arraytest03{

	public static void main(String[] args){
		//��̬����һ��int�͵����飬�����Դ洢4��Ԫ��
		int[] a1 = new int[4];

		//����
		for(int i=0; i<a1.length; i++){
			System.out.println(a1[i]);
		}
		//��ֵ
		a1[0] = 2;
		a1[1] = 3;
		a1[2] = 3;

		//�������͵�����
		Object[] objs = new Object[3];
		for(int index=0; index<objs.length; index++){
			Object o = objs[index];
			//o.tostring(); //ע��������쳣����Ϊ�������͵�Ĭ��ֵ��null
			System.out.println(o);
		}
	}
}

/*
	public void println(Object x){
		Strings = String.valueOf(x);
		synchronized(this){
			print(s);
			newLine();
		}
	}


	public static String valueOf(object obj){
		return (obj == null) ? "null":obj.toString();
	}
*/