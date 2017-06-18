package Random;
/*
 * 生成p[1,5]五个不重复随机数
 */
import java.util.Random;

public class RandomTest02 {

	public static void main(String argv[]){
		Random r = new Random();
		int[] a = new int[5];
		int temp = -1,j = 0;
	
		while(j<5){
			temp = r.nextInt(6);
			if(temp !=0 && !contains(a,temp)){
				a[j] = temp;
				j++;		
				System.out.println(temp);
			}	
		}	
	}
	public static boolean contains(int[] a,int temp){
		for(int i=0; i<a.length; i++){
			if(a[i]==temp)
				return true;
		}
		return false;
	}
}
