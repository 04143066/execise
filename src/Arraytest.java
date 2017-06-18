import java.util.*;

/*
 * Arrays是sun提供的一个工具类
 * java.util.Arrays;
 * 该工具类主要针对的是数组操作
 * 排序，二分查找
 */
public class Arraytest {
	public static void main(String argv[]){
		int[] a = {3,1,6,2,5};
		//排序
		Arrays.sort(a);
		//输出
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		//对排序之后的数据进行二分查找
		int index = Arrays.binarySearch(a, 5);
		System.out.println("下标:"+index);
	}
}
