import java.util.Scanner;

public class Main {
	public static void main(String argv[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] array = str.split(" ");
		int max=0;
		String strMax="";
		int[] a = new int[array.length];
		for(int i=0; i<array.length;i++){
			for(int j = 0; j<array.length; j++){
				if(array[i].equals(array[j])){
					a[i]++;
				}
			}
			if(max<a[i]){
				max = a[i];
				strMax=array[i];
			}
		}
		System.out.println(strMax);
		System.out.println(max);
	}
}
