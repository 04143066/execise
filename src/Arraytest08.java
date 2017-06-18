/*
	关于数组的拷贝

*/

public class Arraytest08{

	public static void main(String[] args){
		
		int[] src = {1,2,3,4,5};
		
		int[] des = {23,34,45,32,94};

		System.arraycopy(src,2,des,3,3);
		
		for(int i=0; i<des.length; i++){
			
			System.out.println(des[i]);
			
		}
		for(int i=0; i<src.length; i++){
			
			System.out.println(src[i]);
		}
	}
}