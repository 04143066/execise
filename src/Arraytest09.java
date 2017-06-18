/*
	二维数组的特点：
	1.二维数组是一个特殊的一维数组。
	2.特殊的一维数组，特殊在这个一维数组中每个元素又是一个一维数组
*/

public class Arraytest09{
	
	public static void main(String argv[]){
		//静态初始化二维数组
		int[][] a= {
			{1,2,3},
			{45,34},
			{0},
			{10,23,85,99}
		};
		//以上这个数组有多少个一维数组
		System.out.println(a.length+"个一维数组");

		//获取第一个一维数组
		int[] a0 =a[0];
		int a00 =a0[0];
		//获取第一个一维数组的第一个元素
		System.out.println(a00);
		System.out.println(a[0][0]);

		//获取一个一维数组中的最后一个元素
		System.out.println(a[3][3]);
		System.out.println(a[a.length-1][a[a.length-1].length-1]);

		//遍历二维数组
		for(int i=0; i<a.length; i++){
			//对一维数组a[i]进行遍历
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}