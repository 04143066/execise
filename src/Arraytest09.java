/*
	��ά������ص㣺
	1.��ά������һ�������һά���顣
	2.�����һά���飬���������һά������ÿ��Ԫ������һ��һά����
*/

public class Arraytest09{
	
	public static void main(String argv[]){
		//��̬��ʼ����ά����
		int[][] a= {
			{1,2,3},
			{45,34},
			{0},
			{10,23,85,99}
		};
		//������������ж��ٸ�һά����
		System.out.println(a.length+"��һά����");

		//��ȡ��һ��һά����
		int[] a0 =a[0];
		int a00 =a0[0];
		//��ȡ��һ��һά����ĵ�һ��Ԫ��
		System.out.println(a00);
		System.out.println(a[0][0]);

		//��ȡһ��һά�����е����һ��Ԫ��
		System.out.println(a[3][3]);
		System.out.println(a[a.length-1][a[a.length-1].length-1]);

		//������ά����
		for(int i=0; i<a.length; i++){
			//��һά����a[i]���б���
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}