
public class Arraytest11
{
	public static void main(String argv[]){
		m1(new int[][] {{1,23,4},{5,6,7,8},{10,9}});
	}

	public static void m1(int[][] a){
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