import java.util.*;

/*
 * Arrays��sun�ṩ��һ��������
 * java.util.Arrays;
 * �ù�������Ҫ��Ե����������
 * ���򣬶��ֲ���
 */
public class Arraytest {
	public static void main(String argv[]){
		int[] a = {3,1,6,2,5};
		//����
		Arrays.sort(a);
		//���
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		//������֮������ݽ��ж��ֲ���
		int index = Arrays.binarySearch(a, 5);
		System.out.println("�±�:"+index);
	}
}
