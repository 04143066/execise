/*
	���ڶ�ά����Ķ�̬��ʼ��
*/

public class Arraytest10
{
	public static void main(String[] args){
		//3��һά����
		//ÿ��һά��������4��Ԫ��
		
		int[][] a = new int[3][4];

		//����
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		a[1][2] =3;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}