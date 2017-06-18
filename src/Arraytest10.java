/*
	关于二维数组的动态初始化
*/

public class Arraytest10
{
	public static void main(String[] args){
		//3个一维数组
		//每个一维数组中有4个元素
		
		int[][] a = new int[3][4];

		//遍历
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